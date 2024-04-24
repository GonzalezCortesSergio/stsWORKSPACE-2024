package com.salesianostriana.dam.ejemplodatajpa01.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//Las clases que son entidades no se pueden inyectar, ya que no son Beans

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Alumnado")
public class Alumno {

	@Id 
	@GeneratedValue
	private long id;
	
	@Column(columnDefinition = "VARCHAR(100)")
	private String nombre;
	
	private String apellidos;
	private String email;
	private List<LocalDate> fechas;
	
	public Alumno (String nombre, String apellidos, String email) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}
}
