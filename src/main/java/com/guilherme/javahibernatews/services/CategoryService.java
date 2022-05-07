package com.guilherme.javahibernatews.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.javahibernatews.entities.Category;
import com.guilherme.javahibernatews.repositories.CategoryRepository;


// Component registration (330)
// Quando voce necessita utilizar a injecao de dependencia (Autowired),
// eh necessario registrar a classe como um componente:
// (Component, Service, Repository)

@Service
public class CategoryService {
	
	// Service se comunica apenas com o repository,
	// CategoryService precisa de uma dependencia para CategoryRepository.
	// Autowired para que o spring faça a injecao de dependencia (330)

	@Autowired
	private CategoryRepository repository;
	
	// Metodos
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}
