package Assessment2Revision;

public class Book extends LibraryItem {

    private String auther;
    private int isbn;

    Book(String title, int year,String auther,int isbn) {
        super(title, year);
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
