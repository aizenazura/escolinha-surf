
package br.com.escolinhaDeSurf.escolinha.modelo;

public class Aluno extends Pessoa {
	
	private NivelDaAula nivelAula;
	private Conta conta;
	
	public NivelDaAula getNivelAula() {
		return nivelAula;
	}
	
	public void setNivelAula(NivelDaAula nivelAula) {
		this.nivelAula = nivelAula;
	}
	
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
