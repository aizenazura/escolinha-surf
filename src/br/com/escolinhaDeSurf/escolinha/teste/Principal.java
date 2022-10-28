package br.com.escolinhaDeSurf.escolinha.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.escolinhaDeSurf.escolinha.modelo.Aluno;
import br.com.escolinhaDeSurf.escolinha.modelo.Aula;
import br.com.escolinhaDeSurf.escolinha.modelo.Conta;
import br.com.escolinhaDeSurf.escolinha.modelo.DiaDaSemana;
import br.com.escolinhaDeSurf.escolinha.modelo.NivelDaAula;
import br.com.escolinhaDeSurf.escolinha.modelo.Professor;
import br.com.escolinhaDeSurf.escolinha.modelo.TipoDaAula;
import br.com.escolinhaDeSurf.escolinha.modelo.Transacao;

public class Principal {
	
	public static void main(String[] args) {
		
		Conta contaAula = new Conta();
		contaAula.setNumero(333);
		contaAula.setAgencia(22);
		contaAula.deposita(100);
		
		Conta contaAluno = new Conta();
		contaAluno.setNumero(555);
		contaAluno.setNumero(444);
		contaAluno.deposita(200.00);
		
		Conta contaAluno2 = new Conta();
		contaAluno2.setNumero(765);
		contaAluno2.setNumero(432);
		contaAluno2.deposita(100);

		
		Aluno aluno = new Aluno();
		aluno.setConta(contaAluno);
		aluno.setNome("Bills");
		aluno.setNivelAula(NivelDaAula.INICIANTE);
		aluno.getConta().setTitular(aluno.getNome()); 
		
		Aluno aluno2 = new Aluno();
		aluno2.setConta(contaAluno2);
		aluno2.setNome("Zed");
		aluno2.setNivelAula(NivelDaAula.INICIANTE);
		
		Professor professor = new Professor();
		professor.setNome("Fran Almeida");
		professor.setNivelAula(NivelDaAula.INICIANTE);
		
		Aula aula = new Aula();
		aula.setConta(contaAula);
		aula.setDia(DiaDaSemana.DOMINGO);
		aula.setHorario("06:00");
		aula.setNivelAula(NivelDaAula.INICIANTE);
		aula.setPreco(70);
		aula.setTipoAula(TipoDaAula.Bodyboard);
		
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(aluno);
		alunos.add(aluno2);
		aula.setAlunos(alunos);
		
		Transacao transacao = new Transacao();
		transacao.setAluno(aluno);
		contaAluno.setTransacao(transacao);
		transacao.setAula(aula);
		transacao.getAluno().getConta().transfere(transacao.getAula().getPreco(), contaAula);
		
		
		System.out.println("Saldo da conta da aula: " + aula.getConta().getSaldo());
		System.out.println("Saldo da conta do aluno: " + aluno.getConta().getSaldo());
		
		boolean criarAula = aula.criarAula(professor);
		if (criarAula) {
			System.out.println("Aula criada");
			System.out.println("Professor: " + aula.getProfessor().getNome());
			System.out.println("Alunos: ");
			for (int i = 0; i < aula.getAlunos().size(); i++) {
				System.out.println(aula.getAlunos().get(i).getNome());
			}
			if (!aula.getStatusAula()) {
				System.out.println("Aula em andamento. ");
			}
		} else {
			System.out.println("Não foi possível criar a aula.");
		}	
	}
}
