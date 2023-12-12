package exercise.task3;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Clean Code");
        book.setAuthor("Robert Cecil Martin");
        book.setPageCount(403);
        System.out.println("Book title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Page Count: " + book.getPageCount());
    }
}
