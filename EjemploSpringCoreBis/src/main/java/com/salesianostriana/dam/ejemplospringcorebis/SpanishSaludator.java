package com.salesianostriana.dam.ejemplospringcorebis;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		// TODO Auto-generated method stub
		
		System.out.println("Muy wenas alumnos de 1º DAM, a ver si aprobamos el tercer trimestre");
	}

	
}
