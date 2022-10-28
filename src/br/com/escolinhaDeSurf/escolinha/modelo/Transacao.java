package br.com.escolinhaDeSurf.escolinha.modelo;

public class Transacao {
	
	private Aluno aluno;
	private boolean transacaoConfirmada;
	private Aula aula;
	
	public Transacao() {
		transacaoConfirmada = false;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public boolean isTransacaoConfirmada() {
		return transacaoConfirmada;
	}
	
	public void setTransacaoConfirmada(boolean transacaoConfirmada) {
		this.transacaoConfirmada = transacaoConfirmada;
	}
	
	public Aula getAula() {
		return aula;
	}
	
	public void setAula(Aula aula) {
		this.aula = aula;
	}
}
