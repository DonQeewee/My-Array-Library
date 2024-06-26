public class Book implements Discount{

    final private String title;
    final private String author;
    final private Genre genre;
    private Double price;
    private boolean available;

    public Book(String title, String author, Genre genre, Double price, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.available = true;
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

    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                ", available=" + available +
                '}';
    }
    @Override
    public double getDiscountedPrice() {
        if (genre == Genre.FICTION){
            return price*0.9;
        }
        return price;
    }

}

