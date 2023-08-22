package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	private Set<Tarefa> tarefaSet;

	public ListaTarefas() {
		this.tarefaSet = new HashSet<>();
	}
	
	public void adicionarTarefa(Tarefa tarefa) {
		tarefaSet.add(tarefa);
	}
	
	public void removerTarefa(String descricao) {
		Set<Tarefa> tarefaParaRemover = new HashSet<>();
		for(Tarefa t : tarefaSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover.remove(t);
			}
		}
	}
	public void exibirTarefas(){
		System.out.println(tarefaSet);
	}
	
	
	public void contarTarefas() {
		System.out.println(tarefaSet.size());
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for(Tarefa t : tarefaSet) {
			if(t.isConcluida()) {
			tarefasConcluidas.add(t);	
			}
		}
	return tarefasConcluidas;
	}
	
	
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		for(Tarefa t : tarefaSet) {
			if(!t.isConcluida()) {
			tarefasPendentes.add(t);	
			}
		}
	return tarefasPendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		Tarefa tarefasMudarParaConcluidas = null;
		for(Tarefa t : tarefaSet) {
			if(t.getDescricao().contains(descricao)) {
			t.setConcluida(true);
			tarefasMudarParaConcluidas = t;
			System.out.println("A tarefa agora está concluida: " + tarefasMudarParaConcluidas);
			break;
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		Tarefa tarefasMudarParaPendente = null;
		for(Tarefa t : tarefaSet) {
			if(t.getDescricao().contains(descricao)) {
			t.setConcluida(false);
			tarefasMudarParaPendente = t;
			System.out.println("A tarefa ainda está pendente: " + tarefasMudarParaPendente);
			break;
			}
		}
	}
	
	public void limparListaTarefas() {
		tarefaSet.removeAll(tarefaSet);
	}
	
	
	public static void main(String[] args) {
		
		ListaTarefas listaTarefas = new ListaTarefas();
		
		listaTarefas.adicionarTarefa(new Tarefa("hello", true));
		listaTarefas.adicionarTarefa(new Tarefa("Bye", false));
		listaTarefas.adicionarTarefa(new Tarefa("hi", false));
		listaTarefas.exibirTarefas();
		
		listaTarefas.contarTarefas();
		
		System.out.println(listaTarefas.obterTarefasConcluidas());
		
		System.out.println(listaTarefas.obterTarefasPendentes());
		
		listaTarefas.marcarTarefaConcluida("ye");
		listaTarefas.marcarTarefaPendente("lo");
		
		listaTarefas.limparListaTarefas();
		listaTarefas.exibirTarefas();
	}
}
