package com.salesianostriana.dam.herenciajoinedsergiogonzalezcortes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String email;
	
	
	private String nombre;
	private String apellidos;
	
	
	public Cliente(String email, String nombre, String apellidos) {
		
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	
}
