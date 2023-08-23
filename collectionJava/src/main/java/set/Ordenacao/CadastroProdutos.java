package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
		produtoSet.add(new Produto(codigo, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome; 
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		return produtosPorPreco;
	}
		
	
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();

		System.out.println(cadastroProdutos.produtoSet);
		
		cadastroProdutos.adicionarProduto("mouse", 123, 15.9, 1);
		cadastroProdutos.adicionarProduto("teclado", 321, 20, 2);
		cadastroProdutos.adicionarProduto("monitor", 456, 159.8, 1);
		cadastroProdutos.adicionarProduto("webcam", 123, 48.9, 3);
		

	    System.out.println(cadastroProdutos.exibirProdutosPorNome());

	    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
	}
}