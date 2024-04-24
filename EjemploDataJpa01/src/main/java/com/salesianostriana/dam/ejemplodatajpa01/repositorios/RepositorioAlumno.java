package com.salesianostriana.dam.ejemplodatajpa01.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ejemplodatajpa01.modelo.Alumno;

public interface RepositorioAlumno extends JpaRepository<Alumno, Long>{

}
