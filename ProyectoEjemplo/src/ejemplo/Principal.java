package ejemplo;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main (String[] args) {
		
		List<PuedeSaltar> listaPuedeSaltar = new ArrayList<PuedeSaltar>();
		
		
		Jugador j = new Jugador();
		Npc n = new Npc();
		
		listaPuedeSaltar.add(j);
		
		listaPuedeSaltar.add(n);
		
		System.out.println("Jugador: ");
		j.saltarHaciaAdelante();
		j.saltarHaciaArriba();
		
		System.out.println("NPC: ");
		n.saltarHaciaAdelante();
		n.saltarHaciaArriba();
		
		saltarTodos(listaPuedeSaltar);
	}
	
	public static void saltarTodos(List<PuedeSaltar> listaPuedeSaltar) {
		
		for (PuedeSaltar puedeSaltar : listaPuedeSaltar) {
			
			puedeSaltar.saltarHaciaAdelante();
			puedeSaltar.saltarHaciaArriba();
			
			
		}
	}
}
