public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Alexander", "Pushkin");
        System.out.println("firstAuthor = " + firstAuthor.getFirstName());
        System.out.println("firstAuthor = " + firstAuthor.getLastName());
        System.out.println(firstAuthor);

        Author seconAuthor = new Author("Leo", "Tolstoy");
        System.out.println("secondAuthor.firstName = " + seconAuthor.getFirstName());
        System.out.println("secondAuthor.lastName = " + seconAuthor.getLastName());
        System.out.println(seconAuthor);
        System.out.println(firstAuthor.equals(seconAuthor));

        Book firstBook = new Book("Ruslan and Lyudmila", "Alexander Sergeyevich Pushkin", 1820);
        System.out.println("firstBook = " + firstBook.getName());
        System.out.println("firstBook = " + firstBook.getAuthor());
        System.out.println("firstBook = " + firstBook.getDateOfPublication());
        System.out.println(firstBook);

        Book secondBook = new Book("War and peace", "Leo Nikolayevich Tolstoy", 1865);
        System.out.println("secondBook.name = " + secondBook.getName());
        System.out.println("secondBook.author = " + secondBook.getAuthor());
        System.out.println("secondBook.dateOfPublication = " + secondBook.getDateOfPublication());
        secondBook.setDateOfPublication(1869);
        System.out.println("secondBook.getDateOfPublication = " + secondBook.getDateOfPublication());
        System.out.println(secondBook);
        System.out.println(firstBook.equals(secondBook));
    }
}
