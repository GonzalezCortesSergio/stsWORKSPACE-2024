package com.salesianostriana.dam.ejemplodatajpa01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.ejemplodatajpa01.modelo.Alumno;
import com.salesianostriana.dam.ejemplodatajpa01.repositorios.RepositorioAlumno;

import jakarta.annotation.PostConstruct;

@Component
public class PseudoMain {

	@Autowired
	private RepositorioAlumno repositorio;
	
	@PostConstruct
	void ejecutar() {
		
		repositorio.save(new Alumno("Sergio", "González Cortés", "gonzalez.coser24@triana.salesianos.edu"));
		
	}
}
