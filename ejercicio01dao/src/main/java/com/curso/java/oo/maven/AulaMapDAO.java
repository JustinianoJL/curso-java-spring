package com.curso.java.oo.maven;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.curso.java.oo.model.Aula;

public class AulaMapDAO implements IEjercicio01DAO
{
	private
	Map<String, Aula> mapaAula = new HashMap<String, Aula>();

	public void createAula(Aula aula)
	{
		mapaAula.put(aula.getNombre(), aula);
		System.out.println("Aula " + aula.getNombre() + " agregada");
	}

	public Collection<Aula> getAulas()
	{
		return mapaAula.values();
	}

	public void updateAula(String nombreAula, Aula aula)
	{
		mapaAula.put(nombreAula, aula);	
	}

	public void deleteAula(String nombreAula)
	{
		mapaAula.remove(nombreAula);
	}

	public Aula getAula(String nombreAula)
	{
		return mapaAula.get(nombreAula);
	}

	public void updateAula(Aula aula)
	{
		// TODO Auto-generated method stub
	}	
}