package com.salesianostriana.dam.serviciobasesergiogonzalezcortes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.serviciobasesergiogonzalezcortes.model.Empleado;
import com.salesianostriana.dam.serviciobasesergiogonzalezcortes.service.ServicioEmpleado;

@Controller
public class ControladorEmpleado {

	@Autowired
	private ServicioEmpleado servicioEmpleado;
	
	@GetMapping({"/", "/empleados"})
	public String mostrarEmpleados(Model model) {
		
		model.addAttribute("empleados", servicioEmpleado.findAll());
		
		return "index";
	}
	
	@GetMapping("/formulario")
	public String formulario (Model model) {
		
		
		Empleado empleado = new Empleado();
		
		model.addAttribute("empleadoForm", empleado);
		
		return "form";
	}
	
	@PostMapping("/agregarEmpleado")
	public String submit(@ModelAttribute("empleadoForm") Empleado empleado, Model model) {

		servicioEmpleado.save(empleado);
		
		model.addAttribute("empleados", servicioEmpleado.findAll());
		
		return "index";
	}
}
