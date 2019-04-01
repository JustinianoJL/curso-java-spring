package com.curso.java.oo.maven;

import java.util.HashSet;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;


public class ejercicio01LanzadorList
{
//	public void nuevoPuesto(String nombreDelPuesto)
//	{
//		PuestoDeTrabajo puesto = new PuestoDeTrabajo(true);
//	}
	public static void asignarDatosEnAlumno(Alumno a, String nombre, String ap1, String ap2, String dni, String dir, String fdn, Integer cal, Boolean sub)
	{
		a.setNombre(nombre);
		a.setApellido1(ap1);
		a.setApellido2(ap2);
		a.setDNI(dni);
		a.setDireccion(dir);
		a.setFechaDeNacimiento(fdn);
		a.setCalificacion(cal);
		a.setSubvencionado(sub);
	}
	public static void main(String[] args)
	{   
		PuestoDeTrabajo puesto = new PuestoDeTrabajo(true);
		PuestoDeTrabajo puesto2 = new PuestoDeTrabajo(true);
		PuestoDeTrabajo puesto3 = new PuestoDeTrabajo(true);
		Alumno alumno = new Alumno();
		Alumno alumno2 = new Alumno();
		Alumno alumno3 = new Alumno();
		asignarDatosEnAlumno(alumno, "Alejandro","Luis","Anzola","12345678A", "Calle de Madrid, 1", "01-01-1990", 20, true);
		asignarDatosEnAlumno(alumno2, "Pedro","Mendez","Guedez","11223344B", "Calle de España, ", "02-02-1991", 19, true);
		asignarDatosEnAlumno(alumno3, "Maria","Gimenez","Rodriguez","33333333C", "Calle de Segovia, 200", "24-09-1994", 18, true);
		puesto.setPersona(alumno);
		Set<PuestoDeTrabajo> setPuestosDeTrabajo = new HashSet<PuestoDeTrabajo>();
		setPuestosDeTrabajo.add(puesto);
		setPuestosDeTrabajo.add(puesto2);
		setPuestosDeTrabajo.add(puesto3);
		AulasLN negocio = new AulasLN(new AulaListDAO());
		negocio.agregarNuevaAula("Galileo", true, true, setPuestosDeTrabajo);
		negocio.asignarAlumnoPorAula("Galileo", alumno2);
		}
}