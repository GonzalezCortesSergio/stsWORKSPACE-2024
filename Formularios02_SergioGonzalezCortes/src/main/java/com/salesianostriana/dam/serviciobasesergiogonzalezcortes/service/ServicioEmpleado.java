package com.salesianostriana.dam.serviciobasesergiogonzalezcortes.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.serviciobasesergiogonzalezcortes.model.Empleado;
import com.salesianostriana.dam.serviciobasesergiogonzalezcortes.repository.RepositorioEmpleado;
import com.salesianostriana.dam.serviciobasesergiogonzalezcortes.service.base.ServicioBaseImpl;

@Service
public class ServicioEmpleado extends ServicioBaseImpl<Empleado, Long, RepositorioEmpleado>{

}
