package com.salesianostriana.dam.ejemplobucles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.ejemplobucles.service.ServicioCliente;

@Controller
public class ControladorCliente {

	@Autowired
	private ServicioCliente servicio;
	
	
	@GetMapping("/listGen")
	public String listarVarios(Model model) {
		
		model.addAttribute("listaClientes", servicio.getLista());
		
		return "PlantillaSwitch";
	}
}
