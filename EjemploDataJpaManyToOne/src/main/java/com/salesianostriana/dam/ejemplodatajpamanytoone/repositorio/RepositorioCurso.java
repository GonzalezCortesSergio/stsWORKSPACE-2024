package com.salesianostriana.dam.ejemplodatajpamanytoone.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ejemplodatajpamanytoone.modelo.Curso;

public interface RepositorioCurso extends JpaRepository<Curso, Long>{

}
