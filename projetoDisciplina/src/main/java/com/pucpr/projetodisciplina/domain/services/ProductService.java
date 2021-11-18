package com.pucpr.projetodisciplina.domain.services;

import com.pucpr.projetodisciplina.domain.dtos.ProductResponseDto;
import com.pucpr.projetodisciplina.domain.dtos.ProductWithQuantity;
import com.pucpr.projetodisciplina.domain.dtos.RegisterProductDto;
import com.pucpr.projetodisciplina.domain.entities.Product;
import com.pucpr.projetodisciplina.domain.repositories.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public void createTestProducts() {
        productRepository.saveAll(List.of(
                new Product(1L, "Coca-cola", 1),
                new Product(2L, "Pepsi", 2))
        );
    }

    public List<ProductWithQuantity> getAllWithQuantity() {
        List<ProductWithQuantity> productsList = new ArrayList<>();
        productRepository.findAll().forEach(product -> productsList
                .add(new ProductWithQuantity(product.getTitle(), product.getAvailable_quantity())));
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

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public ResponseEntity<String> deleteById(Long id) {
        productRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
