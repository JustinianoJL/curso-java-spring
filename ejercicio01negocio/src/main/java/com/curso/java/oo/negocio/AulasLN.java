package com.curso.java.oo.negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.curso.java.oo.dao.IEjercicio01DAO;
import com.curso.java.oo.modelo.Alumno;
import com.curso.java.oo.modelo.Aula;
import com.curso.java.oo.modelo.Profesor;
import com.curso.java.oo.modelo.PuestoDeTrabajo;

@Component
@Scope("singleton")
public class AulasLN
{
	@Autowired
	private IEjercicio01DAO ejercicio01DAO;
	
	private ApplicationContext context;
	
	public ApplicationContext getContext() {
		return context;
	}



	public void setContext(ApplicationContext context) {
		this.context = context;
	}



	public IEjercicio01DAO getEjercicio01DAO()
	{
		return ejercicio01DAO;
	}
	
	
	
	public void setEjercicio01DAO(IEjercicio01DAO ejercicio01dao)
	{
		ejercicio01DAO = ejercicio01dao;
	}

	public void agregarNuevaAula(String nombre, Boolean pizarra, Boolean proyector, Set<PuestoDeTrabajo> puestosDeTrabajo, PuestoDeTrabajo puestoDeProfesor)
	{
		ejercicio01DAO.createAula(new Aula(nombre, pizarra, proyector, puestosDeTrabajo, puestoDeProfesor));
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
		
		if(aulaAux.getPuestoDeProfesor().getPersona() != null) //Revisa el puesto de profesor para añadirlo a la lista
		{
			listaProfesores.add((Profesor) aulaAux.getPuestoDeProfesor().getPersona());
		}
		for (PuestoDeTrabajo puestoTrabajo : aulaAux.getPuestosDeTrabajo())//Recorre todos los puestos de trabajo
		{
			if (puestoTrabajo != null && puestoTrabajo.getPersona() instanceof Profesor) //Revisa cada puesto de alumnos para añadirlos a la lista
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
		Aula aulaAux = context.getBean(Aula.class);
		PuestoDeTrabajo puestoProfesor = context.getBean(PuestoDeTrabajo.class);
		aulaAux = ejercicio01DAO.getAula(nombreDeAula);
		if(aulaAux.getPuestoDeProfesor().getPersona() == null)
		{
			puestoProfesor.setPersona(profesor);
			aulaAux.setPuestoDeProfesor(puestoProfesor);
			ejercicio01DAO.updateAula(nombreDeAula, aulaAux);
			System.out.println("Se agregó el profesor "+ profesor.getNombre() + " " + profesor.getApellido1() + " al aula " + nombreDeAula);			
		}
		else
		{
			System.out.println("Ya existe un profesor en el aula " + nombreDeAula);
		}	
	}
	
	public void eliminarAula(String nombre)
	{
		ejercicio01DAO.deleteAula(nombre);
		System.out.println("El aula " + nombre + " fue eliminada");
	}
}