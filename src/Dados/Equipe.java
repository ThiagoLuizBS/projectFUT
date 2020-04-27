package Dados;

import java.util.ArrayList;

public class Equipe {
	private String nome;
	private int valor;
	private int capital;
	private ArrayList<Jogador> jogadores;
	private ArrayList<Liga> campeonatos;
	
	public Equipe(String nome, int valor, int capital, ArrayList<Jogador> jogadores, ArrayList<Liga> campeonatos) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.capital = capital;
		this.jogadores = jogadores;
		this.campeonatos = campeonatos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public ArrayList<Liga> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(ArrayList<Liga> campeonatos) {
		this.campeonatos = campeonatos;
	}	
	
}
