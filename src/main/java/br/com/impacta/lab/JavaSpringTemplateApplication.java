package br.com.impacta.lab;

import java.util.ArrayList;
import br.com.impacta.models.*;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		
		Produto produto = new Produto();
		produto.codigo = 1;
		produto.descricao = "Camisa";
		produto.valor = 70.00;
		
		listaDeProdutos.add(produto);
		
		Produto produtoEncontrado = Produto.buscarProdutoPeloId(listaDeProdutos, 1);
		
		System.out.println(produtoEncontrado.getDescricao());
	}

}
