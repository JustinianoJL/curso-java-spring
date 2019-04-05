package com.curso.java.oo.spring.boot.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import com.curso.java.oo.spring.boot.model.entities.Cliente;
import com.curso.java.oo.spring.boot.model.entities.ClienteRepository;

@Configuration
public class Configuracion
{
	public CommandLineRunner iniciarBaseDeDatos(ClienteRepository repository)
	{
		return args -> {
			repository.save(new Cliente("Ruben",100));
			repository.save(new Cliente("Ruben2",40));
			repository.save(new Cliente("Ruben3",2300));
		};
	}

}
