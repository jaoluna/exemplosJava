public class CadastraLivros {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");



        //Criando livros
        Livro livro = new Livro(autor);
    /*    livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";*/

        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.9);
        livro.setIsbn("978-85-66250-46-6");


        /*
        System.out.println(livro.nome);
        System.out.println(livro.descricao);
        System.out.println(livro.valor);
        System.out.println(livro.isbn);
*/


        Livro outroLivro = new Livro(outroAutor);
     /*   outroLivro.nome = "Lógica de Programacão";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";*/

        outroLivro.setNome("Lógica de Programacão");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.9);
        outroLivro.setIsbn("978-85-66250-22-0");





/*
        System.out.println(outroLivro.nome);
        System.out.println(outroLivro.descricao);
        System.out.println(outroLivro.valor);
        System.out.println(outroLivro.isbn);
*/



        //criando autores;


       /* autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789-10";*/

        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789-10");




/*        outroAutor.nome = "Paulo Silveira";
        outroAutor.email = "paulo.silveira@caelum.com.br";
        outroAutor.cpf = "123.456.789-10";
        outroLivro.setAutor(outroAutor);*/


        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789-10");




        livro.mostrarDetalhes();
        outroLivro.mostrarDetalhes();




        Autor autor1 = new Autor();
        autor1.setNome("Guilherme Silveira");
        autor1.setEmail("guilherme.silveira@caelum.com.br");
        autor1.setCpf("123.456.789-10");

        Livro livro1 = new Livro(autor1);
        livro1.setNome("Algoritmos em Java");
        livro1.setDescricao("Ordenacao em Java");
        livro1.setValor(89.9);

        livro1.mostrarDetalhes();


        Ebook ebook = new Ebook(autor);
        ebook.setNome("Java 8 Prático");
        ebook.setDescricao("Novos recursos da linguagem");
        ebook.setValor(29.9);


        ebook.mostrarDetalhes();



        Autor autor2 = new Autor();
        autor2.setNome("Bianca Oliveira");
        autor2.setCpf("123.456.789-10");
        autor2.setEmail("bianca@usp.br");


        Ebook ebook1 = new Ebook(autor2);



        ebook1.mostrarDetalhes();

    }

}
