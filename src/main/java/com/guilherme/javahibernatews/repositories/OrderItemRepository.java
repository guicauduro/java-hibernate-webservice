package com.guilherme.javahibernatews.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.javahibernatews.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
