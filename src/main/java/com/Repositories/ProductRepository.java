package com.Repositories;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Page<Product>findAll(Pageable pageable);
}
