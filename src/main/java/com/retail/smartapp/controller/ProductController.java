package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.retail.smartapp.model.Product;
import com.retail.smartapp.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // GET - Get All Products
    @GetMapping
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    // GET - Get Product By ID
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    // POST - Create Product
    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productService.CreateProduct(product);
    }

    // PUT - Update Product
    @PutMapping("/{id}")
    public Product updateProduct(
            @PathVariable Long id,
            @RequestBody Product product) {

        return productService.updateProduct(id, product);
    }

    // DELETE - Delete Product
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "Product Deleted Successfully";
    }
}