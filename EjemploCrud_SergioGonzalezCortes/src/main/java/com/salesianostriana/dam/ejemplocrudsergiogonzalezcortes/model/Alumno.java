package com.salesianostriana.dam.ejemplocrudsergiogonzalezcortes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Alumno {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	private String apellidos;
	
	private String email;
}
