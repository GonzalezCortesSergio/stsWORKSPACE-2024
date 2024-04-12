package com.salesianostriana.dam.eramiprimeritodia03;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service //Se utilizará en la clase con anotación @Component
@Primary //Tendrá prioridad en comparación a otros @Service
public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		// TODO Auto-generated method stub
		
		System.out.println("Hola a todos los programadores de 1º DAM");
	}
	
	
	@Override
	public String saludar() {
		
		return "Hola a todos los programadores de 1º DAM";
	}

}
