package com.salesianostriana.dam.ejemploservicios01sergiogonzalezcortes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Secretaria {

	public List<Alumno> getListaAlumnos () {
		
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		listaAlumnos.add(new Alumno ("Filomeno", "García Márquez", 18, 1));
		listaAlumnos.add(new Alumno ("Mauricio", "Colmenero Osuna", 23, 2, 5.6));
		listaAlumnos.add(new Alumno ("Joselito", "Vaquero Pilato", 29, 3, 7.6));
		listaAlumnos.add(new Alumno ("Laura", "García Márquez", 19, 4, 5.6));
		listaAlumnos.add(new Alumno ("Unai", "Sánchez Pizjuan", 20, 5));
		listaAlumnos.add(new Alumno ("Serena", "Cano León", 23, 6, 10));
		
		return listaAlumnos;
	}
	
	
}
