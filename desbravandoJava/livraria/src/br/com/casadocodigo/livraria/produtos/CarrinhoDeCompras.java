package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompras {
    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    public void adiciona(Produto produto){
        System.out.println("Adicionando " + produto);
        this.produtos[0] = produto;
        this.total += produto.getValor();
        contador++;

    }

    public double getTotal() {
        return total;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

}
