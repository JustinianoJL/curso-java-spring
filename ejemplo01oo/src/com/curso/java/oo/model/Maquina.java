package com.curso.java.oo.model;

public abstract class Maquina
{
	public void apagar()
	{
		System.out.println("Shutting Down...");
	}
	abstract void cargarse();
	
}
