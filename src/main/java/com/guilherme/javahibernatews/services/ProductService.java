package com.guilherme.javahibernatews.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.javahibernatews.entities.Product;
import com.guilherme.javahibernatews.repositories.ProductRepository;


// Component registration (330)
// Quando voce necessita utilizar a injecao de dependencia (Autowired),
// eh necessario registrar a classe como um componente:
// (Component, Service, Repository)

@Service
public class ProductService {
	
	// Service se comunica apenas com o repository,
	// ProductService precisa de uma dependencia para ProductRepository.
	// Autowired para que o spring faça a injecao de dependencia (330)

	@Autowired
	private ProductRepository repository;
	
	// Metodos
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
