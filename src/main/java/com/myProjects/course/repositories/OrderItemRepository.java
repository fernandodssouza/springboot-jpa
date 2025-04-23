package com.myProjects.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProjects.course.entities.OrderItem;
import com.myProjects.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
