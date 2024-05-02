import java.util.ArrayList;
import java.util.List;

public class Library {

    private Book[] bookshelf;
    private int size;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        size = 0;
        bookshelf = new Book[capacity];
    }


    public void addBook(Book book) {
        boolean bookExists = false;
        for (int b = 0; b < size; b++) {
            if (bookshelf[b].getTitle().equalsIgnoreCase(book.getTitle().trim())) {
                bookExists = true;
                System.out.println("Error: Book with title " + bookshelf[b].getTitle() + "  already exists in the library");
                break;
            }
        }
        if (!bookExists) {
            if (size < capacity) {
                bookshelf[size++] = book;
                System.out.println("Book with title " + book.getTitle().trim() + " added successfully");
            } else {
                System.out.println("Unable to add book with title " + book.getTitle().trim() + ". Library capacity reached");
            }
        }
    }

    public void getAllBooks() {
        for (int i = 0; i < size; i++) {
            if (bookshelf[i].isAvailable()) {
                System.out.println(bookshelf[i]);
            }

        }
    }


    public void removeBookByTitle(String title) {
        title = title.trim();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (bookshelf[i].getTitle().equalsIgnoreCase(title) && bookshelf[i].isAvailable()) {
                found = true;
                for (int j = i; j < size - 1; j++) {
                    bookshelf[j] = bookshelf[j + 1];
                }
                size--;
                System.out.println(bookshelf[i].getTitle() + " removed from the library");
                break;
            }
        }
        if (!found) {
            System.out.println(title + " not found");
        }
    }


    public void getBookByTitle(String title) {
        title = title.trim();
        boolean bookFound = false;
        for (int b = 0; b < size; b++) {
            if (bookshelf[b].getTitle().equalsIgnoreCase(title) && bookshelf[b].isAvailable()) {
                bookFound = true;
                System.out.println("book found: " + bookshelf[b]);
                break;
            }
        }
        if (!bookFound) System.out.println("No book found by title: " + title);

    }
}


