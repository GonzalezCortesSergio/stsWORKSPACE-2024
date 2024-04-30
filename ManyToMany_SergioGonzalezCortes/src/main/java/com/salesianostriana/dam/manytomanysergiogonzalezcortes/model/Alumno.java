package com.salesianostriana.dam.manytomanysergiogonzalezcortes.model;

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
	
	private String nombre, apellidos, email;
	
	@ManyToOne
	@JoinColumn (foreignKey = @ForeignKey(name = "fk_alumno_curso"))
	private Curso curso;
	
	
	//Métodos HELPER
	
	public void addToCurso (Curso curso) {
		
		this.curso = curso;
		
		curso.getAlumnos().add(this);
	}
	
	public void removeFromCurso(Curso curso) {
		
		curso.getAlumnos().remove(this);
		
		this.curso = null;
	}
}