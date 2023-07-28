public class Main {
    public static void main(String[] args) {
        // Initialize a new library
        Library library = new Library();
        // Create books
        Book book1 = new Book("A", "Aahana", 250.5);
        Textbook textbook1 = new Textbook("B", "Sonu", 250.5, 1);
        Textbook textbook2 = new Textbook("C", "Aahana and Sonu", 250.50, 3);
        FictionBook fictionBook1 = new FictionBook("D", "Eduardo the Great", 2222.22, "Comedy", 6);
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