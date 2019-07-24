package com.moraes.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moraes.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
