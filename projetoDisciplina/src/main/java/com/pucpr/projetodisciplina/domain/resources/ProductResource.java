package com.pucpr.projetodisciplina.domain.resources;

import com.pucpr.projetodisciplina.domain.dtos.ProductResponseDto;
import com.pucpr.projetodisciplina.domain.dtos.ProductWithQuantityDTO;
import com.pucpr.projetodisciplina.domain.dtos.RegisterProductDto;
import com.pucpr.projetodisciplina.domain.entities.Product;
import com.pucpr.projetodisciplina.domain.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

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
    public List<ProductWithQuantityDTO> listAllProductsWithQuantity() {
        return productService.getAllWithQuantity();
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

    @PutMapping("/{id}")
    public ResponseEntity<ProductResponseDto> editProduct(@PathVariable Long id, @RequestBody RegisterProductDto product) {
        ResponseEntity<Product> editedProduct = productService.editProduct(id, product);
        return new ResponseEntity<>(
                new ProductResponseDto(Objects.requireNonNull(editedProduct.getBody())),
                editedProduct.getStatusCode());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        return productService.deleteById(id);
    }
}
