package Dados;

import java.util.ArrayList;
import java.util.Collections;

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
		ArrayList<String> combates = new ArrayList<String>();
		Rodada rodada = new Rodada();
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 20; j++) {
				if (i != j) {
					combates.add( equipes.get(i).getEquipe().getNome() +" x "+ equipes.get(j).getEquipe().getNome());
				}
			}
		}
		
		Collections.shuffle(combates);

		for(int i = 0; i < 19; i++) {
			for(int j = 0; j < 10; j++) {
				//if()
			}			
		}
	}
}
