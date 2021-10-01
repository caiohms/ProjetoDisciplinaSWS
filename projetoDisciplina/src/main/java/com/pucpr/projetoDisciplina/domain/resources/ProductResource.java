package com.pucpr.projetoDisciplina.domain.resources;

import com.pucpr.projetoDisciplina.domain.dtos.ProductWithQuantity;
import com.pucpr.projetoDisciplina.domain.entities.Product;
import com.pucpr.projetoDisciplina.domain.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProductResource {

    @Autowired
    private ProductRepository productRepository;

//    @GetMapping
//    public List<Product> listAllProducts() {
//        return productRepository.findAll();
//    }

    @GetMapping
    public List<ProductWithQuantity> listAllProductsWithQuantity() {
        List<ProductWithQuantity> productsList = new ArrayList<>();
        productRepository.findAll().forEach(product -> productsList.add(new ProductWithQuantity(product.getTitle(), product.getAvailable_quantity())));
        return productsList;
    }

    @GetMapping("/test")
    public void createTestProduct() {
        productRepository.saveAll(List.of(
                new Product("TEST1", "Coca-cola", 1),
                new Product("TEST2", "Pepsi", 2)));
    }

    @GetMapping("/{id}")
    public Product getProductbyId(@PathVariable String id) {
        return productRepository.getById(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
