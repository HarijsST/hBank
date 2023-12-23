package exercise.task10_withMap;

import java.util.*;

public class MyBookShelf implements BookShelf {
    private final Map<String, List<Book>> booksMap;

    //         Key (Author)       Value (Books By Author)
    //       George Orwell       List(Animal Farm, 1984)

    public MyBookShelf() {
        booksMap = new HashMap<>();
    }

    @Override
    public void addBook(Book book) {
        String author = book.getAuthor();
        if (booksMap.containsKey(author)) {
            booksMap.get(author).add(book);
        } else {
            booksMap.put(author, List.of(book));
        }
    }

    // 1.Dabū sarakstu ar visiem grāmatu sarakstiem List<List<Book>>
    // 2.Izveidot tukšu sarakstu ar grāmatām List<Book>
    // 3.Ar cikla palīdzību ej cauri katram iepriekš izveidotajam sarakstam (no punkta 1.)
    // 4.Katrā iterācijā grāmatu sarakstam pievieno visas tekošās grāmatas
    // 5. beigās atgriez aizpildītu sarakstu (to kuru uztaisīji punktā 2.)
    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public int getBookCount() {
        return booksMap.size();
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        return booksMap.get(author);
    }

    // Dabūjam visas grāmatas un tad meklējam pēc nosaukuma
    @Override
    public Book findBookByTitle(String title) {
        return null;
    }

    // Dabūjam visas grāmatas un tad meklējam pēc perioda
    @Override
    public List<Book> findBookReleasedInPeriod(int yearFrom, int yearTo) {
        return null;
    }

    // Dabūjam autora grāmatas un no tā saraksta izņemam konkrēto grāmatu
    @Override
    public void removeBook(Book book) {
        List<Book> booksByAuthor = booksMap.get(book.getAuthor());
        if(booksByAuthor != null){
            booksByAuthor.remove(book);
        }
    }

    //Dabūjam visas grāmatas
    //Atrodam grāmatu pēc nosaukuma
    //Un tad izsaucam removeBook(Book book)
    // Svarīgi!
    // booksMap.values().remove() // Šis nestrādās!
    // Kāpēc ? Jo booksMap.values() metode atgriez nemaināmu sarakstu! Vai arī to varētu saukt par "skatu"
    // Kāpēc? Jo ja tu izdzēsīsi kādu vērtību, tad var būt situācija,
    // ka ir atslēga (key), bet nav vērtība (value)
    // Svarīgi!
    @Override
    public void removeBookByTitle(String title) {

    }

    @Override
    public void removeBooksByAuthor(String author) {

    }

    @Override
    public void addBooks(List<Book> books) {

    }
}
