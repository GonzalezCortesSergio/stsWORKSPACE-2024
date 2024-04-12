package com.salesianostriana.dam.eramiprimeritodia02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component //Se utilizará esta clase como componente
public class MainDeMentira {

	@Autowired //Esta etiqueta sirve para inyectar automáticamente
	@Qualifier("englishSaludator") //Esta etiqueta sirve para inyectar un Bean en específico ("nombreBean")
	private Saludator saludator;
	
	@PostConstruct //Se realizará este método justo después de haber arrancado el programa
	public void init () {
		
		
		saludator.imprimirSaludo();
	}
}
