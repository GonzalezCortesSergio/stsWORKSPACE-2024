package com.salesianostriana.dam.ejemploservicios01sergiogonzalezcortes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Anotaciones Spring para tener un constructor con todos los atributos, sin atributos y para obtener getters y setters (entre otras cosas)

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

	//Atributos
	
	private String nombre;
	private String apellidos;
	private int edad;
	private int id;
	private double notaMedia;

	//Constructor con parámetros específicos
	
	public Alumno (String nombre, String apellidos, int edad, int id) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.id = id;
		
	}
}


