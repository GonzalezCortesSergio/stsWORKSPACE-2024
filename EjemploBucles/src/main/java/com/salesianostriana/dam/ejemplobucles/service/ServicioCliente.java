package com.salesianostriana.dam.ejemplobucles.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.ejemplobucles.model.Cliente;

@Service
public class ServicioCliente {

	public List<Cliente> getLista() {
		
		return Arrays.asList(
				new Cliente(1, "Ángel", "Naranjo", "González", "masculino"),
				new Cliente(2, "Luis Miguel", "López", "Magaña", "masculino"),
				new Cliente(3, "Novia De", "Doraemon", "No sé", "femenino")
				);
				
	}
}
