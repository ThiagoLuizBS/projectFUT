package Dados;

import java.util.ArrayList;

public class Rodada {
	private ArrayList<Partida> partidas;

	public Rodada() {
		this.partidas = new ArrayList<Partida>();
	}

	public ArrayList<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(Partida partidas) {
		this.partidas.add(partidas);
	}
	
	
}
