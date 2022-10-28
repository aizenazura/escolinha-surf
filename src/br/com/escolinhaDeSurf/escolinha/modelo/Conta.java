package br.com.escolinhaDeSurf.escolinha.modelo;

public class Conta {
	
	private int numero;
	private int agencia;
	private double saldo;
	private String titular;
	private Transacao transacao;
	
	public void deposita (double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean transfere (double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			this.transacao.setTransacaoConfirmada(true);
			return true;
		} else {
			return false;
		}
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public Transacao getTransacao() {
		return transacao;
	}
	
	public void setTransacao(Transacao transacao) {
		this.transacao = transacao;
	}
	

}
