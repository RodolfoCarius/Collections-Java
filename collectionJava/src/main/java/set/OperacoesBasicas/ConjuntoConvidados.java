package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c : convidadoSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	
	public static void main(String [] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		conjuntoConvidados.adicionarConvidado("convidado 1", 1);
		conjuntoConvidados.adicionarConvidado("convidado 2", 2);
		conjuntoConvidados.adicionarConvidado("convidado 3", 3);
		conjuntoConvidados.adicionarConvidado("convidado 4", 4);
		conjuntoConvidados.adicionarConvidado("convidado 5", 5);
		
		System.out.println(conjuntoConvidados.contarConvidados());
		conjuntoConvidados.exibirConvidados();
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(4);
		
		System.out.println(conjuntoConvidados.contarConvidados());
		conjuntoConvidados.exibirConvidados();
	}
	
}
