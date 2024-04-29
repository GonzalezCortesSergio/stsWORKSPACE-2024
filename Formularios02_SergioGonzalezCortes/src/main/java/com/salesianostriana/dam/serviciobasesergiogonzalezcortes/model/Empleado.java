package com.salesianostriana.dam.serviciobasesergiogonzalezcortes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@SequenceGenerator(name = "secuenciaEmpleado", sequenceName="empleado_seq", initialValue=101)
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="secuenciaEmpleado")
	private Long id;
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private String genero;
}
