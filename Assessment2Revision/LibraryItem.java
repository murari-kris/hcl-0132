package Assessment2Revision;

abstract class LibraryItem  implements Borrowable{
    private int id;
    private String title;
    private int year;
    private boolean available;

    static int counter=1001;

    LibraryItem(String title,int year){

        if(title==null || title.isEmpty()){
            throw new IllegalArgumentException("title must not be blank");
        }

        if(year>1900 && year>2026){
            throw new IllegalArgumentException("the year must be between 1900 and current year");
        }
        this.id=counter++;
        this.title=title;
        this.year=year;
        this.available=true;

    }


    abstract double lateFree(int daysLate);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }




    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void borrow() {
        if(!available){
            throw new ItemNotAvailableException("Item is already borrowed");
        }
        available=false;

        System.out.println("Borrowed successfully");
    }

    @Override
    public void giveBack() {
        if(available){
            throw new IllegalStateException("Item is not currently borrowed");
        }
        available=true;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", available='" + available + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        LibraryItem item = (LibraryItem) obj;

        return this.id == item.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
