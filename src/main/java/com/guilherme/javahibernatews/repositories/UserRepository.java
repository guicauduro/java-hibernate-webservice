package com.guilherme.javahibernatews.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.javahibernatews.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
