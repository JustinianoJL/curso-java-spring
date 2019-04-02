package com.curso.java.oo.model;

public class Equipo
{
	private
	String sotfware;
	Boolean monitor, teclado, mouse;
	
	public String getSotfware()
	{
		return sotfware;
	}
	public void setSotfware(String sotfware)
	{
		this.sotfware = sotfware;
	}
	public Boolean getMonitor()
	{
		return monitor;
	}
	public void setMonitor(Boolean monitor)
	{
		this.monitor = monitor;
	}
	public Boolean getTeclado()
	{
		return teclado;
	}
	public void setTeclado(Boolean teclado)
	{
		this.teclado = teclado;
	}
	public Boolean getMouse()
	{
		return mouse;
	}
	public void setMouse(Boolean mouse)
	{
		this.mouse = mouse;
	}
}
