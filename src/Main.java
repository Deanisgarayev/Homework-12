public class Main {
    public static void main(String[] args) {
        Author author = new Author();
        author.firstName = "Alexander";
        author.lastName = "Pushkin";
        System.out.println("author.firstName = " + author.firstName);
        System.out.println("author.lastName = " + author.lastName);
        Book book = new Book();
        book.name = "Ruslan and Lyudmila";
        book.author = "Alexander Sergeyevich Pushkin";
        book.dateOfPublication = 1820;
        System.out.println("book.name = " + book.name);
        System.out.println("book.author = " + book.author);
        System.out.println("book.dateOfPublication = " + book.dateOfPublication);
    }
}
    //String name;
    //int age;
//}

//public class Main {
//    public static void main(String[] args) {
//        Person sarah = new Person();
//        sarah.name = "Sarah";
//        System.out.println("sarah.name = " + sarah.name);
//        sarah.age = 30;
//        System.out.println("sarah.age = " + sarah.age);
//    }
//} Alexander Sergeyevich Pushkin