package com.curso.java.oo.model;

public class DronConPistola extends Maquina implements PuedeDisparar
{
	@Override
	void cargarse()
	{
		System.out.println("Cargando con Cargador...");
	}

	@Override
	public void dispararSinJuicio(String objetivo)
	{
		System.out.println("Disparando con el Dron a " + objetivo);
	}
}