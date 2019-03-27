package com.curso.java.oo.ejercicio01oo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

public class Ejercicio01oo
{
	public static void main(String[] args)
	{
		Aula aula = new Aula("Kepler",true,true, new HashSet<PuestoDeTrabajo>());
		aula.setPuestoDelProfesor(new PuestoDeTrabajo(true));
		for (int i = 0; i<14; i++)
		{
			aula.getPuestosDeAlumnos().add(new PuestoDeTrabajo(true));
		}
		aula.getPuestosDeAlumnos().add(new PuestoDeTrabajo(false));
		System.out.println("algo");
		aula.setPuestosDeAlumnos(aula.getPuestosDeAlumnos());
		aula.getPuestoDelProfesor().setPersona(new Profesor());
		Set<PuestoDeTrabajo> puestos = aula.getPuestosDeAlumnos();
		Iterator<PuestoDeTrabajo> iterator = puestos.iterator();
		int numeroDeAlumnos =12;
		while(iterator.hasNext() && numeroDeAlumnos>0)
		{
			PuestoDeTrabajo puestoActual = iterator.next();
			if (puestoActual.isOrdenador())
			{
				puestoActual.setPersona(new Alumno());
				numeroDeAlumnos--;
			}
		}
		
		
		
		
		
		/*System.out.println("Creando Aula...");
		Aula aula = new Aula("Aula 3M", true, true, 9, 67.50);
		System.out.println("Aula Creada");
		
		System.out.println("Agregando profesor...");
		Profesor profesor = new Profesor("Ruben");
		profesor.setApellido1("Lopez");
		profesor.setApellido2("Mendoza");
		profesor.setDNI("12345678A");
		profesor.setFechaDeNacimiento("01-01-1960");
		profesor.setDepartamento("Consultoria");
		profesor.setDireccion("Calle de Alcala, 01");
		System.out.println("Profesor Agregado");*/
	}
}
