package com.salesianostriana.dam.ejemplo01holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorSaludo {

	@GetMapping({ "/", "welcome" })
	public String welcome(@RequestParam(name = "nombre", required = false,
	defaultValue = "Mundo") String nombre,
	Model model) {
	
	model.addAttribute("nombre", nombre);
	return "index";
	
	}
	
}