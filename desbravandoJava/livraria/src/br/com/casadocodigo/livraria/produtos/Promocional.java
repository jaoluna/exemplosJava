package br.com.casadocodigo.livraria.produtos;

@FunctionalInterface
public interface Promocional {

    public boolean aplicaDesconto(double porcentagem);
}
