package com.salesianostriana.dam.ejemplospringcorebis;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Primary
public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		// TODO Auto-generated method stub
		
		System.out.println("Muy wenas alumnos de 1º DAM, a ver si aprobamos el tercer trimestre");
	}
	
	@PostConstruct
	void alComenzar() {
		
		System.out.println("Método \"alComenzar\" anotado con @PostConstruct");
	}
	
	@PreDestroy
	void anteDeDestruir() {
		
		System.out.println("Método \"antesDeDestruir\" anotado con @PreDestroy");
		
	}

	
}
