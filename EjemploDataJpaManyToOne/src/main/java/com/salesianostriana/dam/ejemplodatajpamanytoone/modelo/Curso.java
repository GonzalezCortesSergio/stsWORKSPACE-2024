package com.salesianostriana.dam.ejemplodatajpamanytoone.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder //Luismi debe explicar lo de @Builer OBLIGATORIO
public class Curso {

	@Id
	@GeneratedValue
	private long id;
	
	private String nombre;
	private String tutor;
	
	//Se debe poner el nombre de la clase en frente que tiene anotado el atributo @ManyToOne
	@OneToMany(mappedBy = "curso", fetch = FetchType.EAGER)
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private List<Alumno> listaAlumnos = new ArrayList<Alumno>();
	
	//Constructor sin ID
	
	public Curso(String nombre, String tutor) {
		super();
		this.nombre = nombre;
		this.tutor = tutor;
	}
	
	
}
