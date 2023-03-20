public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Alexander", "Pushkin");
        System.out.println("firstAuthor = " + firstAuthor.firstName);
        System.out.println("firstAuthor = " + firstAuthor.lastName);

        Author seconAuthor = new Author("Leo", "Tolstoy");
        System.out.println("secondAuthor.firstName = " + seconAuthor.firstName);
        System.out.println("secondAuthor.lastName = " + seconAuthor.lastName);

        Book firstBook = new Book("Ruslan and Lyudmila", "Alexander Sergeyevich Pushkin", 1820);
        System.out.println("firstBook = " + firstBook.name);
        System.out.println("firstBook = " + firstBook.author);
        System.out.println("firstBook = " + firstBook.dateOfPublication);

        Book secondBook = new Book("War and peace", "Leo Nikolayevich Tolstoy", 1865);
        System.out.println("secondBook.name = " + secondBook.name);
        System.out.println("secondBook.author = " + secondBook.author);
        System.out.println("secondBook.dateOfPublication = " + secondBook.dateOfPublication);
        secondBook.setDateOfPublication(1869);
        System.out.println("secondBook.dateOfPublication = " + secondBook.dateOfPublication);
    }
}
