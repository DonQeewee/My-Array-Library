public class Main {


    public static void main(String[] args) throws Exception {
        Library library = new Library(8);
        Member member1 = new Member("Adeola James");

        Book book1 = new Book("Essential Maths", "T. D. James", Genre.SCIENCE, 1000.50, true);
        Book book2 = new Book("New English Course 1", "C. Macmillan", Genre.LANGUAGE, 950.00, true);
        Book book3 = new Book("France Afrique", "Jde Grandsaigne", Genre.LANGUAGE, 785.55, true);
        Book book4 = new Book("The trials of Brother Jero", "Wole Soyinka", Genre.LITERATURE, 600.00, true);
        Book book5 = new Book("A tale of two cities", "William Shakespeare", Genre.LITERATURE, 2040.00, true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book5);

        library.getAllBooks();


        member1.borrowBook(book3);
        member1.returnBook(book3);
        member1.returnBook(book4);
    }
}