package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	
	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionaTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoestarefa() {
		System.out.println(tarefaList);
	}
	
	
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("o numero total de tarefas registradas é: " +listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.adicionaTarefa("Tarefa 1");
		listaTarefa.adicionaTarefa("Tarefa 1");
		listaTarefa.adicionaTarefa("Tarefa 2");
		System.out.println("O número total de tarefas registradas é: " +listaTarefa.obterNumeroTotalTarefas());
	
		listaTarefa.removerTarefa("Tarefa 0");
		System.out.println("O número total de tarefas registradas é: " +listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.obterDescricoestarefa();
	}
	
}
