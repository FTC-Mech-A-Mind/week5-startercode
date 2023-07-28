public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        
        // Create books{
        Book book1 = new Book("A", "Aahana", 250.5);
        Textbook textbook1 = new Textbook("B", "Sonu", 4.5, 1);
        Textbook textbook2 = new Textbook("C", "Sonu + Aahana", 250.5, 2);
        FictionBook fictionBook1 = new FictionBook("D", "jerald", 250.6, "fantasy", 8);
        library.addBook(book1);
        library.addBook(textbook1);
        library.addBook(textbook2);
        library.addBook(fictionBook1);
        library.printBooks();
        System.out.println("Sum of prices:" + library.sumOfPrices());


        }
        // Add all books to the library

        // Print all the books in the library

        // Print the sum of the prices of all the books in the library

    }

