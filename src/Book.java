public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        // Initizlize the instance variables here for the blank constructor
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        // Initialize the instance variables here using the inputs
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nPrice: " + this.price;
    }

    // add a method that compares the price of two books
    public boolean comparePrice(double price2) {
        if (price == price2){
            return true;
        }
        else{
            return false;
        }
    }

    // getters amd setters for title, author, and price
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
