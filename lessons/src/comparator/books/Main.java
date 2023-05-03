package comparator.books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Pushkin", "Gold Fish", 1860));
        authors.add(new Author("Bulgackov", "Master & Margarita", 1956));
        authors.add(new Author("Dostoevsky", "Idiot", 1954));
        System.out.println("Print before sorting:");
        System.out.println(authors);
        for (Author author : authors) {
            System.out.println(author);
        }

        System.out.println();

        System.out.println("Sorting by authors name");
        Collections.sort(authors);
        System.out.println(authors);

        System.out.println();

        System.out.println("Sorting by  publishing date");
        Collections.sort(authors, new PublishingYearComparator());
        for (Author author : authors) {
            System.out.println(author);
        }

        System.out.println();

        System.out.println("Sorting by books name");
        Collections.sort(authors, new BookNameComparator());
        for (Author author : authors) {
            System.out.println(author);
        }
    }
}
