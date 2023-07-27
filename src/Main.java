public class Main {
    public static void main(String[] args) {
        // Initialize a new library
        Library library = new Library();
        // Create books
        Book book1 = new Book("The Catcher in the Rye", "J. D. Salinger", 9.99);
        Textbook textbook1 = new Textbook("Calculus: Early Transcendentals", "James Stewart", 199.99, 8);
        Textbook textbook2 = new Textbook("Calculus: Early Transcendentals", "James Stewart", 199.99, 9);
        FictionBook fictionBook1 = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 10.99, "Drama", 10);
        // Add all books to the library
        library.addBook(book1);
        library.addBook(textbook1);
        library.addBook(textbook2);
        library.addBook(fictionBook1);
        // Print all the books in the library
        library.printBooks();
        // Print the sum of the prices of all the books in the library
        System.out.println("Sum of prices: " + library.sumOfPrices());
    }
}