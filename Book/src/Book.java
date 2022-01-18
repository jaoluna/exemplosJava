public class Book {
    private String name;
    private String author;
    private int pageNumber;

    public Book(String name, String author, int pageNumber ){
        this.name = name;
        this.author = author;
        this.pageNumber = pageNumber;
    }

    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getPageNumber(){
        return this.pageNumber;
    }
}
