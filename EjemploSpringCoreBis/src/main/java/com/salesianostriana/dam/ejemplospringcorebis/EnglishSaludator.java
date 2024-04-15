package com.salesianostriana.dam.ejemplospringcorebis;

import org.springframework.stereotype.Service;

@Service
public class EnglishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		// TODO Auto-generated method stub
		
		System.out.println("Hey there dammers, I hope you pass the 3rd quarter");
	}

}
