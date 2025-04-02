public class Book {
    private final String bookTittle;
    private final Author authorName;
    private int yearOfPublication;

    public Book(String bookTittle, Author authorName, int yearOfPublication){
        this.bookTittle = bookTittle;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
    }
    public String getBookTittle(){
        return this.bookTittle;
    }
    public Author getAuthorName(){
        return this.authorName;
    }
    public int getYearOfPublication(){
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
}
