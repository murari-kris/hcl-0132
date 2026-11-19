package Assessment2Revision;

public class DVD extends LibraryItem{

    private int issueNumber;
    DVD(String title, int year,int issueNumber) {
        super(title, year);
        this.issueNumber=issueNumber;
    }

    @Override
    double lateFree(int daysLate) {
        return daysLate * 1.0 ;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "issueNumber=" + issueNumber +
                '}';
    }
}
