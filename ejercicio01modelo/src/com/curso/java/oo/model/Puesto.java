package com.curso.java.oo.model;

public class Puesto
{
	private
	Boolean mesa, silla;
	Integer posicionEnFila, posicionEnColumna;
	
	public Boolean getMesa()
	{
		return mesa;
	}
	public void setMesa(Boolean mesa)
	{
		this.mesa = mesa;
	}
	public Boolean getSilla()
	{
		return silla;
	}
	public void setSilla(Boolean silla)
	{
		this.silla = silla;
	}
	public Integer getPosicionEnFila()
	{
		return posicionEnFila;
	}
	public void setPosicionEnFila(Integer posicionEnFila)
	{
		this.posicionEnFila = posicionEnFila;
	}
	public Integer getPosicionEnColumna()
	{
		return posicionEnColumna;
	}
	public void setPosicionEnColumna(Integer posicionEnColumna)
	{
		this.posicionEnColumna = posicionEnColumna;
	}
}