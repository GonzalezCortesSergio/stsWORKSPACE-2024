package com.salesianostriana.dam.serviciobasesergiogonzalezcortes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
}
