public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro livro = new LivroFisico(autor);
        Livro livro1 = new MiniLivro(autor);
        livro1.setValor(39.90);
        //livro.valor = 59.9;
        livro.setValor(59.9);

        //System.out.println("Valor livro: " + livro.valor);
        System.out.println("Valor livro: " + livro.getValor());

        if(!livro.aplicaDesconto(0.3)){
            System.out.println("O desconto não pode ser maior que 30%");
        }else{
            //System.out.println("Valor com desconto: " + livro.valor);
            System.out.println("Valor com desconto: " + livro.getValor());
        }


        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.9);

        if (!ebook.aplicaDesconto(0.15 )){
            System.out.println("Desconto no ebook não pode superar 15%");
        }else {
            System.out.println("Valor do ebook com desconto:" + ebook.getValor());
        }


        System.out.println("Valor mini livro: " + livro1.getValor());

        if(!livro1.aplicaDesconto(0.3)){
            System.out.println("O desconto não pode ser maior que 30%");
        }else{
            //System.out.println("Valor com desconto: " + livro.valor);
            System.out.println("Valor com desconto: " + livro1.getValor());
        }

    }
}
