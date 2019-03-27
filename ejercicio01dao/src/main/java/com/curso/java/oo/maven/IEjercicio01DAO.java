package com.curso.java.oo.maven;

import java.util.Collection;
import com.curso.java.oo.ejercicio01oo.model.Aula;

public interface IEjercicio01DAO 
{
	void createAula(Aula aula);
	Collection<Aula> getAulas();
	void updateAula(Aula aula);
	void deleteAula(Aula aula);
	Aula getAula(String nombreAula);
}
