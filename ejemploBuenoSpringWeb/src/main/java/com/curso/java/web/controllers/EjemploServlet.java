package com.curso.java.web.controllers;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.curso.java.oo.modelo.Alumno;
import com.curso.java.oo.modelo.Profesor;
import com.curso.java.oo.modelo.PuestoDeTrabajo;
import com.curso.java.oo.negocio.AulasLN;

/**
 * Servlet implementation class EjemploServlet
 */
@WebServlet({ "/patatas", "/limones" })
public class EjemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext context;
	
	
	
	@Override
	public void init() throws ServletException {
		
		ApplicationContext applicationContext = WebApplicationContextUtils
			.getRequiredWebApplicationContext(getServletContext());
		this.context = applicationContext;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EjemploServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
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

	public static void asignarDatosEnProfesor(Profesor p, String nombre, String ap1, String ap2, String dni, String dir, String fdn, String dep, boolean ml)
	{
		p.setNombre(nombre);
		p.setApellido1(ap1);
		p.setApellido2(ap2);
		p.setDNI(dni);
		p.setDireccion(dir);
		p.setFechaDeNacimiento(fdn);
		p.setDepartamento(dep);
		p.setMalaLeche(ml);
	}
	
	public static void imprimirListaDeAlumnos(List<Alumno> listaAlumnos, String nombreAula)
	{
		System.out.println("\nLista de Alumnos en el aula " + nombreAula);
		for (int i = 0; i < listaAlumnos.size(); i++)
			{
			System.out.println("Alumno " + (i+1));
			System.out.println("  Nombre: " + listaAlumnos.get(i).getNombre() + " " + listaAlumnos.get(i).getApellido1() + " " + listaAlumnos.get(i).getApellido2());
			System.out.println("  DNI: " + listaAlumnos.get(i).getDNI());
			System.out.println("  Direccion: " + listaAlumnos.get(i).getDireccion());
			System.out.println("  Fecha de Nacimiento: " + listaAlumnos.get(i).getFechaDeNacimiento());
			System.out.println("  Calificacion: " + listaAlumnos.get(i).getCalificacion());
			if(listaAlumnos.get(i).getSubvencionado())
				{
					System.out.println("  Subvencionado: SI");
				}
				else
					{
						System.out.println("  Subvencionado: NO");
					}
			}
	}
	
	public static void imprimirListaDeProfesores(List<Profesor> listaProfesores, String nombreAula)
	{
		System.out.println("\nLista de Profesores en el aula " + nombreAula);
		for (int i = 0; i < listaProfesores.size(); i++)
			{
			System.out.println("Profesor " + (i+1));
			System.out.println("  Nombre: " + listaProfesores.get(i).getNombre() + " " + listaProfesores.get(i).getApellido1() + " " + listaProfesores.get(i).getApellido2());
			System.out.println("  DNI: " + listaProfesores.get(i).getDNI());
			System.out.println("  Direccion: " + listaProfesores.get(i).getDireccion());
			System.out.println("  Fecha de Nacimiento: " + listaProfesores.get(i).getFechaDeNacimiento());
			System.out.println("  Departamento: " + listaProfesores.get(i).getDepartamento());
			if(listaProfesores.get(i).getMalaLeche())
			{
				System.out.println("  Mala Leche: SI");
			}
			else
				{
					System.out.println("  Mala Leche: NO");
				}
			}
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
		
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
		negocio.setContext(context);
		negocio.agregarNuevaAula("Galileo", true, true, setPuestosDeTrabajo,puestoProfesor);
		negocio.asignarAlumnoPorAula("Galileo", alumno2);
		negocio.asignarProfesorPorAula("Galileo", profesor1);
		negocio.listaDeAlumnosPorAula("Galileo");
		negocio.agregarNuevaAula("Tron", true, true, null,null);
		negocio.eliminarAula("Tron");
		imprimirListaDeAlumnos(negocio.listaDeAlumnosPorAula("Galileo"),"Galileo");
		imprimirListaDeProfesores(negocio.listaDeProfesoresPorAula("Galileo"),"Galileo");
		
		
		
		request.setAttribute("mensajeSingleton", context.getBean("mensajeSingleton"));
		request.setAttribute("mensajePrototype", context.getBean("mensajePrototype"));
		request.setAttribute("mensajeRequest", context.getBean("mensajeRequest"));
		request.setAttribute("mensajeSession", context.getBean("mensajeSession"));
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/saludar.jsp").forward(request, response);
	}

}
