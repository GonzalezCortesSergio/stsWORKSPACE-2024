package com.salesianostriana.dam.ejemplodatajpa01.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//Las clases que son entidades no se pueden inyectar, ya que no son Beans

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

	@Id 
	@GeneratedValue
	private long id;
	private String nombre;
	private String apellidos;
	private String email;
	
	
	public Alumno (String nombre, String apellidos, String email) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}
}
