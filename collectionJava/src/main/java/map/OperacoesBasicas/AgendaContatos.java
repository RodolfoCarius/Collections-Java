package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null; 
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Rodolfo", 893234);
		agendaContatos.adicionarContato("Fulano", 45345);
		agendaContatos.adicionarContato("Ciclano", 656547);
		agendaContatos.adicionarContato("Beltrano", 134556);
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Ciclano"));
		
		agendaContatos.removerContato("Beltrano");
		agendaContatos.exibirContatos();
		
	}
	
}
