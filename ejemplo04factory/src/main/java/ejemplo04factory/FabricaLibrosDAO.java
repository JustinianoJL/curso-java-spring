package ejemplo04factory;

import com.curso.java.ejemplo03dao.ejemplo03dao.ILibroDAO;

public class FabricaLibrosDAO
{
	public static ILibroDAO getLibroDAOInstance(String nombreImplementacion) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		if (nombreImplementacion == "LibroListDAO")
		{
			return (ILibroDAO) Class.forName("com.curso.java.ejemplo03dao."+"ejemplo03dao.LibroMemoryDao").newInstance();
		}
		else
		{
			return (ILibroDAO) Class.forName("com.curso.java.ejemplo03dao."+"ejemplo03dao.LibroBBDDDao").newInstance();
		}
	}
}