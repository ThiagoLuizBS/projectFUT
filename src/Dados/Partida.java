package Dados;

import java.time.LocalDateTime;

public class Partida {
	private Estatistica casa;
	private Estatistica visitante;
	private int placarCasa;
	private int placarVisitante;
	private Estadio estadio;
	private LocalDateTime horario;
		
	public Partida(Estatistica casa, Estatistica visitante) {
		super();
		this.casa = casa;
		this.visitante = visitante;
		this.placarCasa = 0;
		this.placarVisitante = 0;
		this.estadio = null;
		this.horario = null;
	}

	public Partida() {
		super();
	}
	
	public void setPlacar(int cas, int visi) {
		this.setPlacarCasa(cas);
		this.setPlacarVisitante(visi);
		
		if(cas > visi) {
			this.casa.setVitoria();
			this.visitante.setDerrota();
		} else if(cas < visi) {
			this.visitante.setVitoria();
			this.casa.setDerrota();
		} else {
			this.casa.setEmpate();
			this.visitante.setEmpate();
		}
		this.casa.setGols(cas, visi);
		this.visitante.setGols(visi, cas);
	}

	public Estatistica getCasa() {
		return casa;
	}

	public void setCasa(Estatistica casa) {
		this.casa = casa;
	}

	public Estatistica getVisitante() {
		return visitante;
	}

	public void setVisitante(Estatistica visitante) {
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
	
	public void inverter() {
		Estatistica aux = this.casa;
		this.casa = this.visitante;
		this.visitante = aux;		
	}

	@Override
	public String toString() {
		return casa.getEquipe().getNome()+ " " + this.placarCasa + " x " + this.placarVisitante + " " + visitante.getEquipe().getNome();
	}		
	
	
}
