package Dados;

import java.util.ArrayList;

public class Tabela {
	private ArrayList<Estatistica> equipes;
	

	public Tabela(ArrayList<Estatistica> equipes) {
		super();
		this.equipes = equipes;
	}

	public void printarTabela() {
		System.out.print(" _______________________________________________\n"
				+ " |P |       Equipe       | PT | V | E | D | SG |\n");
		
	    for(int i =0; i<20; i++)
	    {
	        int letras = 0;
	        System.out.print(" |"+ equipes.get(i).getPosicao() +" |");
	        
	        letras = equipes.get(i).getEquipe().getNome().length();
	        System.out.print(equipes.get(i).getEquipe().getNome());
	                
	        for( ;letras<20; letras++)
	        {
	            System.out.print(" ");
	        }
	        
	        if(equipes.get(i).getSaldo() < 0 || equipes.get(i).getSaldo() > 9)
	        {
	          System.out.print("| " + equipes.get(i).getPontos() +"  | "+ equipes.get(i).getVitoria() +" | "
	        		  + equipes.get(0).getEmpate() +" | "+ equipes.get(i).getDerrota() +" | "+ equipes.get(i).getSaldo() +" |\n");
	        }
	        else 
	        {
	        	 System.out.print("| " + equipes.get(i).getPontos() +"  | "+ equipes.get(i).getVitoria() +" | "
		        		  + equipes.get(0).getEmpate() +" | "+ equipes.get(i).getDerrota() +" |  "+ equipes.get(i).getSaldo() +" |\n");
	        }
	        

	    }

	    System.out.print(" -----------------------------------------------\n");
	}
}
