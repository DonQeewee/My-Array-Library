public class Member {

    private Book[] booklist = new Book[50];
    private int sizes;
    private int capacity;

    public Member(int capacity) {
        this.capacity = capacity;
        sizes = 0;
        this.booklist = new Book[capacity];
    }
}
