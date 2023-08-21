package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

	
	private List<Item> carrinhoCompras;
	
	public CarrinhoCompras() {
		this.carrinhoCompras = new ArrayList<>();
	}
		
	public int obterNumeroTotalDeIttens() {
		return carrinhoCompras.size();
	}
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoCompras.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItemPorNome(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		for(Item t : carrinhoCompras) {
			if(t.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(t);
			}
		}	
		carrinhoCompras.removeAll(itensParaRemover);
	}
	
	public void exibirItens() {
		System.out.println(carrinhoCompras);
	}
	
	
	public double calcularValorTotal() {
		double valorTotal = 0d;
		for(Item i : carrinhoCompras) {
			double valorPorItem = i.getPreco() *i.getQuantidade();
			valorTotal += valorPorItem;
		}
		return valorTotal;
	}

	public static void main(String[] args) {
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
		
		System.out.println("O número total de itens no carrinho é: " + carrinhoCompras.obterNumeroTotalDeIttens());
	
		carrinhoCompras.adicionarItem("café", 2.50, 2);
		carrinhoCompras.adicionarItem("leite", 3.5, 3);
		carrinhoCompras.adicionarItem("biscoito", 3, 2);
		System.out.println("O número total de itens no carrinho é: " + carrinhoCompras.obterNumeroTotalDeIttens());
		
		carrinhoCompras.exibirItens();
		
		System.out.println(carrinhoCompras.calcularValorTotal());
		carrinhoCompras.removerItemPorNome("café");
		System.out.println("O número total de itens no carrinho é: " + carrinhoCompras.obterNumeroTotalDeIttens());
		
		carrinhoCompras.exibirItens();
	}
	
}


