package com.salesianostriana.dam.serviciobasesergiogonzalezcortes.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Producto {

	
	private Long id;
	private String nombre;
	private String descripcion;
	private double precio;
	
	private String tipo;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate fechaCaducidad;
}
