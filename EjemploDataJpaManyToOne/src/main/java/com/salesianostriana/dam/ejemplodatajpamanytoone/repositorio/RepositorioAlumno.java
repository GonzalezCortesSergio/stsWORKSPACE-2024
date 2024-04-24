package com.salesianostriana.dam.ejemplodatajpamanytoone.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ejemplodatajpamanytoone.modelo.Alumno;

public interface RepositorioAlumno extends JpaRepository<Alumno ,Long>{

}
