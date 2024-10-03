public class Book {
    private String isbn;
    private String title;
    private String author;
    private int pageCount;

    private long sumOfRatings;
    private long ratingCount;

    public Book(String isbn, String title, String author, int pageCount) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.sumOfRatings = 0;
        this.ratingCount = 0;
    }

    public void vote(int rating) {
        if (rating >= 1 && rating <= 5) {
            sumOfRatings += rating;
            ratingCount++;
        }
    }

    public double getAverageRating() {
        if (ratingCount == 0) {
            return 0;
        }
        else {
            return sumOfRatings / (double)ratingCount;
        }
    }

    public String toString() {
        double averageRating = getAverageRating();

        return String.format("Book %s by %s, isbn %s, page count %d, rating %.1f",
            title, author, isbn, pageCount, averageRating);
    }
}
