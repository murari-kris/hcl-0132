package HCL_Assessment_2_COREJAVA2400320109009_Krishna_Murari;

public class Book {

    private String author;
    private String isbn;

    public Book(String author, String isbn) {

        this.author = author;
        this.isbn = isbn;
    }


    public double lateFee(int daysLate) {

        return daysLate * 2.0;
    }

    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
}
