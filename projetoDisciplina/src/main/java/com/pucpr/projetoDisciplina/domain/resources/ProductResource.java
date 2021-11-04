package com.pucpr.projetoDisciplina.domain.resources;

import com.pucpr.projetoDisciplina.domain.dtos.ProductWithQuantity;
import com.pucpr.projetoDisciplina.domain.dtos.RegisterProductDto;
import com.pucpr.projetoDisciplina.domain.entities.Product;
import com.pucpr.projetoDisciplina.domain.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProductResource {

    private final ProductService productService;

    public ProductResource(ProductService productService) {
        this.productService = productService;
    }

    // @GetMapping
    // public List<Product> listAllProducts() {
    // return productRepository.findAll();
    // }

    @GetMapping
    public List<ProductWithQuantity> listAllProductsWithQuantity() {
        return productService.listAllWithQuantity();
    }

    @GetMapping("/test")
    public ResponseEntity<String> createTestProduct() {
        productService.createTestProducts();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public Product getProductbyId(@PathVariable String id) {
        return productService.getById(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody RegisterProductDto product) {
        return productService.saveProduct(product);
    }
}
