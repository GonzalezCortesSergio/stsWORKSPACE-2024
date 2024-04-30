package com.salesianostriana.dam.manytomanysergiogonzalezcortes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
public class Asignatura {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	private String profesor;
	
	@ManyToOne
	private Curso curso;
	
	
	//Métodos HELPER
	
	public void addToCurso(Curso c) {
		
		c.getAsignaturas().add(this);
		
		this.curso = c;
	}
	
	public void removeFromCurso(Curso c) {
		
		c.getAsignaturas().remove(this);
		
		this.curso = null;
	}
}
