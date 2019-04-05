package com.curso.java.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Servlet implementation class EjemploServlet
 */
@WebServlet({ "/patatas", "/limones" })
public class EjemploServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private ApplicationContext context;
	
	@Override
	public void init() throws ServletException
	{
		ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		this.context = applicationContext;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public EjemploServlet()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		/*
		PuestoDeTrabajo puesto1 = context.getBean(PuestoDeTrabajo.class);
		PuestoDeTrabajo puesto2 = context.getBean(PuestoDeTrabajo.class);
		PuestoDeTrabajo puesto3 = context.getBean(PuestoDeTrabajo.class);
		PuestoDeTrabajo puestoProfesor = context.getBean(PuestoDeTrabajo.class);
		Alumno alumno1 = context.getBean(Alumno.class);
		Alumno alumno2 = context.getBean(Alumno.class);
		Alumno alumno3 = context.getBean(Alumno.class);
		Profesor profesor1 = context.getBean(Profesor.class);
		asignarDatosEnProfesor(profesor1, "Tomas", "Gutierrez", "Mendoza", "44444444D", "Calle de America, 84", "05-07-1964", "Desarrollo WEB",false);
		//asignarDatosEn_________(_________, "Luis", "Perez", "Mujica", "55555555F", "Calle de Arturo, 45", "15-04-1987",_________,true);
		//asignarDatosEn_________(_________, "Maria", "Perdomo", "Mendoza", "98765432Q", "Calle de Europa, 55", "25-05-1975",_________,false);
		asignarDatosEnAlumno(alumno1, "Alejandro", "Luis", "Anzola", "12345678A", "Calle de Madrid, 1", "01-01-1990", 20, true);
		asignarDatosEnAlumno(alumno2, "Pedro", "Mendez", "Guedez", "11223344B", "Calle de Alcala, 14", "02-02-1991", 19, true);
		asignarDatosEnAlumno(alumno3, "Maria", "Gimenez", "Rodriguez", "33333333C", "Calle de Segovia, 200", "24-09-1994", 18, true);
		puesto1.setPersona(alumno1);
		Set<PuestoDeTrabajo> setPuestosDeTrabajo = new HashSet<PuestoDeTrabajo>();
		setPuestosDeTrabajo.add(puesto1);
		setPuestosDeTrabajo.add(puesto2);
		setPuestosDeTrabajo.add(puesto3);
		AulasLN negocio = context.getBean(AulasLN.class);
		negocio.agregarNuevaAula("Galileo", true, true, setPuestosDeTrabajo,puestoProfesor);
		negocio.asignarAlumnoPorAula("Galileo", alumno2);
		negocio.asignarProfesorPorAula("Galileo", profesor1);
		negocio.listaDeAlumnosPorAula("Galileo");
		negocio.agregarNuevaAula("Tron", true, true, null,null);
		negocio.eliminarAula("Tron");
		imprimirListaDeAlumnos(negocio.listaDeAlumnosPorAula("Galileo"),"Galileo");
		imprimirListaDeProfesores(negocio.listaDeProfesoresPorAula("Galileo"),"Galileo");
		 */
		
		request.setAttribute("mensajeSingleton", context.getBean("mensajeSingleton"));
		request.setAttribute("mensajePrototype", context.getBean("mensajePrototype"));
		request.setAttribute("mensajeRequest", context.getBean("mensajeRequest"));
		request.setAttribute("mensajeSession", context.getBean("mensajeSession"));
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/saludar.jsp").forward(request, response);
	}
}