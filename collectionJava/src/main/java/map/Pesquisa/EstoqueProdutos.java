package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	private Map<Long, Produto> estoquesProdutosMap;

	public EstoqueProdutos() {
		this.estoquesProdutosMap = new HashMap<>();
	}

	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		estoquesProdutosMap.put(cod, new Produto(nome, preco, quantidade));
	}

	public void exibirTodosProdutos() {
		System.out.println(estoquesProdutosMap);
	}

	public Double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if (!estoquesProdutosMap.isEmpty()) {
			for (Produto p : estoquesProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotalEstoque;
	}

	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!estoquesProdutosMap.isEmpty()) {
			for (Produto p : estoquesProdutosMap.values()) {
				if (p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
					maiorPreco = p.getPreco();
				}
			}
		}
		return produtoMaisCaro;
	}
	
	public static void main(String[] args) {
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		
		estoqueProdutos.adicionarProduto(1L, "sabão", 12, 3);
		estoqueProdutos.adicionarProduto(2L, "detergente", 1, 5);
		estoqueProdutos.adicionarProduto(3L, "sabonete", 2, 8);
		estoqueProdutos.exibirTodosProdutos();
		
		System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
		
		System.out.println("O produto mais caro é : " +estoqueProdutos.obterProdutoMaisCaro());
		
	}
}
