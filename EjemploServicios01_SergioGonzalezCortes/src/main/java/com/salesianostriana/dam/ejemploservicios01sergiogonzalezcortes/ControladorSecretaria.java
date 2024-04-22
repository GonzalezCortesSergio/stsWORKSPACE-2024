package com.salesianostriana.dam.ejemploservicios01sergiogonzalezcortes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorSecretaria {
	
	@Autowired
	private Secretaria secretaria;
	
	
	@GetMapping("/")
	public String mostrarListaAlumnos (Model model) {
		
		model.addAttribute("alumnos", secretaria.getListaAlumnos());
		
		return "index";
		
	}

}
