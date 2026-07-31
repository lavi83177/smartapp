package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.Product;
import com.retail.smartapp.model.SalesReport;
import com.retail.smartapp.repo.ProductRepo;
import com.retail.smartapp.repo.SalesReportRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	@Autowired
	private ProductRepo productRepo;
	public List<Product> getAllProduct(){
		return productRepo.findAll();
	}
	public Optional<Product> getProductById(Long id){
		return productRepo.findById(id);
	}
	public Product CreateProduct(Product product) {
		return productRepo.save(product);
	}
	public void deleteProduct(Long id) {
		productRepo.deleteById(id);
	}
	

}
