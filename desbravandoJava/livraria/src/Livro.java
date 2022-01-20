public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;


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

    public void aplicaDesconto(double porcentagem){
        this.valor -= this.valor * porcentagem;
    }
}
