package com.myProjects.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProjects.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
