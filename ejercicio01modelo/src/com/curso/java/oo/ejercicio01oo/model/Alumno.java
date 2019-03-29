package com.curso.java.oo.ejercicio01oo.model;

public class Alumno extends Persona
{
	private
	Integer calificacion;
	boolean subvencionado;
	
	
	public Integer getCalificacion()
	{
		return calificacion;
	}
	public void setCalificacion(Integer calificacion)
	{
		this.calificacion = calificacion;
	}
	public boolean isSubvencionado()
	{
		return subvencionado;
	}
	public void setSubvencionado(boolean subvencionado)
	{
		this.subvencionado = subvencionado;
	}
}