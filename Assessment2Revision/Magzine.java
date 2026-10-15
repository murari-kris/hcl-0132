package Assessment2Revision;

public class Magzine extends LibraryItem {

    private int durationMinutes;

    Magzine(String title, int year,int durationMinutes) {
        super(title, year);
        this.durationMinutes=durationMinutes;
    }

    @Override
    double lateFree(int daysLate) {
        return daysLate*5.0;
    }

    @Override
    public String toString() {
        return "Magzine{" +
                "durationMinutes=" + durationMinutes +
                '}';
    }
}
