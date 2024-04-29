package com.salesianostriana.dam.serviciobasesergiogonzalezcortes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.serviciobasesergiogonzalezcortes.service.ServicioAlumno;

@Controller
public class ControladorAlumno {

	@Autowired
	private ServicioAlumno servicioAlumno;
	
	@GetMapping({"/", "/list"})
	public String lista(Model model) {
		
		model.addAttribute("alumnos", servicioAlumno.findAll());
		
		return "lista";
	}
}
