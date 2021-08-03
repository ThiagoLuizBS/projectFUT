package Dados;

import java.util.ArrayList;

public class Rodada {
	private ArrayList<Partida> partidas;

	public Rodada(ArrayList<Partida> partidas) {
		super();
		this.partidas = partidas;
	}

	public Rodada() {
		this.partidas = new ArrayList<Partida>();
	}

	public ArrayList<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(Partida partidas) {
		this.partidas.add(partidas);
	}
	
	public void imprimirRodada() {
		for(int i = 0; i < partidas.size(); i++) {			
			if(partidas.get(i).getCasa().getEquipe().getNome() == "Liverpool" || partidas.get(i).getVisitante().getEquipe().getNome() == "Liverpool")
			System.out.println(partidas.get(i).getCasa().getEquipe().getNome() + " x " + partidas.get(i).getVisitante().getEquipe().getNome() + " ");
		}
		System.out.println();
	}	
}