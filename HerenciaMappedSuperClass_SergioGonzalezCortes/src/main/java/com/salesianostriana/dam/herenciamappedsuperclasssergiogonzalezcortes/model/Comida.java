package com.salesianostriana.dam.herenciamappedsuperclasssergiogonzalezcortes.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
public class Comida extends Producto{

	private boolean esFrio;
	
	private String tipo;
	
	public Comida(String nombre, float precio, boolean esFrio, String tipo) {
		
		super(nombre, precio);
		
		this.esFrio = esFrio;
		this.tipo = tipo;
	}
}
