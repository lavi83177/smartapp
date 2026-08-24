package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.Category;
import com.retail.smartapp.repo.CategoryRepo;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    // GET - Get All Categories
    public List<Category> getAllCategory() {
        return categoryRepo.findAll();
    }

    // GET - Get Category By ID
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepo.findById(id);
    }

    // POST - Create Category
    public Category CreateCategory(Category category) {
        return categoryRepo.save(category);
    }

    // PUT - Update Category
    public Category updateCategory(Long id, Category category) {

        Category existingCategory = categoryRepo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Category not found with id: " + id));

        // Update Category fields here
        // Example:
        // existingCategory.setCategoryName(category.getCategoryName());

        return categoryRepo.save(existingCategory);
    }

    // DELETE - Delete Category
    public void deleteCategory(Long id) {
        categoryRepo.deleteById(id);
    }
}