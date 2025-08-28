public class Book {
    private final String name;
    private final String author;
    private final int pages;
    private final int isbn;

    public Book(String name, String author, int pages, int isbn){
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public int getPages(){
        return pages;
    }

    public int getIsbn(){
        return isbn;
    }
}
