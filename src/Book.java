public class Book implements Discount{

    final private String title;
    final private String author;
    final private Genre genre;
    final private Double price;
    final private boolean availability;

    public Book(String title, String author, Genre genre, Double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.availability = availability;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public Double getPrice() {
        return price;
    }

    public boolean isAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }
    @Override
    public double getDiscountedPrice() {
        if (genre == Genre.FICTION){
            return price*0.9;
        }
        return price;
    }

    public static void main(String[] args) {

    }
}

