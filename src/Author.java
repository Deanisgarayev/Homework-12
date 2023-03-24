public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return "Имя " + firstName + " Фамилия " + lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (getClass() != getClass())
            return false;
        Author firstAuthor = (Author) other;
        return firstName.equals(firstAuthor.firstName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName);
    }
}
