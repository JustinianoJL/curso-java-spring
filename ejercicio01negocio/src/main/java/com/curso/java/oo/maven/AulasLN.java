package com.curso.java.oo.maven;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

public class AulasLN
{
	IEjercicio01DAO ejercicio01DAO;
	
	
	public AulasLN(IEjercicio01DAO ejercicio01dao)
	{
		super();
		ejercicio01DAO = ejercicio01dao;
	}

	public void agregarNuevaAula(String nombre, Boolean pizarra, Boolean proyector, Set<PuestoDeTrabajo> puestosDeTrabajo)
	{
		ejercicio01DAO.createAula(new Aula(nombre, pizarra, proyector, puestosDeTrabajo));
	}
	
	public List<Alumno> listaDeAlumnosPorAula(String nombreAula)
	{
		Aula aulaAux = ejercicio01DAO.getAula(nombreAula);
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		for (PuestoDeTrabajo puestoTrabajo : aulaAux.getPuestosDeTrabajo())
		{
			if (puestoTrabajo.getPersona() instanceof Alumno)
			{
				listaAlumnos.add((Alumno) puestoTrabajo.getPersona());
			}
		}
		return listaAlumnos;
	}
	
	public List<Profesor> listaDeProfesoresPorAula(String nombreAula)
	{
		Aula aulaAux = ejercicio01DAO.getAula(nombreAula);
		List<Profesor> listaProfesores = new ArrayList<Profesor>();
		for (PuestoDeTrabajo puestoTrabajo : aulaAux.getPuestosDeTrabajo())
		{
			if (puestoTrabajo.getPersona() instanceof Profesor)
			{
				listaProfesores.add((Profesor) puestoTrabajo.getPersona());
			}
		}
		return listaProfesores;
	}
	
	public void asignarAlumnoPorAula(String nombreDeAula, Alumno alumno)
	{
		Aula aulaAux;
		aulaAux = ejercicio01DAO.getAula(nombreDeAula);
		
		for (PuestoDeTrabajo puestoTrabajo : aulaAux.getPuestosDeTrabajo())
		{
			if (puestoTrabajo.getPersona() == null)
			{
				puestoTrabajo.setPersona(alumno);
				break;
			}
		}//Recorrer los puestos y cuando haya un puesto libre, meter el alumno
		ejercicio01DAO.updateAula(nombreDeAula, aulaAux); //Actualizar aula
	}
	
	public void eliminarAula(String nombre)
	{
		ejercicio01DAO.deleteAula(nombre);
	}
}
