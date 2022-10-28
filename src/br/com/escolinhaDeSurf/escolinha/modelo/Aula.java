package br.com.escolinhaDeSurf.escolinha.modelo;

import java.util.List;

public class Aula {
	
	private DiaDaSemana dia;
	private String horario;
	private Professor professor;
	private List<Aluno> alunos;
	private double preco;
	private boolean statusAula;
	private TipoDaAula tipoAula;
	private NivelDaAula nivelAula;
	private Conta conta;
	private Transacao transacao;
	
	
	public boolean validarPagamentoDaAula () {
		
		boolean pagamentoDaAula = false;
		
		for (int i = 0; i < this.alunos.size(); i++) {
				if (this.alunos.get(i).getConta().getTransacao() == null) {
					this.alunos.remove(i);
				} else {
				boolean confirmarTransacao = this.alunos.get(i).getConta().getTransacao().isTransacaoConfirmada();
				if (confirmarTransacao) {
					pagamentoDaAula = true;
				} else {
					pagamentoDaAula = false;
				}
			}
		}		
		 return pagamentoDaAula;
	}
	
	public boolean validarAula(Professor professor, List<Aluno> alunos) {
		
		this.alunos = alunos;
		
		boolean pago = this.validarPagamentoDaAula();
		
		if (pago) {
			for (int i = 0; i < alunos.size(); i++) {
				if (alunos.get(i).getNivelAula() != this.nivelAula) {
					alunos.remove(i);
				} 
			}
			
			if (professor.getNivelAula() != this.nivelAula) {
				return false;
			} else {
				this.professor = professor;
				return true;
			}
		} else {
			return false;
		}
	}
	
	public boolean criarAula(Professor professor) {
		
		this.professor = professor;
		
		boolean aulaValidada = this.validarAula(professor, alunos);
		
		if (aulaValidada) {
			professor.setStatus(false);
			this.setStatusAula(false);
		} else {
			return false;
		}

		return aulaValidada;
	}
	
	public void fimAula() {
		this.professor.setStatus(true);
		this.statusAula = true;
	}
	
	
	public DiaDaSemana getDia() {
		return dia;
	}
	public void setDia(DiaDaSemana dia) {
		this.dia = dia;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public double getPreco() {
		if(this.tipoAula == TipoDaAula.Bodyboard) {
			this.preco = this.preco - (this.preco * 0.2);
		} else {
			this.preco = this.preco;
		}	
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	

	public boolean getStatusAula() {
		return statusAula;
	}


	public void setStatusAula(boolean statusAula) {
		this.statusAula = statusAula;
	}
	
	public TipoDaAula getTipoAula() {
		return tipoAula;
	}
	
	public void setTipoAula(TipoDaAula tipoAula) {
		this.tipoAula = tipoAula;
	}
	
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
	
	public Transacao getTransacao() {
		return transacao;
	}
	
	public void setTransacao(Transacao transacao) {
		this.transacao = transacao;
	}
	
}
