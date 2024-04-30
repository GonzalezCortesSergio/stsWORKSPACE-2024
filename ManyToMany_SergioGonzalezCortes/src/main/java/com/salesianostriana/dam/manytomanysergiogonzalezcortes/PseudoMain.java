package com.salesianostriana.dam.manytomanysergiogonzalezcortes;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.manytomanysergiogonzalezcortes.model.Alumno;
import com.salesianostriana.dam.manytomanysergiogonzalezcortes.model.Asignatura;
import com.salesianostriana.dam.manytomanysergiogonzalezcortes.model.Curso;
import com.salesianostriana.dam.manytomanysergiogonzalezcortes.service.ServicioAlumno;
import com.salesianostriana.dam.manytomanysergiogonzalezcortes.service.ServicioAsignatura;
import com.salesianostriana.dam.manytomanysergiogonzalezcortes.service.ServicioCurso;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PseudoMain {

	@Autowired
	private ServicioAlumno servicioAlumno;
	
	@Autowired
	private ServicioCurso servicioCurso;
	
	@Autowired
	private ServicioAsignatura servicioAsignatura;
	
	@PostConstruct
	public void ejecutar() {
		
		Alumno a1 = new Alumno();
		a1.setNombre("Pepe");
		a1.setApellidos("Pérez Pérez");
		a1.setEmail("pepe@gmail.com");

		Alumno a2 = new Alumno();
		a2.setNombre("María");
		a2.setApellidos("Ruiz Hidalgo");
		a2.setEmail("lamari14@msn.com");

		servicioAlumno.save(a1);
		servicioAlumno.save(a2);

		Curso c = new Curso();
		c.setNombre("1º DAM");
		c.setTutor("Miguel");

		servicioCurso.save(c);

		a1.addToCurso(c);
		a2.addToCurso(c);

		servicioAlumno.save(a1);
		servicioAlumno.save(a2);

		System.out.println(c);
		for (Alumno a : c.getAlumnos()) {
			System.out.println(a);
		}

		// Creamos un nuevo curso y lo almacenamos
		//Curso primeroDam = Curso("1º DAM", "Miguel Campos");
		Curso primeroDam = Curso.builder()
				.nombre("1º DAM")
				.tutor("Miguel Campos")
				.build();
		servicioCurso.save(primeroDam);

		Asignatura baseDatos = new Asignatura("Bases de Datos", "Luismi"); 
		Asignatura entornos = new Asignatura("Entornos de Desarrollo", "Luismi");
		// Creamos las asignaturas, las guardamos y las añadimos al curso
		List<Asignatura> asignaturas = Arrays.asList(
				baseDatos,
				entornos, 
				new Asignatura("Programación", "Ángel"),
				new Asignatura("Lenguajes de Marcas", "Rafa"));

		for (Asignatura a : asignaturas) {
			a.addToCurso(primeroDam);
			servicioAsignatura.save(a);
		}

		Alumno antonio = new Alumno("Antonio", "Pérez", "antonio.perez@gmail.com");
		
		// Creamos un nuevo conjunto de alumnos
		List<Alumno> nuevos = Arrays.asList(
				antonio,
				new Alumno("María", "López", "maria.lopez@gmail.com"));

		for (Alumno a : nuevos)
			servicioAlumno.save(a);

		// Aquí es donde vinculamos el curso y los alumnos.
		// La entidad Curso es la que tiene los metodos auxiliares
		// aunque en realidad, Alumno es el propietario de la asociación

		for (Alumno a : nuevos) {
			a.addToCurso(primeroDam);
			servicioAlumno.edit(a);
		}
		
		antonio.addAsignatura(baseDatos);
		antonio.addAsignatura(entornos);
		
		alumnoServicio.edit(antonio);	}
	 
}
