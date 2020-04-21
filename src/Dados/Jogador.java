package Dados;

public class Jogador {
	private String name;
	private Nacionalidade nacionalidade;
	private int valor;
	private Posicao posicao;
	private Posicao posicao2;
	private PernaBoa perna;
	
	public Jogador(String name, Nacionalidade nacionalidade, int valor, Posicao posicao, Posicao posicao2, PernaBoa perna) {
		super();
		this.name = name;
		this.nacionalidade = nacionalidade;
		this.valor = valor;
		this.posicao = posicao;
		this.posicao2 = posicao2;
		this.perna = perna;
	}
	
	
}
