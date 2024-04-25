package com.salesianostriana.dam.ejemplocomposicionsergiogonzalezcortes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.ejemplocomposicionsergiogonzalezcortes.modelo.Asiento;
import com.salesianostriana.dam.ejemplocomposicionsergiogonzalezcortes.modelo.Avion;
import com.salesianostriana.dam.ejemplocomposicionsergiogonzalezcortes.modelo.TipoAsiento;
import com.salesianostriana.dam.ejemplocomposicionsergiogonzalezcortes.repositorio.RepositorioAvion;

import jakarta.annotation.PostConstruct;

@Component
public class PseudoMain {

	@Autowired
	private RepositorioAvion repositorio;
	
	@PostConstruct
	void ejecutar() {
		
		Avion airbus320 = Avion.builder()
				.modelo("Airbus A320")
				.maxPasajeros(300)
				.build();
		
		for (int i = 1; i <= 2; i++) {
			
			for (int j = 1; j<= 6; j++) {
				
				airbus320.agregarAsiento(
						Asiento.builder()
						.tipo(TipoAsiento.PRIMERA)
						.fila(i)
						.columna(j)
						.build()
						);
			}
		}
		
		for (int i = 3; i<= 50; i++) {
			
			for (int j = 1; j <= 6; j++) {
				
				airbus320.agregarAsiento(
						Asiento.builder()
						.tipo(TipoAsiento.TURISTA)
						.fila(i)
						.columna(j)
						.build()
						);
			}
		}
		
		repositorio.save(airbus320);
		
		Asiento asiento = airbus320.getAsientos().get(0);
		airbus320.eliminarAsiento(asiento);
		
		airbus320 = repositorio.save(airbus320);
		
		repositorio.delete(airbus320);
		
			
	}
}
