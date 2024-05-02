package com.salesianostriana.dam.herenciajoinedsergiogonzalezcortes.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@Entity
public class ClienteVip extends Cliente{

	private LocalDate fechaVip;
	
	
	public ClienteVip (String email, String nombre, String apellidos, LocalDate fechaVip) {
		
		super(email, nombre, apellidos);
		
		this.fechaVip = fechaVip;
	}
}
