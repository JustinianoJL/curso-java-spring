package com.curso.java.oo.modelo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (value ="prototype")
public class Profesor extends Persona
{
	private String departamento;
	private Boolean malaLeche;
	
	public String getDepartamento()
	{
		return departamento;
	}
	public void setDepartamento(String departamento)
	{
		this.departamento = departamento;
	}
	public Boolean getMalaLeche()
{
		return malaLeche;
	}
	public void setMalaLeche(Boolean malaLeche)
	{
		this.malaLeche = malaLeche;
	} 
}
