package exercise.task10_withMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    }
}
