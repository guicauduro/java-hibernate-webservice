package com.guilherme.javahibernatews.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.javahibernatews.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
