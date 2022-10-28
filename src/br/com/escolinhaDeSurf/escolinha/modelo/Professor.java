package br.com.escolinhaDeSurf.escolinha.modelo;

public class Professor extends Pessoa {
	
	private boolean status;
	private NivelDaAula nivelAula;
	
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean ststus) {
		this.status = ststus;
	}
	public NivelDaAula getNivelAula() {
		return nivelAula;
	}
	public void setNivelAula(NivelDaAula nivelAula) {
		this.nivelAula = nivelAula;
	}
	
	
	
}
