package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.produtos.Produto;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private double total;
    private ArrayList<Produto> produtos;
    private int contador = 0;

    public CarrinhoDeCompras(){
        this.produtos = new ArrayList<>();
    }

    public void adiciona(Produto produto){
        System.out.println("Adicionando " + produto);
        this.total += produto.getValor();
        this.produtos.add(produto);
        contador++;

    }

    public void remove(int posicao){
        this.produtos.remove(posicao);
    }

    public double getTotal() {
        return total;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

}
