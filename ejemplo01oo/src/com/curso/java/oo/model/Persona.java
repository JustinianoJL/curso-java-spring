package com.curso.java.oo.model;

import java.util.Date;

public class Persona
{
	private
	String nombre, apellido1, apellido2, telefono;
	Date fechaDeNacimiento;
	public static String algoExplicito;
	

	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getApellido1()
	{
		return apellido1;
	}
	public void setApellido1(String apellido1)
	{
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2)
	{
		this.apellido2 = apellido2;
	}
	public String getTelefono()
	{
		return telefono;
	}
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}
	public Date getFechaDeNacimiento()
	{
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento)
	{
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
}