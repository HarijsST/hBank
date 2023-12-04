package exercise.task10;

import java.util.ArrayList;
import java.util.List;

public class GramatuTesti {
    public static void main(String[] args) {
        Book nineteenEightyFour = new Book("1984", "George Orwell", 1949);
        Book prideAndPrejudice = new Book("Pride and Prejudice", "Jane Austen", 1813);
        Book greatGatsby = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book animalFarm = new Book("Animal Farm", "George Orwell", 1945);

        MyBookShelf bookShelf = new MyBookShelf();
        bookShelf.addBook(nineteenEightyFour);
        bookShelf.addBook(prideAndPrejudice);
        bookShelf.addBook(greatGatsby);
        bookShelf.addBook(animalFarm);
        List<Book> newBooks = new ArrayList<>();
        newBooks.add(nineteenEightyFour);
        bookShelf.addBooks(newBooks);
        List<Book> books = bookShelf.getAllBooks();
        for(Book i : books){
            System.out.println(i.getTitle());
        }
        System.out.println("Grāmatu skaits - " + books.size());
        MyBookShelf bookList = new MyBookShelf();
        bookList.addBook(nineteenEightyFour);
        bookList.addBook(prideAndPrejudice);
        bookList.addBook(greatGatsby);
        bookList.addBook(animalFarm);
        System.out.println(bookList.getAllBooks().size());
        System.out.println(bookList.getBooksByPartialTitle("Pride"));
        System.out.println(bookList.hasBookWithTitleAndAuthor("1984", "George Orwell"));
        System.out.println(bookList.hasBookWithTitleAndAuthor("Data Structures and Algorithms in Java", "Robert Lafore"));
        System.out.println("Gramatu vidējais vecums ir " + bookList.getAvarageReleaseYear() + " gadi");
        System.out.println(bookList.getRandomBook());
        bookList.printBooks();
        List<String> newAuthor = new ArrayList<>();
        newAuthor.add("George Orwell");
        newAuthor.add("Jane Austen");
        bookList.getBooksByMultipleAuthors(newAuthor);

        /*System.out.println(bookShelf.findBooksByAuthor("George Orwell"));
        System.out.println(bookShelf.findBookByTitle("Animal Farm"));
        System.out.println(bookShelf.findBookReleasedInPeriod(1940, 1949));
        bookShelf.removeBooksByAuthor("George Orwell");
        */

    }
}
