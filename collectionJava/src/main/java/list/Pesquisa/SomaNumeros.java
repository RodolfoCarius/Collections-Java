package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	
	private List<Integer> listaNumeros;

	public SomaNumeros() {
		this.listaNumeros = new ArrayList<>();
	}

	public List<Integer> getListaNumeros() {
		return listaNumeros;
	}

	public void setListaNumeros(List<Integer> listaNumeros) {
		this.listaNumeros = listaNumeros;
	}

	@Override
	public String toString() {
		return "[Lista de Números = " + listaNumeros + "]";
	}

	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	public void exibirNumeros() {
		System.out.println(toString());
	}
	
	public int calcularSoma() {
		int soma = 0;
		if(!listaNumeros.isEmpty()) {
			for(Integer numero : listaNumeros) {
				soma += numero;
			}
		}
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maiorNumero = Integer.MIN_VALUE;
		if(!listaNumeros.isEmpty()) {
			for(Integer i : listaNumeros) {
				if(i >= maiorNumero) {
					maiorNumero = i;
				}
			}
		}
		return maiorNumero;
	}

	
	public int encontrarMenorNumero() {
		int menorNumero = Integer.MAX_VALUE;
		if(!listaNumeros.isEmpty()) {
			for(Integer i : listaNumeros) {
				if(i <= menorNumero) {
					menorNumero = i;
				}
			}
		}
		return menorNumero;
	}
	

	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();
		
		somaNumeros.adicionarNumero(5);
		somaNumeros.adicionarNumero(7);
		somaNumeros.adicionarNumero(7);
		somaNumeros.adicionarNumero(2);
		
		somaNumeros.exibirNumeros();
		
		System.out.println("A soma dos numero é: " + somaNumeros.calcularSoma());
		System.out.println("O maior numero é: " +somaNumeros.encontrarMaiorNumero());
		System.out.println("O menor numero é: " +somaNumeros.encontrarMenorNumero());
	}

}