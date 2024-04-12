package com.salesianostriana.dam.eramiprimeritodia02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Saludator spanishSaludator (){
		
		return new SpanishSaludator();
	}
	
	@Bean
	public Saludator englishSaludator() {
		
		return new EnglishSaludator();
	}
}
