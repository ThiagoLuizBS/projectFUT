package Dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Liga {
	private String nome;
	private ArrayList<Estatistica> equipes;
	private ArrayList<Rodada> rodadas;
	private Tabela tabela;	
	
	
	public Liga(String nome, ArrayList<Estatistica> equipes) {
		super();
		this.nome = nome;
		this.equipes = equipes;
		this.rodadas = new ArrayList<Rodada>();
		this.tabela = new Tabela(equipes);
	}

	public Tabela getTabela() {
		return tabela;
	}
		
	public void fazerRodadas() {
		ArrayList<Partida> partidas = new ArrayList<Partida>();		
		ArrayList<Equipe> jaFoiRodada = new ArrayList<Equipe>();
		System.out.println(jaFoiRodada.size());
		Rodada rodada = new Rodada();
		int contador = 0;
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 20; j++) {
				if (i != j) {
					partidas.add(new Partida(equipes.get(i).getEquipe(),equipes.get(j).getEquipe()));
				}
			}
		}
		
		Collections.shuffle(partidas);
		System.out.println(partidas.toString());
		for(int i = 0; i < 19; i++) {
			for(int j = 0; j < 10; j++) {
				if(jaFoiRodada.size() != 0) {
					while(contador == 0) {
						for(int k = 0; k < jaFoiRodada.size(); k++) {
							if(partidas.get(contador).getCasa().equals(jaFoiRodada.get(k))
									|| partidas.get(contador).getVisitante().equals(jaFoiRodada.get(k))) {
								contador++;
								k = 0;
							}
						}
					}
				} else {
					rodada.setPartidas(partidas.get(0));
					jaFoiRodada.add(partidas.get(0).getCasa());
					jaFoiRodada.add(partidas.get(0).getVisitante());
					partidas.remove(0);					
					System.out.println(partidas.toString());
				}				
			}		
		}
	}
}
