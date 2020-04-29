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
	
	public void imprimirRodada() {
		for(int i = 0; i < partidas.size(); i++) {
			System.out.print(partidas.get(i).getCasa().getNome() + " x " + partidas.get(i).getVisitante().getNome() + " ");
		}
		System.out.println();
	}
	
	
}
