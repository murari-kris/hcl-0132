package HCL_Assessment_2_COREJAVA2400320109009_Krishna_Murari;

public abstract class LibraryItem {
    private static int counter = 1001;

    private final int id;
    private String title;
    private int year;

    public LibraryItem(String title, int year) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or blank.");
        }
        if (year < 1900 || year > 2026) {
            throw new IllegalArgumentException("Year must be between 1900 and 2026.");
        }

        this.id = counter++;
        this.title = title.trim();
        this.year = year;
    }


    public abstract double lateFee(int daysLate);


    public int getId() { return id; }
    public String getTitle() { return title; }
    public int getYear() { return year; }
}