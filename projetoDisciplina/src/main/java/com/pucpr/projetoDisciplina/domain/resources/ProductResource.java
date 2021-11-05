package com.pucpr.projetoDisciplina.domain.resources;

import com.pucpr.projetoDisciplina.domain.dtos.ProductResponseDto;
import com.pucpr.projetoDisciplina.domain.dtos.ProductWithQuantity;
import com.pucpr.projetoDisciplina.domain.dtos.RegisterProductDto;
import com.pucpr.projetoDisciplina.domain.entities.Product;
import com.pucpr.projetoDisciplina.domain.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProductResource {

    private final ProductService productService;

    public ProductResource(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductResponseDto> listAllProducts() {
        return productService.getAll();
    }

    @GetMapping("/quantidades")
    public List<ProductWithQuantity> listAllProductsWithQuantity() {
        return productService.getAllWithQuantity();
    }

    @GetMapping("/test")
    public ResponseEntity<String> createTestProduct() {
        productService.createTestProducts();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ProductResponseDto getProductbyId(@PathVariable Long id) {
        return productService.getById(id);
    }

    @PostMapping
    public ProductResponseDto addProduct(@RequestBody RegisterProductDto product) {
        Product newProduct = productService.saveProduct(product);
        return new ProductResponseDto(newProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        return productService.deleteById(id);
    }
}
