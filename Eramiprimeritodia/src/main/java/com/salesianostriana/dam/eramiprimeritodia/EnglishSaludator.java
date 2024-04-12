package com.salesianostriana.dam.eramiprimeritodia;

import org.springframework.stereotype.Service;

@Service //Se utilizará en la clase con anotación @Component
public class EnglishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello coders of 1º DAM");
	}

}
