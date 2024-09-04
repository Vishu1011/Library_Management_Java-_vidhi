package LibraryManagementSystem;

public class Library {

    private Book[] b1;
    private int count;

    // Constructor
    public Library() {
        b1 = new Book[10];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < b1.length) {
            b1[count] = book;
            count++;
            System.out.println("Book added: " + book.getTitle());
        } else {
            System.out.println("Library is full. can not add more books.");
        }
    }

    public void removeBook(String ISBN)
    {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (b1[i].getISBN().equals(ISBN)) {
                b1[i] = b1[count - 1];
                b1[count - 1] = null;
                count--;
                found = true;
                System.out.println("Book ISBN " + ISBN + " removed");
                break;
            }
        }
        if (!found) {
            System.out.println("Book " + ISBN + " not found");
        }
    }
    public Book findBookByISBN(String ISBN) {
        for (int i = 0; i < count; i++) {
            if (b1[i].getISBN().equals(ISBN)) {
                return b1[i];
            }
        }
        return null; // Return null if not found
    }

    public void listAvailableBooks() {
        boolean anyAvailable = false;
        for (int i = 0; i < count; i++) {
            if (b1[i].isAvailable()) {
                System.out.println("book is available"+b1[i]+toString());
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No any boos are available.");
        }
    }
}