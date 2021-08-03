package Dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Liga {
	private String nome;
	private ArrayList<Estatistica> equipes;
	private ArrayList<Rodada> rodadas;
	private Tabela tabela;	
	
	
	public Liga(String nome, ArrayList<Estatistica> equipes, int returno) {
		super();
		this.nome = nome;
		this.equipes = equipes;
		this.rodadas = new ArrayList<Rodada>();
		this.tabela = new Tabela(equipes,nome);
		this.fazerRodadasIV(returno);
	}
	
	public String getNome() {
		return nome;
	}

	public Tabela getTabela() {
		return tabela;
	}
	
	public void printarTabela() {
		this.tabela.printarTabela();
	}

	private void fazerRodadasIV(int returno) {
		ArrayList<Estatistica> times = new ArrayList<Estatistica>();
		times.addAll(equipes);
		Collections.shuffle(times);
		int contador = 0;
		for(int cont = 0; cont < returno+1; cont++) {
			if(times.size() % 2 == 0) {
				for(int i = 0; i < times.size()-1; i++) {
					ArrayList<Partida> partidas = new ArrayList<Partida>();
					for(int j = 0; j < times.size()/2; j++) {
						if(i % 2 == 0 && j % 2 == 0) {
							partidas.add(new Partida(times.get(contador),(times.get(times.size()-contador-1))));
							contador++;
						} else if(i % 2 == 0 && j % 2 == 1) {
							partidas.add(new Partida(times.get(times.size()-contador-1),(times.get(contador))));
							contador++;
						} else if(i % 2 == 1 && j == 0) {
							partidas.add(new Partida(times.get(times.size()-contador-1),(times.get(contador))));
							contador++;				
						} else if(i % 2 == 1 && j % 2 == 0) {
							partidas.add(new Partida(times.get(contador),(times.get(times.size()-contador-1))));
							contador++;				
						} else if(i % 2 == 1 && j % 2 == 1) {
							partidas.add(new Partida(times.get(times.size()-contador-1),(times.get(contador))));
							contador++;				
						}
					}
					contador = 0;
					Collections.shuffle(partidas);
					rodadas.add(new Rodada(partidas));				
					for(int k = 0; k < times.size()-2; k++) {
						times.add(times.get(1));
						times.remove(times.get(1));
					}
				}
			} else {
				
			}
		}
		for(int i = 0; i < rodadas.size()/2; i++) {
			for(int j = 0; j < rodadas.get(i).getPartidas().size(); j++) {
				rodadas.get(i+(rodadas.size()/2)).getPartidas().get(j).inverter();
			}			
		}
	}
	
	public void rodadasAleatorias() {
		for(int i = 0; i < rodadas.size(); i++) {
			System.out.println("Premier League rodada: " + (i+1));
			for(int j = 0; j < rodadas.get(i).getPartidas().size(); j++) {
				Random r = new Random();
				rodadas.get(i).getPartidas().get(j).setPlacar(r.nextInt(5), r.nextInt(5));
				if(rodadas.get(i).getPartidas().get(j).getCasa().getEquipe().getNome() == "Liverpool" || rodadas.get(i).getPartidas().get(j).getVisitante().getEquipe().getNome() == "Liverpool") System.out.println(rodadas.get(i).getPartidas().get(j).toString());
			}
			System.out.println();
		}
	}
}
