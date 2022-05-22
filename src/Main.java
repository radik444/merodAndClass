public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Лев", "Толстой");

        book book1 = new book("Метель", 1865, author1);
        book book2 = new book( "Война и мир", 1825, author2);

        System.out.println(book1.getTitle() + " " + book1.getYear() + " " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        System.out.println(book2.getTitle() + " " + book2.getYear() + " " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());

        book1.setYear(1863);
        System.out.println(book1.getTitle() + " " + book1.getYear() + " " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname() );



    }}

