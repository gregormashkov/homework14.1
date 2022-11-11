import java.util.Objects;

public class Author1 {
    private String firstname;
    private String surname;

    public Author1 (String imya, String familiya) {
        firstname = imya;
        surname = familiya;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Имя автора: " + firstname + ", Фамилия автора: " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author1 author = (Author1) o;
        return firstname.equals(author.firstname) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, surname);
    }
}

