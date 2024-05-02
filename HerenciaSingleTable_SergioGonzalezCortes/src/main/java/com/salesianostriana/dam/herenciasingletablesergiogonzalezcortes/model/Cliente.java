package com.salesianostriana.dam.herenciasingletablesergiogonzalezcortes.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("C")
public class Cliente extends Usuario{

	public Cliente(String fullName, String username, String password) {
		
		super(fullName, username, password);
	}
}
