package com.guilherme.javahibernatews.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.javahibernatews.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
