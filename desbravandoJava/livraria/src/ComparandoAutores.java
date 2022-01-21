public class ComparandoAutores {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789-10");


        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789-10");

        if (autor == outroAutor){
            System.out.println("Autores Iguais");
        }else {
            System.out.println("hein?! Autores Diferentes");
            System.out.println(autor + " != " + outroAutor);
        }
    }
}
