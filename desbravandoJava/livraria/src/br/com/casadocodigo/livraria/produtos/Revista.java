package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Editora;
import br.com.casadocodigo.livraria.produtos.Produto;
import br.com.casadocodigo.livraria.produtos.Promocional;

public class Revista implements Produto, Promocional {
    private String nome;
    private double valor;
    private String descricao;
    private Editora editora;

    @Override
    public double getValor(){
        return 0;
    }

    @Override
    public boolean aplicaDesconto(double porcentagem) {
        return false;
    }
}
