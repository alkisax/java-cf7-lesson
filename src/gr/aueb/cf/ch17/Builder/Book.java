package gr.aueb.cf.ch17.Builder;

public class Book {
    private final long id;
    private final String isbn;
    private final String author;
    private final String title;

    //εδω έχει μια ενθυλακωμένη κλάση. αυτή λειτουργεί βασικά σαν constructor
    public static class Builder {
        private final long id;
        private final String isbn;
        //τα δύο πεδία τα παίρνει απο την βασική και φτιάχνει μόνο τα παρακάτω δύο
        private String author   =   "";
        private String title    =   "";

        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        // setter
        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }
        //στο τέλος βάζουμε αυτήν που μας γυρνά το ίδιο το αντικείμενο
        public Book build() {
            return new Book(this);
        }
    }

    //αυτός ειναι ο κανονικός κονστράκτορ αλλα τον έχουμε private γιατι χρησιμοποιούμε της μεθόδους της build
    private Book(Builder builder) {
        this.id = builder.id;
        this.author = builder.author;
        this.title = builder.title;
        this.isbn = builder.isbn;
    }

    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
