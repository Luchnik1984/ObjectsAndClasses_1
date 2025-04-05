import java.util.Objects;

public class Book {
    private final Author authorName;
    private final String bookTitle;
    private int yearOfPublication;

    public Book(String bookTitle, Author authorName, int yearOfPublication) {
        this.authorName = authorName;
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "книга - " + this.bookTitle + ", автор " + this.authorName + " (год публикации " + this.yearOfPublication + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getYearOfPublication() == book.getYearOfPublication() && Objects.equals(getAuthorName(), book.getAuthorName()) && Objects.equals(getBookTitle(), book.getBookTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthorName(), getBookTitle(), getYearOfPublication());
    }
}
