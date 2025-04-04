import java.util.Objects;

public class Book {
    private final Author authorName;
    private final String bookTittle;
    private int yearOfPublication;

    public Book(String bookTittle, Author authorName, int yearOfPublication) {
        this.authorName = authorName;
        this.bookTittle = bookTittle;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookTittle() {
        return this.bookTittle;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

//    public int getYearOfPublication() {
//        return this.yearOfPublication;
//    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "книга " + this.bookTittle + ", автор " + this.authorName + " (год публикации " + this.yearOfPublication+")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getAuthorName(), book.getAuthorName()) && Objects.equals(getBookTittle(), book.getBookTittle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthorName(), getBookTittle());
    }
}
