package com.salesianostriana.dam.ejemplodatajpamanytoone.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Alumno {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	private String apellidos;
	private String email;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_alumno_curso"))
	private Curso curso;
	
	//Constructor sin ID
	public Alumno(String nombre, String apellidos, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		//this.curso = curso;
	}
	
	
	//Métodos HELPER para la asociación con curso
	
	public void addToCurso(Curso curso) {
		
		this.curso = curso;
		
		curso.getListaAlumnos().add(this);
	}
	
	public void removeFromCurso(Curso curso) {
		
		this.curso = curso;
		
		curso.getListaAlumnos().remove(this);
		
		this.curso = null;
	}
	
	
}
