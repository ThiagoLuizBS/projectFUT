package Dados;

import java.util.ArrayList;
import java.util.Collections;

public class Tabela {
	private ArrayList<Estatistica> equipes;
	private String nome;
	

	public Tabela(ArrayList<Estatistica> equipes, String nome) {
		super();
		this.equipes = equipes;
		this.nome = nome;
	}
	
	private void ordenar() {
		Collections.sort(equipes);
	}

	public void printarTabela() {
		this.ordenar();
		System.out.print(this.nome.toUpperCase() +"\n ____________________________________________________________\n"
				+ " |P |       Equipe       | PT |  V |  E |  D | GP | GC | SG |\n");
		
	    for(int i =0; i<equipes.size(); i++)
	    {
	        int letras = 0;
	        this.equipes.get(i).setPosicao(i+1);
	        if(equipes.get(i).getPosicao() > 9) {
	        	System.out.print(" |"+ equipes.get(i).getPosicao() +"|");
	        } else {
	        	System.out.print(" | "+ equipes.get(i).getPosicao() +"|");
	        }
	        
	        
	        letras = equipes.get(i).getEquipe().getNome().length();
	        System.out.print(equipes.get(i).getEquipe().getNome());
	                
	        for( ;letras<20; letras++)
	        {
	            System.out.print(" ");
	        }
	        
	        if(equipes.get(i).getPontos() > 9 && equipes.get(i).getPontos() < 100) {
	        	System.out.print("| " + equipes.get(i).getPontos() + " ");
	        } else if(equipes.get(i).getPontos() > 99){
	        	System.out.print("| " + equipes.get(i).getPontos());
	        } else {
	        	System.out.print("|   " + equipes.get(i).getPontos());
	        }
	        if(equipes.get(i).getVitoria() > 9) {
	        	System.out.print("| " + equipes.get(i).getVitoria() + " ");
	        } else {
	        	System.out.print("|  " + equipes.get(i).getVitoria() + " ");
	        }
	        if(equipes.get(i).getEmpate() > 9) {
	        	System.out.print("| " + equipes.get(i).getEmpate() + " ");
	        } else {
	        	System.out.print("|  " + equipes.get(i).getEmpate() + " ");
	        }
	        if(equipes.get(i).getDerrota() > 9) {
	        	System.out.print("| " + equipes.get(i).getDerrota() + " ");
	        } else {
	        	System.out.print("|  " + equipes.get(i).getDerrota() + " ");
	        }
	        if(equipes.get(i).getGolsPro() > 9) {
	        	System.out.print("| " + equipes.get(i).getGolsPro() + " ");
	        } else {
	        	System.out.print("|  " + equipes.get(i).getGolsPro() + " ");
	        }
	        if(equipes.get(i).getGolsContra() > 9) {
	        	System.out.print("| " + equipes.get(i).getGolsContra() + " ");
	        } else {
	        	System.out.print("|  " + equipes.get(i).getGolsContra() + " ");
	        }
	        if(equipes.get(i).getSaldo() > 9 || (equipes.get(i).getSaldo() > -10 && equipes.get(i).getSaldo() < 0)) {
	        	System.out.print("| "+ equipes.get(i).getSaldo() +" |\n");
	        } else if(equipes.get(i).getSaldo() < -9){
	        	System.out.print("|"+ equipes.get(i).getSaldo() +" |\n");
	        } else {
	        	System.out.print("|  "+ equipes.get(i).getSaldo() +" |\n");
	        }
	        
	        

	    }

	    System.out.print(" ------------------------------------------------------------\n");
	}
}
