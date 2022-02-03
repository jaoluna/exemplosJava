package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.exception.AutorNuloException;
import br.com.casadocodigo.livraria.produtos.Produto;

public abstract class Livro implements Produto {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;


    public Livro(Autor autor){
        if (autor == null){
            throw new AutorNuloException("O autor não pode ser nulo");
        }
        this.autor = autor;
        this.isbn = "000-00-00000-00-00";
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

   /* public void setAutor(br.com.casadocodigo.livraria.Autor autor) {
        this.autor = autor;
    }*/

    public Autor getAutor() {
        return autor;
    }

    //verifcando se this.autor é diferente de vazio;
    public boolean temAutor(){
        return this.autor != null;
    }

    public void mostrarDetalhes(){
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Descricão: " + this.descricao);
        System.out.println("Valor: " + this.valor);
        System.out.println("ISBN: " + this.isbn);

        if (this.temAutor()){
            autor.mostrarDetalhes();
        }

        System.out.println("--");
    }

   /* public boolean aplicaDesconto(double porcentagem){
        if (porcentagem > 0.3){
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }*/

    public abstract boolean aplicaDesconto(double porcentagem);
}
