package com.salesianostriana.dam.ejemplodatajpa01.modelo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

	@Id
	@GeneratedValue
	private long id;
	
	private String nombreCurso;
	private List<Alumno> listaAlumnos;
	
	
}
