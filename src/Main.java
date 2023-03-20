public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Alexander", "Pushkin");
        System.out.println("firstAuthor = " + firstAuthor.getFirstName());
        System.out.println("firstAuthor = " + firstAuthor.getLastName());

        Author seconAuthor = new Author("Leo", "Tolstoy");
        System.out.println("secondAuthor.firstName = " + seconAuthor.getFirstName());
        System.out.println("secondAuthor.lastName = " + seconAuthor.getLastName());

        Book firstBook = new Book("Ruslan and Lyudmila", "Alexander Sergeyevich Pushkin", 1820);
        System.out.println("firstBook = " + firstBook.getName());
        System.out.println("firstBook = " + firstBook.getAuthor());
        System.out.println("firstBook = " + firstBook.getDateOfPublication());

        Book secondBook = new Book("War and peace", "Leo Nikolayevich Tolstoy", 1865);
        System.out.println("secondBook.name = " + secondBook.getName());
        System.out.println("secondBook.author = " + secondBook.getAuthor());
        System.out.println("secondBook.dateOfPublication = " + secondBook.getDateOfPublication());
        secondBook.setDateOfPublication(1869);
        System.out.println("secondBook.getDateOfPublication = " + secondBook.getDateOfPublication());
    }
}
