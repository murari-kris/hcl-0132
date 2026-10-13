package HCL_Assessment_2_COREJAVA2400320109009_Krishna_Murari;

public class DVD extends LibraryItem {
    private int durationMinutes;

    public DVD(String title, int year, int durationMinutes) {
        super(title, year);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public double lateFee(int daysLate) {
        if (daysLate < 0) {
            throw new IllegalArgumentException("Days late cannot be negative.");
        }
        return daysLate * 3.0;
    }

    public int getDurationMinutes() { return durationMinutes; }
}