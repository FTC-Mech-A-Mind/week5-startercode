public class FictionBook extends Book {
    String genre;
    int gradeLevel;

    public FictionBook() {
        super();
        this.gradeLevel = 0;
        this.genre = "";

    }

    public FictionBook(String title, String author, double price, String genre, int gradeLevel) {
        super(title, author, price);
        this.genre = genre;
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return super.toString() + "grade level" + gradeLevel + "genre" + genre;
    }

    public int getGradelevel() {
        return this.gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean compareGenre(FictionBook book2) {
        return this.genre == book2.genre;
    }

    public boolean compareGradeLevel(FictionBook book2) {
        return this.gradeLevel == book2.gradeLevel;
    }

    public boolean lowGradeLevel(FictionBook book2) {
        return this.gradeLevel < book2.gradeLevel;
    }

    public boolean highGradeLevel(FictionBook book2) {
        return this.gradeLevel > book2.gradeLevel;
    }
}
