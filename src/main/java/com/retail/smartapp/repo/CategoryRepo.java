package com.retail.smartapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.smartapp.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

}
