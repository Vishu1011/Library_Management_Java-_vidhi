# Task 1: Design a Book class
# Attributes:
o	title (String): The title of the book.
o	author (String): The author of the book.
o	ISBN (String): Unique identifier for the book.
o	available (boolean): Status indicating if the book is available for borrowing.
# Methods:
o	Constructor to initialize all attributes.
o	Getters and Setters for each attribute.
o	toString() method to return a string representation of the book.
# Task 2: Implement a Library class to manage books
# Attributes:
o	A fixed array of Book objects to store up to 10 books.
# Methods:
o	addBook(Book book): Method to add a new book to the library. If the array is full, print a message indicating that no more books can be added.
o	removeBook(String ISBN): Method to remove a book using its ISBN. If the book is not found, print an appropriate message.
o	findBookByISBN(String ISBN): Method to find and return a book using its ISBN. If the book is not found, return null.
o	listAvailableBooks(): Method to list all available books. If no books are available, print an appropriate message.
# Encapsulation:
o	Ensure all attributes of the Book class are private and provide public getter and setter methods.
Task 3: Demonstrate inheritance by creating a ReferenceBook class
# Attributes:
o	Inherits all attributes from the Book class.
o	Additional attribute: subject (String): The subject area of the reference book.
# Methods:
o	Getters and Setters for the subject attribute.
o	Override the toString() method to include the subject in the string representation.
# Implement polymorphism using method overriding
# 	Description:
o	Override the toString() method in the ReferenceBook class to demonstrate runtime polymorphism.
o	In the Library class, modify the listAvailableBooks() method to print the details of all available books using their toString() method. This will demonstrate polymorphism as the overridden method in ReferenceBook will be called when listing reference books.
________________________________________
# Real-Life Scenario Implementation
# Task 5: Implement a main method to demonstrate the functionality
# Scenario:
o	Create a Library object.
o	Add several books to the library, including both regular and reference books.
o	Display the list of all available books.
o	Remove a book and attempt to list the books again.
o	Demonstrate polymorphism by listing both Book and ReferenceBook objects.
