public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Борис","Пастернак");
        Author author2 = new Author("Фёдор","Достоевский");
        Book book1 = new Book("Доктор Живаго",author1,1957);
        Book book2 = new Book("Братья Карамазовы", author2, 1880);
        System.out.println("Первая книга: "+book1.getBookTittle()+". Автор - "+book1.getAuthorName()+
                ", дата публикации "+book1.getYearOfPublication()+ " год");
        System.out.println("Вторая книга: "+book2.getBookTittle()+". Автор - "+book2.getAuthorName()+
                ", дата публикации "+book2.getYearOfPublication()+ " год");

        book2.setYearOfPublication(1881);
        System.out.println("Вторая книга: "+book2.getBookTittle()+". Автор - "+book2.getAuthorName()+
                ", дата публикации, указанная на обложке книги - "+book2.getYearOfPublication()+ " год");
    }
}