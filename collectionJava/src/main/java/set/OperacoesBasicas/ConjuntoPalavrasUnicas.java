package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<String> palavrasSet;
	
	
	public ConjuntoPalavrasUnicas() {
		this.palavrasSet = new HashSet<>();
	}

	
	public Set<String> getPalavrasList() {
		return palavrasSet;
	}


	public void adicionarPalavra(String palavra) {
		palavrasSet.add(palavra);
	}
	
	
	public void removerPalavra(String palavra) {
		palavrasSet.remove(palavra);
	}
	
	public boolean verificarPalavra(String palavra){
		return palavrasSet.contains(palavra);
	}
		

	public void exibirPalavrasUnicas() {
		System.out.println(palavrasSet);
	}
	
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
		
		conjuntoPalavrasUnicas.adicionarPalavra("Help");
		conjuntoPalavrasUnicas.adicionarPalavra("SOS");
		conjuntoPalavrasUnicas.adicionarPalavra("Safe");
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();
		
		conjuntoPalavrasUnicas.removerPalavra("Help");
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();
		
		System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Help"));
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();
	}
}
