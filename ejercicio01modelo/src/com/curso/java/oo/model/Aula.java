package com.curso.java.oo.model;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (value = "prototype")
public class Aula
{
	private	String nombre;
	private	Boolean pizarra, proyector;
	@Autowired
	@Qualifier("miSet")
	private	Set<PuestoDeTrabajo> puestosDeTrabajo;
	@Autowired
	private PuestoDeTrabajo puestoDeProfesor;
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
	public Set<PuestoDeTrabajo> getPuestosDeTrabajo()
	{
		return puestosDeTrabajo;
	}
	public void setPuestosDeTrabajo(Set<PuestoDeTrabajo> puestosDeTrabajo)
	{
		this.puestosDeTrabajo = puestosDeTrabajo;
	}
	public PuestoDeTrabajo getPuestoDeProfesor()
	{
		return puestoDeProfesor;
	}
	public void setPuestoDeProfesor(PuestoDeTrabajo puestoDeProfesor)
	{
		this.puestoDeProfesor = puestoDeProfesor;
	}
	@Override
	public String toString()
	{
		return "Aula [nombre=" + nombre + ", pizarra=" + pizarra + ", proyector=" + proyector + ", puestosDeTrabajo=" + puestosDeTrabajo + "]";
	}
}