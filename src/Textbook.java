public class Textbook extends Book {
    /*
     * Question: What does "extends" do?
     * Answer: (your answer here) 
     */ 
    //connects two classes

    private int edition;

    public Textbook() {
        /*
         * Question: What does "super" do?
         * Answer: (your answer here)
         */
        // gives access to methods and info from a parent class (parent constructor?)
        super();
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
        if (t2 == this.getTitle() && e >= this.getEdition()){
            return true;
        }
            else{
                return false;
            }
    }

    /* 
     * Question: What does "@Override" do?
     * Answer: (your answer here) 
     */ 
    //Indicates the child class method overrides the base class method 
    @Override public String toString() {
        /* 
         * Look at the toString method in Book.java.
         * How could we recreate that method but also include additional information
         * that sets textbooks apart from regular books?
         */
        return super.toString() + "Edition" + this.edition;
    }

    // Write a getter and setter method for edition here
     public int getEdition(){
        return this.edition;
     }
     public void  setEdition(int edition){
        this.edition = edition;
     }
    

}
