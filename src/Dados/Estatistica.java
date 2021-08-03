package Dados;

public class Estatistica implements Comparable<Estatistica>{
	private Equipe equipe;
	private int posicao;
	private int pontos;
    private int vitoria;
    private int empate;
    private int derrota;
    private int golsPro;
    private int golsContra;
    private int saldo;
    
	public Estatistica(Equipe equipe) {
		super();
		this.equipe = equipe;
		this.posicao = 1;
		this.pontos = 0;
		this.vitoria = 0;
		this.empate = 0;
		this.derrota = 0;
		this.golsPro = 0;
		this.golsContra = 0;
		this.saldo = 0;
	}
	
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	public int getPosicao() {
		return posicao;
	}

	public int getPontos() {
		return pontos;
	}

	private void setPontos() {
		this.pontos = 3 * this.vitoria + this.empate;
	}

	public int getVitoria() {
		return vitoria;
	}

	public void setVitoria() {
		this.vitoria++;
		this.setPontos();
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate() {
		this.empate++;
		this.setPontos();
	}

	public int getDerrota() {
		return derrota;
	}

	public void setDerrota() {
		this.derrota++;
	}

	public int getGolsPro() {
		return golsPro;
	}
	
	public void setGols(int pro, int cont) {
		this.setGolsPro(pro);
		this.setGolsContra(cont);
		this.setSaldo();
	}

	public void setGolsPro(int golsPro) {
		this.golsPro += golsPro;
		this.setSaldo();
	}

	public int getGolsContra() {
		return golsContra;
	}

	public void setGolsContra(int golsContra) {
		this.golsContra += golsContra;
		this.setSaldo();
	}

	public int getSaldo() {
		return saldo;
	}

	private void setSaldo() {
		this.saldo = this.golsPro - this.golsContra;
	}

	public Equipe getEquipe() {
		return equipe;
	}
	
	@Override
	public int compareTo(Estatistica outraEstatistica) {
		if(this.getPontos() > outraEstatistica.getPontos()) {
			return -1;
		} else if(this.getPontos() < outraEstatistica.getPontos()) {
			return 1;
		} else {
			if(this.getVitoria() > outraEstatistica.getVitoria()) {
				return -1;
			} else if(this.getVitoria() < outraEstatistica.getVitoria()) {
				return 1;
			} else {
				if(this.getSaldo() > outraEstatistica.getSaldo()) {
					return -1;
				} else if(this.getSaldo() < outraEstatistica.getSaldo()) {
					return 1;
				}
			}
		}
		return 0;
	}

}
