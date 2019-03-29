package com.curso.java.oo.maven;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class AulaListDAO implements IEjercicio01DAO
{
	private Set<Aula> listaDeAulas = new HashSet<Aula>();

	public void createAula(Aula aula)
	{
		listaDeAulas.add(aula);
		System.out.println("Aula " + aula.getNombre() + " agregada");
	}

	public Collection<Aula> getAulas()
	{
		return listaDeAulas;
	}

	public void updateAula(String nombreAula,Aula aula)
	{
		for (Aula a : listaDeAulas)
		{
			if(a.getNombre().equals(nombreAula))
			{
				listaDeAulas.remove(aula);
				break;
			}
		}
		createAula(aula);
	}

	public void deleteAula(String nombreAula)
	{
		for (Aula a : listaDeAulas)
		{
			if(a.getNombre().equals(nombreAula))
			{
				listaDeAulas.remove(a);
				break;
			}
		}
	}

	public Aula getAula(String nombreAula)
	{
		Aula aux = new Aula();
		for (Aula a : listaDeAulas) {
			if (a.getNombre().equals(nombreAula))
			{
				aux = a;
				break;
			}
		}
		return aux;
	}
}
