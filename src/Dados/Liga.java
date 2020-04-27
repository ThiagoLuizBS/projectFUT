package Dados;

import java.util.ArrayList;

public class Liga {
	private String nome;
	private ArrayList<Estatistica> equipes;
	private ArrayList<Rodada> rodadas;
	private Tabela tabela;	
	
	
	public Liga(String nome, ArrayList<Estatistica> equipes, ArrayList<Rodada> rodadas) {
		super();
		this.nome = nome;
		this.equipes = equipes;
		this.rodadas = rodadas;
		this.tabela = new Tabela(equipes);
	}


	public Tabela getTabela() {
		return tabela;
	}
	
	
	
	
	
	/*public ArrayList<Rodada> fazerRodadas(ArrayList<Equipe> equipes) {
		
		return ;
	}*/
}
