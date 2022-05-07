package com.guilherme.javahibernatews.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.javahibernatews.entities.Order;
import com.guilherme.javahibernatews.repositories.OrderRepository;


// Component registration (330)
// Quando voce necessita utilizar a injecao de dependencia (Autowired),
// eh necessario registrar a classe como um componente:
// (Component, Service, Repository)

@Service
public class OrderService {
	
	// Service se comunica apenas com o repository,
	// OrderService precisa de uma dependencia para OrderRepository.
	// Autowired para que o spring faça a injecao de dependencia (330)

	@Autowired
	private OrderRepository repository;
	
	// Metodos
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
