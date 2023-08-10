public class Textbook extends Book {
    /*
     * Question: What does "extends" do?
     * Answer: it continues the Book class but extends it with new stuff (member variables and methods)
     */

    private int edition;

    public Textbook() {
        /*
         * Question: What does "super" do?
         * Answer: super calls the contrsucter of the class we extended from (so Book())
         */
        super();

        edition = 0;
    }

    public Textbook(String title, String author, double price, int edition) {
        // write the constructor here using super() for the parameters taken by
        // Book and use this.edition to store edition
        super(title, author, price);

        this.edition = edition;
    }

    //  Write the canSubstituteFor method here
    boolean canSubstiuteFor(Textbook t) {
        if (t.title != this.title)
            return false;

        if (t.edition < this.edition)
            return true;

        return false;
    }

    /* 
     * Question: What does "@Override" do?
     * Answer: (your answer here)
     */
    @Override public String toString() {
        /* 
         * Look at the toString method in Book.java.
         * How could we recreate that method but also include additional information
         * that sets textbooks apart from regular books?
         */
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nPrice: " + this.price + "\nEdition: " + this.edition;
    }

    // Write a getter and setter method for edition here
    public int getEdition() {
        return this.edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}
