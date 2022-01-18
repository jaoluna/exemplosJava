public class TestaBook {
    public static void main(String[] args) {
        Book book = new Book("Desbravando Java e Orientacão a objetos", "Rodrigo Turini", 222);

        System.out.println("O livro " + book.getName() + " do autor " + book.getAuthor() + " possui "
                + book.getPageNumber() + " paginas");
    }
}
