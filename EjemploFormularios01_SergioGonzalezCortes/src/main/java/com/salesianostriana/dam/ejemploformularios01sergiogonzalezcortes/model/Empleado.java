package com.salesianostriana.dam.ejemploformularios01sergiogonzalezcortes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Empleado {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	private String email;
}
