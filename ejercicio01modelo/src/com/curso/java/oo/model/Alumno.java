package com.curso.java.oo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "alumno")
@Scope(value = "prototype")
public class Alumno extends Persona {
	private Integer calificacion;
	private Boolean subvencionado;

	public Integer getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}

	public Boolean getSubvencionado() {
		return subvencionado;
	}

	public void setSubvencionado(Boolean subvencionado) {
		this.subvencionado = subvencionado;
	}

	@Override
	public String toString() {
		return "Alumno [Nombre=" + getNombre() + ", Apellido1=" + getApellido1() + ", Apellido2=" + getApellido2() +
				", DNI=" + getDNI() + ", Direccion=" + getDireccion() + ", FechaDeNacimiento="	+ getFechaDeNacimiento()
				+ "calificacion=" + calificacion + ", subvencionado=" + subvencionado + "]";
	}

}