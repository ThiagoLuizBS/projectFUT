package Dados;

import java.time.LocalDateTime;

public class Partida {
	private Equipe casa;
	private Equipe visitante;
	private int placarCasa;
	private int placarVisitante;
	private Estadio estadio;
	private LocalDateTime horario;
		
	public Partida(Equipe casa, Equipe visitante) {
		super();
		this.casa = casa;
		this.visitante = visitante;
		this.placarCasa = 0;
		this.placarVisitante = 0;
		this.estadio = null;
		this.horario = null;
	}

	public Equipe getCasa() {
		return casa;
	}

	public void setCasa(Equipe casa) {
		this.casa = casa;
	}

	public Equipe getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipe visitante) {
		this.visitante = visitante;
	}

	public int getPlacarCasa() {
		return placarCasa;
	}

	public void setPlacarCasa(int placarCasa) {
		this.placarCasa = placarCasa;
	}

	public int getPlacarVisitante() {
		return placarVisitante;
	}

	public void setPlacarVisitante(int placarVisitante) {
		this.placarVisitante = placarVisitante;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}		
}
