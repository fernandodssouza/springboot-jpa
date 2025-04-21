package com.myProjects.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProjects.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
