package com.salesianostriana.dam.herenciamappedsuperclasssergiogonzalezcortes.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
public class Bebida extends Producto{

	private int tamanio;
	
	
	public Bebida (String nombre, float precio, int tamanio) {
		
		super(nombre, precio);
		
		this.tamanio = tamanio;
	}
}
