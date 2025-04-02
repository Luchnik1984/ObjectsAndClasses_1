public class Author {
    private final String nameOfAuthor;
    private final String surnameOfAuthor;

    public Author (String nameOfAuthor, String surnameOfAuthor){
        this.nameOfAuthor = nameOfAuthor;
        this.surnameOfAuthor = surnameOfAuthor;
            }
            public String toString() {
        return nameOfAuthor+" "+surnameOfAuthor;
            }
}
