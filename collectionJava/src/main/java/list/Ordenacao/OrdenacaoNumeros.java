package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

	private List<Integer>  numeros;
	
	
	public OrdenacaoNumeros() {
		this.numeros = new ArrayList<>();
	}


	public List<Integer> getNumeros() {
		return numeros;
	}
	
	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	
	
	public void  adicionarNumero(int numero) {
		numeros.add(numero);
	}


	public List<Integer> ordenarAscendente(){
		List<Integer> numerosOrdemCrescente = new ArrayList<>(numeros);
		Collections.sort(numerosOrdemCrescente);
		return numerosOrdemCrescente;
	}


	public List<Integer> ordenarDescendente(){
		List<Integer> numerosOrdemDecrescente = new ArrayList<>(numeros);
		numerosOrdemDecrescente.sort(Collections.reverseOrder());
		return numerosOrdemDecrescente;
	}


	public static void main(String[] args) {
		OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

		ordenacaoNumeros.adicionarNumero(10);
		ordenacaoNumeros.adicionarNumero(5);
		ordenacaoNumeros.adicionarNumero(7);

		System.out.println(ordenacaoNumeros.ordenarAscendente());
		System.out.println(ordenacaoNumeros.ordenarDescendente());
	}
}