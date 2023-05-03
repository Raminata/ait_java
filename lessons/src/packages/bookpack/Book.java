package packages.bookpack;

public class Book {
    private String title;
    private String author;
    private int publicationDate;
   public Book(String title, String author, int publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }
    public void  show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(publicationDate);
        System.out.println();
    }
}
