package com.curso.java.oo.maven;

import java.util.Collection;
import java.util.List;

import com.curso.java.oo.maven.IEjercicio01DAO;
import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Profesor;

public class AulasLN
{
	private
	IEjercicio01DAO ejercicio01DAO;
	
	public void agregarNuevaAula(Aula aula)
	{
		/*
		for (Aula aula : aulas)
		{
			ejercicio01DAO.createAula(aula);
		}*/
	}
	
	/*public List<Alumno> listaDeAlumnosPorAula(Aula aula)
	{
		//sdfsfsd
	}
	
	public List<Profesor> listaDeProfesoresPorAula(Aula aula)
	{
		//dfghdfgd
	}
	
	public void asignarAlumnoPorAula(Aula aula, Alumno alumno)
	{
		//sdfgdfg
	}
	*/
	public void eliminarAula(Aula aula)
	{
		ejercicio01DAO.deleteAula(aula);
	}
}
