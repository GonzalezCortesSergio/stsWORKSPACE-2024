package com.salesianostriana.dam.herenciamappedsuperclasssergiogonzalezcortes.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@MappedSuperclass
public abstract class Producto {

	@Id
	@GeneratedValue
	private long id;
	
	private String nombre;
	
	private float precio;
	
	
	public Producto (String nombre, float precio) {
		
		this.nombre = nombre;
		this.precio = precio;
	}
	
}
