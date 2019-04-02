package com.curso.java.oo.maven;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.curso.java.oo.model.Alumno;
import com.curso.java.oo.model.Aula;
import com.curso.java.oo.model.Profesor;
import com.curso.java.oo.model.PuestoDeTrabajo;

@Component
@Scope("singleton")
public class AulasLN
{
	@Autowired
	@Qualifier("miDao")
	private IEjercicio01DAO ejercicio01DAO;
	
	public IEjercicio01DAO getEjercicio01DAO()
	{
		return ejercicio01DAO;
	}

	public void setEjercicio01DAO(IEjercicio01DAO ejercicio01dao)
	{
		ejercicio01DAO = ejercicio01dao;
	}

	public void agregarNuevaAula(String nombre, Boolean pizarra, Boolean proyector, Set<PuestoDeTrabajo> puestosDeTrabajo)
	{
		ejercicio01DAO.createAula(new Aula(nombre, pizarra, proyector, puestosDeTrabajo));
		System.out.println("Aula " + nombre + " agregada");
	}
	
	public List<Alumno> listaDeAlumnosPorAula(String nombreAula)
	{
		Aula aulaAux = ejercicio01DAO.getAula(nombreAula);
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		for (PuestoDeTrabajo puestoTrabajo : aulaAux.getPuestosDeTrabajo())
		{
			if (puestoTrabajo != null && puestoTrabajo.getPersona() instanceof Alumno)
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
			if (puestoTrabajo != null && puestoTrabajo.getPersona() instanceof Profesor)
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
		System.out.println("Se agregó el alumno "+ alumno.getNombre() + " " + alumno.getApellido1() + " al aula " + nombreDeAula);
	}
	
	public void asignarProfesorPorAula(String nombreDeAula, Profesor profesor)
	{
		Aula aulaAux;
		aulaAux = ejercicio01DAO.getAula(nombreDeAula);
		
		for (PuestoDeTrabajo puestoTrabajo : aulaAux.getPuestosDeTrabajo())
		{
			if (puestoTrabajo.getPersona() == null)
			{
				puestoTrabajo.setPersona(profesor);
				break;
			}
		}//Recorrer los puestos y cuando haya un puesto libre, meter el profesor
		ejercicio01DAO.updateAula(nombreDeAula, aulaAux); //Actualizar el aula
		System.out.println("Se agregó el profesor "+ profesor.getNombre() + " " + profesor.getApellido1() + " al aula " + nombreDeAula);
	}
	
	public void eliminarAula(String nombre)
	{
		ejercicio01DAO.deleteAula(nombre);
		System.out.println("El aula " + nombre + " fue eliminada");
	}
}