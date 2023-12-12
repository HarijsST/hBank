package exercise.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyBookShelf implements BookShelf{
    private final List<Book> books;

    public MyBookShelf() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public int getBookCount() {
        return books.size();
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> authorSubList = new ArrayList<>();
            for(Book book: books){
                if(book.getAuthor().equals(author)){
                    authorSubList.add(book);
                }
            }
        return authorSubList;
    }

    @Override
    public Book findBookByTitle(String title) {
        Book returnedBook = null;
        for(Book book : books){
            if(book.getTitle().equals(title)){
                returnedBook =  book;
            }
        }
        return returnedBook;
    }

    @Override
    public List<Book> findBookReleasedInPeriod(int yearFrom, int yearTo) {
        List<Book> bookListByPeriod = new ArrayList<>();
        for(Book book : books){
            if(book.getYear() >= yearFrom && book.getYear() <= yearTo){
                bookListByPeriod.add(book);
            }
        }
        return bookListByPeriod;
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);

    }

    @Override
    public void removeBookByTitle(String title) {
        Book deleteBookByTitle = findBookByTitle(title);
        books.remove(deleteBookByTitle);
    }

    @Override
    public void removeBooksByAuthor(String author) {
        List<Book> deleteBookByAuthor = findBooksByAuthor(author);
        books.removeAll(deleteBookByAuthor);
    }
    @Override
    public void addBooks(List<Book> books){
        this.books.addAll(books);
    }

    public List<Book> getBooksByPartialTitle(String keyword){
        List<Book> findByWordList = new ArrayList<>();
        for(Book book : books){
            if(book.getTitle().contains(keyword)){
                findByWordList.add(book);
            }
        }
        return findByWordList;
    }

    public List<Book> getBooksByMultipleAuthors(List<String> author){
        List<Book> multipleAuthorList = new ArrayList<>();
        for(Book book : books){
            if(author.contains(book.getAuthor())){
                multipleAuthorList.add(book);
            }
        }
        return multipleAuthorList;
    }

    public boolean hasBookWithTitleAndAuthor(String title, String author){
        for(Book book : books){
            if(book.getTitle().equals(title) && book.getAuthor().equals(author)){
                return true;
            }
        }
        return false;
    }

    public int getAvarageReleaseYear(){
        int yearCounter = 0;
        for(Book book : books){
            yearCounter = yearCounter + book.getYear();
        }
        return yearCounter / books.size();
    }

    public Book getRandomBook(){
        Random random = new Random();
        return books.get(random.nextInt(books.size()));
    }

    public void printBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }
}
