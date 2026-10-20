package Assessment2Revision;

import java.util.HashSet;
import java.util.Set;

public class Book extends LibraryItem {

    private String auther;
    private String isbn;


    private static Set<String> isbnSet = new HashSet<>();
    Book(String title, int year,String auther,String isbn) {
        super(title, year);

        if (isbn == null || isbn.isBlank()) {
            throw new IllegalArgumentException("Invalid ISBN");
        }

        if (!isbnSet.add(isbn)) {
            throw new IllegalArgumentException(
                    "Book with this ISBN already exists: " + isbn
            );
        }
        this.auther=auther;
        this.isbn=isbn;
    }


    @Override
    double lateFree(int daysLate){
        return daysLate*2.0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "auther='" + auther + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
