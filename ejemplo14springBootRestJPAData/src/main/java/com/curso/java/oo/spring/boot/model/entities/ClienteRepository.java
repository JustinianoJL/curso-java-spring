package com.curso.java.oo.spring.boot.model.entities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>
{
	//Code
}