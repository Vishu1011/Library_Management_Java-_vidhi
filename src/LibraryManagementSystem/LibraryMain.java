package LibraryManagementSystem;

public class LibraryMain {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("paython", "leslin", "6785613451", true);
        library.addBook(book1);

        Book book2 = new Book("CN", "komal", "67858712", true);
        library.addBook(book2);

        ReferenceBook refBook1 = new ReferenceBook("advance java", "chirag savaliya", "6753451", true, "programming Language");
        library.addBook(refBook1);

        /*

        //check book avaibility
        System.out.println("\nAvailable Books:");
        library.listAvailableBooks();

        // Find a book by ISBN
        System.out.println("\nFinding a Book by ISBN '1234567890':");
        Book foundBook = library.findBookByISBN("1234567890");
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Remove a book by ISBN
        System.out.println("\nRemoving a Book 6785613451:");
        library.removeBook("6785613451");

        // List all available books after removal
        System.out.println("\n Available Books After Removal:");
        library.listAvailableBooks();
*/


        // Display the list of all available books
        System.out.println("List of Available Books:");
        library.listAvailableBooks();

        //remove book
        System.out.println("\nRemoving a Book 6785613451:");
        library.removeBook("6785613451");

        System.out.println("\nList of Available Books After Removal:");
        library.listAvailableBooks();

        // This has already been demonstrated by the listAvailableBooks() method
        System.out.println("\n Polymorphism:");
        library.listAvailableBooks();
    }



}
