package Dados;

import java.time.LocalDateTime;

public class Estadio {
	private String nome;
	private int capacidade;
	private LocalDateTime inauguracao;
	private String localidade;
	
	public Estadio(String nome, int capacidade, LocalDateTime inauguracao, String localidade) {
		super();
		this.nome = nome;
		this.capacidade = capacidade;
		this.inauguracao = inauguracao;
		this.localidade = localidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public LocalDateTime getInauguracao() {
		return inauguracao;
	}

	public void setInauguracao(LocalDateTime inauguracao) {
		this.inauguracao = inauguracao;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}	
}
