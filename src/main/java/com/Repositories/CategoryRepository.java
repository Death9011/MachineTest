package com.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
