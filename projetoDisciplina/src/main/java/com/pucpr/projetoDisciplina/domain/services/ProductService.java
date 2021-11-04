package com.pucpr.projetoDisciplina.domain.services;

import com.pucpr.projetoDisciplina.domain.dtos.ProductWithQuantity;
import com.pucpr.projetoDisciplina.domain.dtos.RegisterProductDto;
import com.pucpr.projetoDisciplina.domain.entities.Product;
import com.pucpr.projetoDisciplina.domain.repositories.AddressRepository;
import com.pucpr.projetoDisciplina.domain.repositories.ProductRepository;
import com.pucpr.projetoDisciplina.domain.repositories.SellerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    private final SellerRepository sellerRepository;

    private final AddressRepository addressRepository;

    public ProductService(ProductRepository productRepository, SellerRepository sellerRepository,
                          AddressRepository addressRepository) {
        this.productRepository = productRepository;
        this.sellerRepository = sellerRepository;
        this.addressRepository = addressRepository;
    }

    public Product saveProduct(RegisterProductDto product) {
        Product newProduct = product.createProduct(productRepository, sellerRepository, addressRepository);
        productRepository.save(newProduct);
        return newProduct;
    }

    public void createTestProducts() {
        productRepository.saveAll(List.of(new Product(1L, "Coca-cola", 1), new Product(2L, "Pepsi", 2)));
    }

    public List<ProductWithQuantity> listAllWithQuantity() {
        List<ProductWithQuantity> productsList = new ArrayList<>();
        productRepository.findAll().forEach(product -> productsList
                .add(new ProductWithQuantity(product.getTitle(), product.getAvailable_quantity())));
        return productsList;
    }

    public Product getById(String id) {
        return productRepository.getById(id);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }
}
