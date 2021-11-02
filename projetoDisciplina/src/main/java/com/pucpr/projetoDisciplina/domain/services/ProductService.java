package com.pucpr.projetoDisciplina.domain.services;

import com.pucpr.projetoDisciplina.domain.dtos.ProductDTO;
import com.pucpr.projetoDisciplina.domain.dtos.ProductWithQuantity;
import com.pucpr.projetoDisciplina.domain.entities.Product;
import com.pucpr.projetoDisciplina.domain.repositories.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
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

    public List<ProductDTO> getAll() {
        List<ProductDTO> productsList = new ArrayList<>();
        productRepository.findAll().forEach(product -> productsList.add(new ProductDTO(product)));
        return productsList;
    }

    public Product getById(Long id) {
        return productRepository.getById(id);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public ResponseEntity<String> deleteById(Long id) {
        productRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
