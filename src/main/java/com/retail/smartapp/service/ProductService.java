package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.Product;
import com.retail.smartapp.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    // GET - Get All Products
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    // GET - Get Product By ID
    public Optional<Product> getProductById(Long id) {
        return productRepo.findById(id);
    }

    // POST - Create Product
    public Product CreateProduct(Product product) {
        return productRepo.save(product);
    }

    // PUT - Update Product
    public Product updateProduct(Long id, Product product) {

        Product existingProduct = productRepo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException(
                        "Product not found with id: " + id));

        existingProduct.setProductName(product.getProductName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setStockQuantity(product.getStockQuantity());
        existingProduct.setImageUrl(product.getImageUrl());
        existingProduct.setStatus(product.getStatus());

        return productRepo.save(existingProduct);
    }

    // DELETE - Delete Product
    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }
}