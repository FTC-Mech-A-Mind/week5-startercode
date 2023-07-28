public class Textbook extends Book {
    /*
     * Question: What does "extends" do?
     * Answer: (Extends means pulling and connecting information from one class to another one.)
     */

    private int edition;

    public Textbook() {
        /*
         * Question: What does "super" do?
         * Answer: (A Super provides access to methods and attributes from a parent class.)
         */
        super();
        this.edition = 0;
    }

    public Textbook(String title, String author, double price, int edition) {
        // write the constructor here using super() for the parameters taken by
        // Book and use this.edition to store edition
        super(title,author,price);
        this.edition = edition;
    }

    //  Write the canSubstituteFor method here
    boolean canSubstiuteFor(Textbook t) {
        String t2 = t.getTitle();
        int e = t.getEdition();
        if (t2 == this.getTitle() && e > this.getEdition()){
            return true;
        }
        else{ 
            return false;
        }
    }

    /* 
     * Question: What does "@Override" do?
     * Answer: (@Override gives the child class method power over (overrides) the base class method.)
     */
    @Override public String toString() {
        /* 
         * Look at the toString method in Book.java.
         * How could we recreate that method but also include additional information
         * that sets textbooks apart from regular books?
         */
        return super.toString() + "\nEdition" + this.edition;
    }

    // Write a getter and setter method for edition here
    public int getEdition(){
        return this.edition;
    }

    public void setEdition(int edition){
        this.edition = edition;
    }
}
