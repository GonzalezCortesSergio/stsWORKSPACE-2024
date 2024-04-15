package com.salesianostriana.dam.ejemplospringcorebis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import jakarta.annotation.PostConstruct;

@Controller
public class PseudoMain {

	@Autowired
	private Saludator saludator;
	
	@PostConstruct
	void run() {
		
		saludator.imprimirSaludo();
	}
}
