public class FictionBook extends Book {

    private String genre;
    private int gradeLevel;

    public FictionBook() {
        super();
        genre = "none";
        gradeLevel = 0;
    }

    public FictionBook(String title, String author, double price, String genre, int gradeLevel) {
        super(title, author, price);

        this.genre = genre;
        this.gradeLevel = gradeLevel;
    }

    @Override public String toString() {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nPrice: " + this.price + "\nGenre: " + this.genre + "\nGrade level: " + this.gradeLevel;
    }

    boolean sameGenre(FictionBook f)
    {
        return this.genre == f.genre;
    }

    boolean equalGradeLevel(FictionBook f)
    {
        return this.gradeLevel == f.gradeLevel;
    }

    boolean lowerGradeLevel(FictionBook f)
    {
        return f.gradeLevel < this.gradeLevel;
    }

    boolean higherGradeLevel(FictionBook f)
    {
        return f.gradeLevel > this.gradeLevel;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getGradeLevel() {
        return this.gradeLevel;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}


