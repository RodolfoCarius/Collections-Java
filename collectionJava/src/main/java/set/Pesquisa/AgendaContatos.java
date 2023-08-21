package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos(){
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
 		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero){
		Contato contatoAtualizado = null;
		for(Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Fulano", 2222);
		agendaContatos.adicionarContato("Fulano", 3333);// não vai adicionar
		agendaContatos.adicionarContato("Fulano Silva", 1111);
		agendaContatos.adicionarContato("Fulano Teste", 4444);
		agendaContatos.adicionarContato("Fulano Numero igual", 1111);
		agendaContatos.adicionarContato("Ciclano", 4444);
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Fulano"));
		
		System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Ciclano", 5555));
		
		agendaContatos.exibirContatos();
	}
}
