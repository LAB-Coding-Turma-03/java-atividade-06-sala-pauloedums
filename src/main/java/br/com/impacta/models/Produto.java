package br.com.impacta.models;

import java.util.ArrayList;

public class Produto {
    
    public int codigo;
    public String descricao;
    public double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public static Produto buscarProdutoPeloId(ArrayList<Produto> listaDeProdutos, int codigoProduto) {
        Produto produtoDaLista = listaDeProdutos.stream().filter(p -> p.getCodigo() == codigoProduto).findFirst().get();
        return produtoDaLista != null ? produtoDaLista : null;
    }
}