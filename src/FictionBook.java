public class FictionBook extends Book {
    private String genre;
    private int gradeLevel;

    public FictionBook() {
        super();
        this.genre = "";
        this.gradeLevel = 0;
    }

    public FictionBook(String title, String author, double price, String genre, int gradeLevel) {
        super(title, author, price);
        this.genre = genre;
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return "Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor() + "\nPrice: " + this.getPrice()
                + "\nGenre: " + this.genre + "\nGrade level: " + this.gradeLevel;
    }

    public boolean sameGenre(FictionBook other) {
        return this.genre == other.genre;
    }

    public boolean sameGradeLevel(FictionBook other) {
        return this.gradeLevel == other.gradeLevel;
    }

    public boolean lowerGradeLevel(FictionBook other) {
        return this.gradeLevel < other.gradeLevel;
    }

    public boolean higherGradeLevel(FictionBook other) {
        return this.gradeLevel > other.gradeLevel;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public int getGradeLevel() {
        return this.gradeLevel;
    }
}
