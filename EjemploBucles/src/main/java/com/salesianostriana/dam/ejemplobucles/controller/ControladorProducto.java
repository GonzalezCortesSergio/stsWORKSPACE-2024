package com.salesianostriana.dam.ejemplobucles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.ejemplobucles.service.ServicioProducto;

@Controller
public class ControladorProducto {

	@Autowired
	private ServicioProducto servicio;
	
	
	@GetMapping("/productos")
	public String controladorCondicionales (Model model) {
		
		model.addAttribute("listaProductos", servicio.getLista());
		
		return "PlantillaBucleYFormateo";
	}
}
