package com.curso.java.oo.ejercicio01oo.model;

import java.util.Set;

public class Aula
{
	private
	String nombre;
	Boolean pizarra, proyector;
	Set<PuestoDeTrabajo> puestosDeTrabajo;
	
	
	
	public Aula()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Aula(String nombre, Boolean pizarra, Boolean proyector, Set<PuestoDeTrabajo> puestosDeTrabajo)
	{
		super();
		this.nombre = nombre;
		this.pizarra = pizarra;
		this.proyector = proyector;
		this.puestosDeTrabajo = puestosDeTrabajo;
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
	public Set<PuestoDeTrabajo> getPuestosDeTrabajo() {
		return puestosDeTrabajo;
	}
	public void setPuestosDeTrabajo(Set<PuestoDeTrabajo> puestosDeTrabajo)
	{
		this.puestosDeTrabajo = puestosDeTrabajo;
	}	
}