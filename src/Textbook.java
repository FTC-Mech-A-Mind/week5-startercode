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
    }

    public Textbook(String title, String author, double price, int edition) {
        // write the constructor here using super() for the parameters taken by
        // Book and use this.edition to store edition
    }

    //  Write the canSubstituteFor method here
    boolean canSubstiuteFor(Textbook t) {
        
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
    }

    // Write a getter and setter method for edition here

}
