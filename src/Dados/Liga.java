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
		int contador = 0;
		
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 20; j++) {
				if (i != j) {
					partidas.add(new Partida(equipes.get(i).getEquipe(),equipes.get(j).getEquipe()));
				}
			}
		}
		
		Collections.shuffle(partidas);

		for(int i = 0; i < 38; i++) {
			Rodada r = new Rodada();
			rodadas.add(r);
			for(int j = 0; j < 10; j++) {
				if(jaFoiRodada.size() != 0) {
					for(int k = 0; k < jaFoiRodada.size();) {
						//System.out.println(partidas.size());
						if(partidas.get(contador).getCasa().getNome().equals(jaFoiRodada.get(k).getNome())
								|| partidas.get(contador).getVisitante().getNome().equals(jaFoiRodada.get(k).getNome())) {
							contador++;
							k = 0;
						} else {
							k++;
						}
					}
				}
				
				rodadas.get(i).setPartidas(partidas.get(contador));
				jaFoiRodada.add(partidas.get(contador).getCasa());
				jaFoiRodada.add(partidas.get(contador).getVisitante());
				partidas.remove(contador);							
			}
			
			Collections.shuffle(rodadas.get(i).getPartidas());			
			jaFoiRodada.removeAll(jaFoiRodada);
			//rodadas.get(i).imprimirRodada();
			contador = 0;
			
		}		
		Collections.shuffle(rodadas);
	}
}
