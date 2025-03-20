package BookAuthors;

public class Book {

    private Person author;
    private String title;
    private int pages;

    public Book(Person author, String title, int pages){
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public Person getAuthor(){
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
}
