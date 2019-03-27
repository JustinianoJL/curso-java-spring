package com.curso.java.oo.maven;

import java.util.Collection;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class AulaListDAO implements IEjercicio01DAO
{
	private
		Set<Aula> listaDeAulas;

	public void createAula(Aula aula)
	{
		listaDeAulas.add(aula);
		System.out.println("Aula " + aula.getNombre() + " agregada");
	}

	public Collection<Aula> getAulas()
	{
		return listaDeAulas;
	}

	public void updateAula(Aula aula)
	{
		for (Aula a : listaDeAulas)
		{
			if(a.getNombre().equals(aula.getNombre()))
			{
				listaDeAulas.
				break;
			}
		}
	}

	public void deleteAula(Aula aula)
	{
		listaDeAulas.remove(aula);
	}

	public Aula getAula(String nombreAula)
	{
		Aula aux = new Aula();
		for (Aula a : listaDeAulas)
		{
			if(a.getNombre().equals(nombreAula))
			{
				aux = a;
				break;
			}
		}
		return aux;
	}
}
