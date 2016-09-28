/*
 * Ejemplo de patron Builder.
 */
package patterns;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Rosa Angelica Lopez
 */
public class Juego {
	private String local;
	private String visitante;
	private LocalDate fecha;
	private LocalTime horario;
	private String estadio;

	private Juego(JuegoBuilder juegoBuilder){
		local = juegoBuilder.local;
		visitante = juegoBuilder.visitante;
		fecha = juegoBuilder.fecha;
		horario = juegoBuilder.horario;
		estadio = juegoBuilder.estadio;
	}
	
	public String getLocal() {
		return local;
	}

	public String getVisitante() {
		return visitante;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public String getEstadio() {
		return estadio;
	}
	
	@Override
	public String toString(){
		return this.local + " vs " + this.visitante 
			   + " en " + this.estadio +  " el  " +this.fecha  
			   + " a las "+ this.horario ;
	}
	
	static class JuegoBuilder{
		private String local;
		private String visitante;
		private LocalDate fecha;
		private LocalTime horario;
		private String estadio;
		
		public JuegoBuilder local(String local){
			this.local = local;
			return this;
		}
		
		public JuegoBuilder visitante(String visitante){
			this.visitante = visitante;
			return this;
		}
		
		
		public JuegoBuilder fecha(LocalDate fecha){
			this.fecha = fecha;
			return this;
		}
		
		public JuegoBuilder horario(LocalTime horario){
			this.horario = horario;
			return this;
		}
		
		public JuegoBuilder estadio(String estadio){
			this.estadio = estadio;
			return this;
		}
		
		public Juego build(){
						
			return new Juego(this);
		}
	}
}
