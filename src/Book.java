public class Book {
    String name;
    String author;
    int dateOfPublication;

    public Book(String name, String author, int dateOfPublication) {
        this.name = name;
        this.author = author;
        this. dateOfPublication = dateOfPublication;
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

    public void setDateOfPublication(int date) {
        this.dateOfPublication = dateOfPublication;
    }
    }
