package com.pucpr.projetodisciplina.domain.services;

import com.pucpr.projetodisciplina.domain.dtos.ProductResponseDto;
import com.pucpr.projetodisciplina.domain.dtos.ProductWithQuantityDTO;
import com.pucpr.projetodisciplina.domain.dtos.RegisterProductDto;
import com.pucpr.projetodisciplina.domain.entities.Product;
import com.pucpr.projetodisciplina.domain.repositories.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    private final SellerRepository sellerRepository;

    private final AddressRepository addressRepository;

    private final CityRepository cityRepository;

    private final StateRepository stateRepository;

    private final CountryRepository countryRepository;

    public ProductService(ProductRepository productRepository, SellerRepository sellerRepository,
                          AddressRepository addressRepository, CityRepository cityRepository,
                          StateRepository stateRepository, CountryRepository countryRepository) {
        this.productRepository = productRepository;
        this.sellerRepository = sellerRepository;
        this.addressRepository = addressRepository;
        this.cityRepository = cityRepository;
        this.stateRepository = stateRepository;
        this.countryRepository = countryRepository;
    }

    public Product saveProduct(RegisterProductDto product) {
        Product newProduct = product.createProduct(sellerRepository, addressRepository,
                cityRepository, stateRepository, countryRepository);
        productRepository.save(newProduct);
        return newProduct;
    }

    public ResponseEntity<Product> editProduct(Long id, RegisterProductDto product) {
        Product newProduct = product.createProduct(sellerRepository, addressRepository,
                cityRepository, stateRepository, countryRepository);

        Optional<Product> po = productRepository.findById(id);

        if (po.isPresent()) {
            newProduct.setId(id);
            productRepository.save(newProduct);
            return new ResponseEntity<>(newProduct, HttpStatus.OK);
        } else {
            productRepository.save(newProduct);
            return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
        }
    }

    public List<ProductWithQuantityDTO> getAllWithQuantity() {
        List<ProductWithQuantityDTO> productsList = new ArrayList<>();
        productRepository.findAll().forEach(product -> productsList
                .add(new ProductWithQuantityDTO(product.getTitle(), product.getAvailable_quantity())));
        return productsList;
    }

    public List<ProductResponseDto> getAll() {
        List<ProductResponseDto> productsList = new ArrayList<>();
        productRepository.findAll().forEach(product -> productsList.add(new ProductResponseDto(product)));
        return productsList;
    }

    public ProductResponseDto getById(Long id) {
        return new ProductResponseDto(productRepository.getById(id));
    }

    public ResponseEntity<String> deleteById(Long id) {
        productRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
