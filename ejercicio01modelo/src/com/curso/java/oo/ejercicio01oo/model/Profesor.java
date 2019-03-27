package com.curso.java.oo.ejercicio01oo.model;

public class Profesor extends Persona
{
	private
	boolean malaLeche;
	String departamento;
	
	public boolean isMalaLeche()
	{
		return malaLeche;
	}
	public void setMalaLeche(boolean malaLeche)
	{
		this.malaLeche = malaLeche;
	}
	public String getDepartamento()
	{
		return departamento;
	}
	public void setDepartamento(String departamento)
	{
		this.departamento = departamento;
	}
}
