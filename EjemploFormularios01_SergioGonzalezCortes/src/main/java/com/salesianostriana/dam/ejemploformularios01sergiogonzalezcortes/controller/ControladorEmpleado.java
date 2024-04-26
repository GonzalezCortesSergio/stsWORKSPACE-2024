package com.salesianostriana.dam.ejemploformularios01sergiogonzalezcortes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.ejemploformularios01sergiogonzalezcortes.model.Empleado;

@Controller
public class ControladorEmpleado {

	@GetMapping("/empleado")
	public String showForm (Model model) {
		
		Empleado empleado = new Empleado();
		model.addAttribute("empleadoForm", empleado);
		
		return "form";
	}
	
	
	@PostMapping("/addEmpleado")
	public String submit (@ModelAttribute("empleadoForm") Empleado empleado, Model model) {
		
		model.addAttribute("empleado", empleado);
		
		return "view";
	}
}
