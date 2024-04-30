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


    public void addBook(Book book) throws Exception {

        if (size >= capacity) {
            throw new Exception("Unable to add book. Library capacity reached");
        } else {
            bookshelf[size] = book;
            size++;
            System.out.println("book added successfully");
        }
    }

    public void getAllBooks() {
        System.out.println("getting list of books");
        for (Book book : bookshelf) {
            System.out.println(book);
        }
    }

    public void removeBookByTitle(String title){
        boolean found = false;
        for (int i = 0; i < size; i++){
            if (bookshelf[i].getTitle().equalsIgnoreCase(title.trim()) && bookshelf[i].isAvailability()){
                found = true;
                for(int j = i; j < size - 1; j++){
                    bookshelf[j] = bookshelf[j + 1];
                }
                size--;
                System.out.println(title + " removed from the library");
                break;
            }
        }
        if (!found){
            System.out.println(title + "not found");
        }
    }


    public void getBookByTitle(String title) {
        boolean bookFound = false;
        for (int b = 0; b < size; b++) {
            if (bookshelf[b].getTitle().equalsIgnoreCase(title.trim()) && bookshelf[b].isAvailability()) {
                bookFound = true;
                System.out.println("book found: " + bookshelf[b]);
                break;
            }
        }
        if (!bookFound) System.out.println("No book found by title: " + title);

    }
}
