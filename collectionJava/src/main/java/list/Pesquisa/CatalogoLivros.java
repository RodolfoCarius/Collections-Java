package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisaPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisaPorIntervaloDeAno(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloDeAno.add(l);
				}
			}
		}
		return livrosPorIntervaloDeAno;
	}
	
	public void exibirLivros() {
		System.out.println(livroList);
	}
	
	public Livro pesquisaPorTitulo (String titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		catalogoLivros.adicionarLivro("Livro 1", "autor 1", 2000);
		catalogoLivros.adicionarLivro("Livro 1", "autor 2", 2004);
		catalogoLivros.adicionarLivro("Livro 2", "autor 3", 2006);
		catalogoLivros.adicionarLivro("Livro 3", "autor 4", 2008);
		catalogoLivros.adicionarLivro("Livro 4", "autor 5", 2020);
		
		//catalogoLivros.exibirLivros();
		
		System.out.println(catalogoLivros.pesquisaPorAutor("autor 2"));
		
		System.out.println(catalogoLivros.pesquisaPorTitulo("livro 1"));
		
		System.out.println(catalogoLivros.pesquisaPorIntervaloDeAno(2004, 2006));
	}

}


