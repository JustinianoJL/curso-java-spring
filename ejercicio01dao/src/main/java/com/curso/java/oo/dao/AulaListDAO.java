package com.curso.java.oo.dao;

import java.util.Collection;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.curso.java.oo.modelo.Aula;

@Component
@Scope("singleton")
public class AulaListDAO implements IEjercicio01DAO
{
	
	@Autowired
	@Qualifier("miSet")
	private Set<Aula> listaDeAulas;

	public void createAula(Aula aula)
	{
		listaDeAulas.add(aula);
	}

	public Collection<Aula> getAulas()
	{
		return listaDeAulas;
	}

	public void updateAula(String nombreAula, Aula aula)
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
		for (Aula a : listaDeAulas)
		{
			if (a.getNombre().equals(nombreAula))
			{
				aux = a;
				break;
			}
		}
		return aux;
	}
}