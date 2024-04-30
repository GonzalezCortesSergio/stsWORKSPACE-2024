package com.salesianostriana.dam.serviciobasesergiogonzalezcortes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.serviciobasesergiogonzalezcortes.model.Producto;
import com.salesianostriana.dam.serviciobasesergiogonzalezcortes.service.ServicioProducto;

@Controller
public class ControladorProducto {

	@Autowired
	private ServicioProducto servicioProducto;
	
	
	@GetMapping("/producto")
	public String showFormProducto(Model model) {
		
		Producto producto = new Producto();
		
		model.addAttribute("producto", producto);
		
		model.addAttribute("tipos", servicioProducto.getTipos());
		
		return "formProducto";
	}
	
	@PostMapping("/agregarProducto")
	public String submit(@ModelAttribute("productoForm") Producto producto, Model model) {
		
		model.addAttribute("producto", producto);
		
		return "view";
	}
}
