public class Book {
    private String name;
    private String author;
    private int dateOfPublication;

    public Book(String name, String author, int dateOfPublication) {
        this.name = name;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getDateOfPublication() {
        return this.dateOfPublication;
    }

    public void setDateOfPublication(int dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }
}
