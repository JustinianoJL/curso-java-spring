package com.curso.java.oo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component (value = "alumno")
@Scope (value = "prototype")
public class Alumno extends Persona
{
	private Integer calificacion;
	private Boolean subvencionado;
	
	public Integer getCalificacion()
	{
		return calificacion;
	}
	public void setCalificacion(Integer calificacion)
	{
		this.calificacion = calificacion;
	}
	public Boolean getSubvencionado()
	{
		return subvencionado;
	}
	public void setSubvencionado(Boolean subvencionado)
	{
		this.subvencionado = subvencionado;
	}	
}