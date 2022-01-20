public class ComparandoAutores {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789-10";


        Autor outroAutor = new Autor();
        outroAutor.nome = "Paulo Silveira";
        outroAutor.email = "paulo.silveira@caelum.com.br";
        outroAutor.cpf = "123.456.789-10";

        if (autor == outroAutor){
            System.out.println("Autores Iguais");
        }else {
            System.out.println("hein?! Autores Diferentes");
            System.out.println(autor + " != " + outroAutor);
        }
    }
}
