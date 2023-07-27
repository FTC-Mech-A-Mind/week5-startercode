public class Textbook extends Book {
    /*
     * Question: What does "extends" do?
     * Answer: (your answer here)
     */

    private int edition;

    public Textbook() {
        /*
         * Question: What does "super" do?
         * Answer: (your answer here)
         */
        super();
        this.edition = 0;
    }

    public Textbook(String title, String author, double price, int edition) {
        // write the constructor here using super() for the parameters taken by
        // Book and use this.edition to store edition
        super(title, author, price);
        this.edition = edition;
    }

    // Write the canSubstituteFor method here
    boolean canSubstiuteFor(Textbook t) {
        if (this.getTitle() == t.getTitle()) {
            return this.edition >= t.edition;
        }
        return false;
    }

    /*
     * Question: What does "@Override" do?
     * Answer: (your answer here)
     */
    @Override
    public String toString() {
        /*
         * Look at the toString method in Book.java.
         * How could we recreate that method but also include additional information
         * that sets textbooks apart from regular books?
         */
        return "Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor() + "\nPrice: " + this.getPrice()
                + "\nEdition: "
                + this.edition;
    }

    // Write a getter and setter method for edition here

}
