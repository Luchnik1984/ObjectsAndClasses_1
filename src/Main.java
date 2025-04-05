public class Main {

    // Метод возвращает результат сравнения книг по названию и автору.
    public static void comparingBooks(Book book0, Book book) {
        if (book0.equals(book)) {
            System.out.printf("%s и %s - Это одна и та же книга %n", book0, book);
        } else {
            System.out.printf("%s и %s - Это разные книги %n", book0, book);
        }
    }

    public static void main(String[] args) {
        Author author1 = new Author("Борис", "Пастернак");
        Author author2 = new Author("Фёдор", "Достоевский");
        Book book1 = new Book("Доктор Живаго", author1, 1957);
        Book book2 = new Book("Братья Карамазовы", author2, 1880);

        System.out.println(book1);
        System.out.println(book2);

        book2.setYearOfPublication(1881);

        System.out.println(book2 + " - Второе издание");

        Book book3 = new Book("Доктор Живаго", author1, 1957);
        System.out.println(book3 + " - переиздание");
        System.out.println();

        comparingBooks(book1, book2);
        comparingBooks(book1, book3);
    }
}