package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorAlunos {
	
	private Set<Aluno> alunoSet;

	public GerenciadorAlunos() {
		this.alunoSet = new HashSet<>();
	}

	public Set<Aluno> getAlunoSet() {
		return alunoSet;
	}
	
	public void adicionarAluno(String nome, Long matricula, double media) {
		alunoSet.add(new Aluno(nome, matricula, media));
	}
	
	public void removerAluno(long matricula) {
		Set<Aluno> alunoRemovido = new HashSet<>();
		for(Aluno a : alunoSet) {
			if(a.getMatricula() == matricula) {
				alunoRemovido.remove(a);
				break;
			}
		}
		
//	public Set<Aluno> exibirAlunosPorNome() {
//		Set<Aluno> alunosPorNome = new HashSet<>();
//		for(Aluno a : alunoSet) {
//			a.getNome()
//		}
//		return ;
//		
//	}
	
	}
}
