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
	
	private boolean procurarPartida(Equipe a, Equipe b, ArrayList<Partida> partidas) {
		boolean jaJogou = false;
		for(int i = 0; i < partidas.size(); i++) {
			if((partidas.get(i).getCasa().equals(a) && partidas.get(i).getVisitante().equals(b))
					|| (partidas.get(i).getCasa().equals(b) && partidas.get(i).getVisitante().equals(a))) {
				jaJogou = true;
				i = partidas.size();
			}
		}		
		return jaJogou;
	}
	
	private int procurarPartida(ArrayList<Partida> partidas, Partida achada) {
		int contador = 0;
		for(int i = 0; i < partidas.size(); i++) {
			System.out.println(partidas.size());
			if(achada.equals(partidas.get(i))) {
				contador = i;
				i = partidas.size();
			}
		}
		
		return contador;
	}
	
	private ArrayList<Partida> reduzirPartidas(ArrayList<Partida> partidas, ArrayList<Equipe> jaJogou) {
		ArrayList<Partida> reduzidas = new ArrayList<Partida>();	
		
		for(int i = 0; i < partidas.size(); i++) {
			for(int j = 0; j < jaJogou.size(); j++) {
				if(partidas.get(i).getCasa().equals(jaJogou.get(j))
						|| partidas.get(i).getVisitante().equals(jaJogou.get(j))) {
					
				} else {
					reduzidas.add(partidas.get(i));
				}
			}
			
		}
		
		return reduzidas;
	}
		
	public void fazerRodadas() {
		ArrayList<Partida> partidas = new ArrayList<Partida>();		
		ArrayList<Equipe> jaJogou = new ArrayList<Equipe>();
		int contador = 0;
		int partida = 0;
		
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 20; j++) {
				if (i != j && procurarPartida(equipes.get(i).getEquipe(), equipes.get(j).getEquipe(), partidas) == false) {
					partidas.add(new Partida(equipes.get(i).getEquipe(),equipes.get(j).getEquipe()));
				}
			}
		}
		
		for(int i = 0; i < 19; i++) {
			Rodada r = new Rodada();
			rodadas.add(r);
		}
		
		Collections.shuffle(partidas);
		
		for(int i = 0; i < 19; i++) {			
			for(int j = 0; j < 10; j++) {	
				ArrayList<Partida> reduzidas = this.reduzirPartidas(partidas, jaJogou);
				if(jaJogou.size() != 0) {
					
					for(int k = 0; k < jaJogou.size();) {
						if(reduzidas.get(contador).getCasa().equals(jaJogou.get(k))) {
							contador++;
							k = 0;
						} else if(reduzidas.get(contador).getVisitante().equals(jaJogou.get(k))) {
							contador++;
							k = 0;
						} else {
							k++;
						}						
					}					
				}			
				
				
				partida = this.procurarPartida(partidas, reduzidas.get(contador));
							
				rodadas.get(i).setPartidas(partidas.get(partida));
				jaJogou.add(partidas.get(partida).getCasa());
				jaJogou.add(partidas.get(partida).getVisitante());
				partidas.remove(partida);
				contador = 0;
				partida = 0;
			}
								
			jaJogou.removeAll(jaJogou);
			rodadas.get(i).imprimirRodada();
			
		}		
			
		//Collections.shuffle(rodadas.get(i).getPartidas());						
		//System.out.println(rodadas.size());
		//Collections.shuffle(rodadas);
	}
}
