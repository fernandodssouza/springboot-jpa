package com.myProjects.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProjects.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
