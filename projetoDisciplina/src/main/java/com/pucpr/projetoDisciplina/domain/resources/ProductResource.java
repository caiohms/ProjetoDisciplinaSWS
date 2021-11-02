package com.pucpr.projetoDisciplina.domain.resources;

import com.pucpr.projetoDisciplina.domain.dtos.ProductDTO;
import com.pucpr.projetoDisciplina.domain.dtos.ProductWithQuantity;
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

    @GetMapping("/all")
    public List<ProductDTO> listAllProducts() {
        return productService.getAll();
    }

    @GetMapping
    public List<ProductWithQuantity> listAllProductsWithQuantity() {
        return productService.getAllWithQuantity();
    }

    @GetMapping("/test")
    public ResponseEntity<String> createTestProduct() {
        productService.createTestProducts();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public Product getProductbyId(@PathVariable Long id) {
        return productService.getById(id);
    }

//    @PostMapping
//    public void addProduct(@RequestBody ProductDTO productDTO ) {
//       // return productService.saveProductDTO(productDTO);
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        return productService.deleteById(id);
    }
}
