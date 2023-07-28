public class Main {
    public static void main(String[] args) {
        // Initialize a new library
        Library library = new Library();
    
        // Create books
        Book book1 = new Book("Sainas little eye", "Saina Rath", 2.37);
        Textbook textbook1 = new Textbook("Eyeball: Saina Eyeball", "Not Saina", 23, 1);
        Textbook textbook2 = new Textbook("Abc: Yes", "Tim Burton", 23, 1);
        FictionBook fictionBook1 = new FictionBook("World: Solvable", "Calico Cat", 12, "Informative", 2);
        // Add all books to the library
        library.addBook (book1);
        library.addBook(textbook1);
        library.addBook(textbook2);
        library.addBook(fictionBook1);
        // Print all the books in the library
        library.printBooks();
        // Print the sum of the prices of all the books in the library
        System.out.println("Sum of prices: " + library.sumOfPrices());
    }
}