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

    @Override
    public String toString() {
        return "Книга " + name + " Автор " + author + " Год публикаций " + dateOfPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book secondBook = (Book) other;
        return name.equals(secondBook.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}

