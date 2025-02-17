package com.axity.test.product.services;

import com.axity.test.product.repository.ProductRepository;
import com.axity.test.product.repository.datamodel.ProductEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductService {
    private ProductRepository productRepository;

    @GetMapping("/getProducts")
    public List<ProductEntity> getProducts() {
        return productRepository.findAll();
    }

    @PostMapping("/createProduct")
    public ProductEntity addProduct(@RequestBody ProductEntity product) {
        return productRepository.save(product);
    }

    @PutMapping("/updateProduct/{id_product}")
    public ProductEntity updateProduct(@PathVariable int id_product, @RequestBody ProductEntity product) {
        return productRepository.save(product);
    }

    @DeleteMapping("/deleteProduct/{id_product}")
    public void deleteProduct(@PathVariable int id_product) {
        productRepository.deleteById(id_product);
    }
}
