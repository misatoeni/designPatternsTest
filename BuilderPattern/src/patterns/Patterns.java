/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Rosa Angelica Lopez
 */
public class Patterns {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		
		System.out.println("Builder Pattern Test");		
		
		List<Juego> juegosIda = new ArrayList<>();
		juegosIda.add(new Juego.JuegoBuilder()
				.local("Pumas")
				.visitante("Chivas")
				.estadio("Estadio Universitario")
				.fecha(LocalDate.of(2016,11,10))
				.horario(LocalTime.of(18,30,0))
				.build());
		juegosIda.add(new Juego.JuegoBuilder()
				.local("Veracruz")
				.visitante("America")
				.estadio("Estadio Azteca")
				.fecha(LocalDate.of(2016,11,10))
				.horario(LocalTime.of(19,30,0))
				.build());
		
		juegosIda.stream().forEach(s -> System.out.println(s));
		
	}
	
}
