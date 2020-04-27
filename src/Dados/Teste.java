package Dados;

import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {
		ArrayList<Estatistica> camp = new ArrayList<Estatistica>();
		
		camp.add(new Estatistica(new Equipe("Arsenal", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Aston Villa", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Bournemouth", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Brighton", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Burnley", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Chelsea", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Crystal Palace", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Everton", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Leicester", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Liverpool", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Manchester City", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Manchester United", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Newcastle", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Norwich City", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Sheffield United", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Southampton", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Tottenham", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Watford", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("West Ham", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		camp.add(new Estatistica(new Equipe("Wolverhampton", 10, 20, new ArrayList<Jogador>(), new ArrayList<Liga>())));
		
		Liga pl = new Liga("PL", camp, new ArrayList<Rodada>());
		
		pl.getTabela().printarTabela();
	}
}
