package HCL_Assessment_2_COREJAVA2400320109009_Krishna_Murari;
public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, int year, int issueNumber) {
        super(title, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public double lateFee(int daysLate) {

        return daysLate * 1.0;
    }

    public int getIssueNumber() { return issueNumber; }
}