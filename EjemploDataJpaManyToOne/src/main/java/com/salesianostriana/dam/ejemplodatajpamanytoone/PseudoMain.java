package com.salesianostriana.dam.ejemplodatajpamanytoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.ejemplodatajpamanytoone.modelo.Alumno;
import com.salesianostriana.dam.ejemplodatajpamanytoone.modelo.Curso;
import com.salesianostriana.dam.ejemplodatajpamanytoone.repositorio.RepositorioAlumno;
import com.salesianostriana.dam.ejemplodatajpamanytoone.repositorio.RepositorioCurso;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PseudoMain {

	@Autowired
	private RepositorioAlumno repoAlumno;
	
	@Autowired
	private RepositorioCurso repoCurso;
	
	@PostConstruct
	void ejecutar() {
	/*	
		Curso c = new Curso("1º DAM", "Miguel Campos Rivera");
		repoCurso.save(c);
		
		Alumno a = new Alumno ("Sergio", "González Cortés", "gonzalez.coser24@triana.salesianos.edu", c);
		repoAlumno.save(a);
		
		repoAlumno.findAll().forEach(System.out::println);
		
		*/
		
		Curso c = new Curso ("1º DAM", "Miguel Campos Rivera");
		repoCurso.save(c);
		
		Alumno a = new Alumno("Sergio", "González Cortés", "gonzález.coser24@triana.salesianos.edu");
		
		a.addToCurso(c);
		
		repoAlumno.save(a);
		
		repoAlumno.findAll().forEach(System.out::println);
		
		c.getListaAlumnos().forEach(System.out::println);
	}
}
