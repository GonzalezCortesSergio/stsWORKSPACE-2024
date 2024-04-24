package com.salesianostriana.dam.ejemplobucles.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.ejemplobucles.model.Producto;

@Service
public class ServicioProducto {

	
	public List<Producto> getLista() {
		
		return Arrays.asList(
				new Producto(1, "Botijo", "Enfría hasta menos 10 grados", 20.5055, true, LocalDateTime.now()),
				new Producto(2, "BotijoExtra", "Enfría hasta menos 200 grado", 200.50, true, LocalDateTime.now())
				);
	}
}
