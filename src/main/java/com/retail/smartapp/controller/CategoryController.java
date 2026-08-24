package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.retail.smartapp.model.Category;
import com.retail.smartapp.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // GET - Get All Categories
    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategory();
    }

    // GET - Get Category By ID
    @GetMapping("/{id}")
    public Optional<Category> getCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }

    // POST - Create Category
    @PostMapping
    public Category saveCategory(@RequestBody Category category) {
        return categoryService.CreateCategory(category);
    }

    // PUT - Update Category
    @PutMapping("/{id}")
    public Category updateCategory(
            @PathVariable Long id,
            @RequestBody Category category) {

        return categoryService.updateCategory(id, category);
    }

    // DELETE - Delete Category
    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        return "Category Deleted Successfully";
    }
}