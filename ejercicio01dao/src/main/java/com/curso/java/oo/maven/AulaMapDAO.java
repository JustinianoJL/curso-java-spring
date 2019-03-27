package com.curso.java.oo.maven;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class AulaMapDAO implements IEjercicio01DAO
{
	private
	Map<String, Aula> mapaAula = new HashMap<String, Aula>();

	public void createAula(Aula aula)
	{
		mapaAula.put(aula.getNombre(), aula);
	}

	public Collection<Aula> getAulas()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void updateAula(Aula aula)
	{
		// TODO Auto-generated method stub	
	}

	public void deleteAula(Aula aula)
	{
		
	}

	public Aula getAula(String nombreAula)
	{
		mapaAula.get(aula.getNombre());
		return null;
	}
	
}
