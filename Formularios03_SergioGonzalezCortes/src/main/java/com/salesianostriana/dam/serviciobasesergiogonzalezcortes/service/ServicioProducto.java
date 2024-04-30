package com.salesianostriana.dam.serviciobasesergiogonzalezcortes.service;

import org.springframework.stereotype.Service;

@Service
public class ServicioProducto {

	
	public String [] getTipos() {
		
		String [] tipos = new String [] { "Lager", "Pilsen", "Guiness", "Sin filtrar" };
		
		return tipos;
	}
}
