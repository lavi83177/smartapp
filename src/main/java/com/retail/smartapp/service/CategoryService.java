package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.Category;
import com.retail.smartapp.model.CustomerProfile;
import com.retail.smartapp.repo.CategoryRepo;
import com.retail.smartapp.repo.CustomerProfileRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {
	@Autowired
	private CategoryRepo categoryRepo;
	public List<Category> getAllCategory(){
		return categoryRepo.findAll();
	}
	public Optional<Category> getCategoryById(Long id){
		return categoryRepo.findById(id);
	}
	public Category CreateCategory(Category category) {
		return categoryRepo.save(category);
	}
	public void deleteCategory(Long id) {
		categoryRepo.deleteById(id);
	}
}