package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

import java.io.File;
import java.io.FileNotFoundException;

public class RegistroVendas {
    public static void main(String[] args) throws FileNotFoundException {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);


        System.out.println("Total: " + carrinho.getTotal());

        Produto[] produtos = carrinho.getProdutos();

        for(int i = 0; i <= produtos.length; i++){
           try {
               Produto produto = produtos[i];
               if (produto != null) {
                   System.out.println(produto.getValor());
               }
           }catch (ArrayIndexOutOfBoundsException e){
               System.out.println("deu exception no indice: " + i);
               e.printStackTrace();
           }catch (NullPointerException e){
               System.out.println("Array não foi instanciado");
           }
        }

        for (Produto produto : produtos){
            try {
                if (produto != null) {
                    System.out.println(produto.getValor());
                }
            }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
                System.out.println("foi uma das duas");

            }finally {
                System.out.println("Alguma acao importante");
            }
        }

        try {
            new java.io.FileInputStream("arquivo.txt");
        }catch (FileNotFoundException e1){
            System.out.println("não consegui abrir o arquivo");
        }


      /*  public void abreArquivo() throws FileNotFoundException{
            new java.io.FileInputStream("arquivo.txt");
        }

        try {
            abreArquivo();
        }catch (FileNotFoundException e1){
            System.out.println("Não consegui abrir o arquivo");
        }*/
    }
}
