public class Main {
    public static void main(String[] args) {
        // Initialize a new library
        Library lib = new Library();

        // Create books
        Book book1 = new Book("bla", "bli", 2.0);
        Textbook book2 = new Textbook("bla bla", "bli bli", 3.0, 1);
        FictionBook book3 = new FictionBook("bla blue", "bli blo", 9.0, "Horror", 5);

        // Add all books to the library
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        // Print all the books in the library
        lib.printBooks();

        // Print the sum of the prices of all the books in the library
        System.out.println("\nSum of prices: " + lib.sumOfPrices());

    }
}