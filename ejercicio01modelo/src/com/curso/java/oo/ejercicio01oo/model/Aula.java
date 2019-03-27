package com.curso.java.oo.ejercicio01oo.model;

import java.util.Set;

public class Aula
{
	private
	String nombre;
	Boolean pizarra, proyector;
	PuestoDeTrabajo puestoDelProfesor;
	Set<PuestoDeTrabajo> puestosDeAlumnos;
	
	
	
	public Aula()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Aula(String nombre, Boolean pizarra, Boolean proyector, Set<PuestoDeTrabajo> puestosDeAlumnos)
	{
		super();
		this.nombre = nombre;
		this.pizarra = pizarra;
		this.proyector = proyector;
		this.puestosDeAlumnos = puestosDeAlumnos;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public Boolean getPizarra()
	{
		return pizarra;
	}
	public void setPizarra(Boolean pizarra)
	{
		this.pizarra = pizarra;
	}
	public Boolean getProyector()
	{
		return proyector;
	}
	public void setProyector(Boolean proyector)
	{
		this.proyector = proyector;
	}
	public PuestoDeTrabajo getPuestoDelProfesor()
	{
		return puestoDelProfesor;
	}
	public void setPuestoDelProfesor(PuestoDeTrabajo puestoDelProfesor)
	{
		this.puestoDelProfesor = puestoDelProfesor;
	}
	public Set<PuestoDeTrabajo> getPuestosDeAlumnos() {
		return puestosDeAlumnos;
	}
	public void setPuestosDeAlumnos(Set<PuestoDeTrabajo> puestosDeAlumnos)
	{
		this.puestosDeAlumnos = puestosDeAlumnos;
	}	
}