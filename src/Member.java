public class Member {

    private String name;
    private Book[] borrowedBooks;
    private int borrowedBookCount;
    private static final int maxBorrowingCapacity = 5;


    public Member(String name) {
        this.name = name;
        this.borrowedBooks = new Book[maxBorrowingCapacity];
        this.borrowedBookCount = 0;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (borrowedBookCount < maxBorrowingCapacity) {
            if (book.isAvailable()) {
                book.setAvailable(false);
                borrowedBooks[borrowedBookCount++] = book;
                System.out.println(name + " has just borrowed '" + book.getTitle() + "'.");
            } else {
                System.out.println("Sorry, the requested book is not available.");
            }
        } else {
            System.out.println("You have reached your maximum borrowing capacity.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBookCount > 0) {
            for (int i = 0; i < borrowedBookCount; i++) {
                if (borrowedBooks[i].equals(book)) {
                    book.setAvailable(true);
                    borrowedBooks[i] = borrowedBooks[borrowedBookCount - 1];
                    borrowedBookCount--;
                    System.out.println("'" + borrowedBooks[i].getTitle() + "' has been returned.");
                } else {
                    System.out.println("You have not borrowed '" + book.getTitle() + "'.");
                }
            }
        } else {
            System.out.println("You have not borrowed any books.");
        }
    }
}
