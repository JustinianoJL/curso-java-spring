package com.curso.java.oo.dao;

import java.util.Collection;

import com.curso.java.oo.modelo.Aula;

public interface IEjercicio01DAO 
{
	void createAula(Aula aula);
	Collection<Aula> getAulas();
	void updateAula(String nombreAula, Aula aula);
	void deleteAula(String nombreAula);
	Aula getAula(String nombreAula);
}
