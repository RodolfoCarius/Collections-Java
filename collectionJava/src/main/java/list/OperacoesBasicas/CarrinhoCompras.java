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
	
	public void calcularValorTotal() {
		
	}

	public static void main(String[] args) {
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
		System.out.println("O número total de itens no carrinho é: " + carrinhoCompras.obterNumeroTotalDeIttens());
	
		carrinhoCompras.adicionarItem("café", 2.55, 1);
		System.out.println("O número total de itens no carrinho é: " + carrinhoCompras.obterNumeroTotalDeIttens());
		
		carrinhoCompras.exibirItens();
		
		carrinhoCompras.removerItemPorNome("café");
		System.out.println("O número total de itens no carrinho é: " + carrinhoCompras.obterNumeroTotalDeIttens());
		
		carrinhoCompras.exibirItens();
	}
	
}


