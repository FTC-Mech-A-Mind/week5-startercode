import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
        /*
         * Here we are using an object called ArrayList<Book> to store our books.
         * An ArrayList is an Array but with an undefined length. Normal arrays
         * have a length that you must define, and we want our library of books
         * to be able to grow and shrink as we need it. So, we use an ArrayList
         * instead of a regular Array.
         * 
         * You won't need to worry too much about ArrayLists. We won't be coming
         * across them much this season. However, if you are interested, feel
         * free to play around with ArrayList and look up more information
         * or documentation on it!
         */
    }

    public void addBook(Book b) {
        this.books.add(b);
    }

    public void removeBook(Book b) {
        this.books.remove(b);
    }

    // Write a method that calls toString for all Books in the library
    public void printBooks() {
        for(int i = 0; i<this.books.size(); i++){
            System.out.println(this.books.get(i).toString()+"\n");
        }
    }

    // Write a method that calculates the sum of the price of all the books
    // in the library
    public int sumOfPrices() {
        int sum = 0;
        for(int i = 0; i<this.books.size(); i++ ){
            sum += this.books.get(i).getPrice();
        }
        return sum;
    }
}
