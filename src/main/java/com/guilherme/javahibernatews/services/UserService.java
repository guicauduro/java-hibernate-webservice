package com.guilherme.javahibernatews.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.javahibernatews.entities.User;
import com.guilherme.javahibernatews.repositories.UserRepository;


// Component registration (330)
// Quando voce necessita utilizar a injecao de dependencia (Autowired),
// eh necessario registrar a classe como um componente:
// (Component, Service, Repository)

@Service
public class UserService {
	
	// Service se comunica apenas com o repository,
	// UserService precisa de uma dependencia para UserRepository.
	// Autowired para que o spring faça a injecao de dependencia (330)

	@Autowired
	private UserRepository repository;
	
	// Metodos
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
}
