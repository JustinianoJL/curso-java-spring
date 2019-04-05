package com.curso.java.oo.modelo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (value = "prototype")
public class PuestoDeTrabajo
{
	private	Boolean ordenador;
	private Persona persona;
	
	public Boolean getOrdenador()
	{
		return ordenador;
	}
	public void setOrdenador(Boolean ordenador)
	{
		this.ordenador = ordenador;
	}
	public Persona getPersona()
	{
		return persona;
	}
	public void setPersona(Persona persona)
	{
		this.persona = persona;
	}
}
