package exercise.task10_withMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBookShelf implements BookShelf {
    private final Map<String, List<Book>> booksMap;

    // 3. Versija
//    private final Map<String, Map<String, Book>> booksMap;

    // 1. Atslēga - String (Autors), vērtība būtu Map<String, Book> (autora grāmatas)
    // 2. Atslēga - String (Grāmatas nosaukums), vērtība būtu tad pati grāmata
    //isais pieraksts
    // Book book = booksMap.get("Geroge Orwell").get("1984");

    //Garais pieraksts
    // Map<String, Book> autoraGramatas = booksMap.get("Geroge Orwell");
    // Book book = autoraGramatas.get("1984");

    //         Key (Author)       Value (Books By Author)
    //       George Orwell       List(Animal Farm, 1984)
    //          Anna Karenina     List(Apple, Peach)

    // bookMap.values()  =  List(Collection)( List(Animal Farm, 1984), List(Apple, Peach))
    // newBookList = tukšs
    // List(Animal Farm, 1984) - 1. iterācija = newBookList.addAll() -> newBookList(Animal Farm, 1984)
    // List(Apple, Peach) - 2. iterācija = newBookList.addAll()  -> newBookList(Animal Farm, 1984, Apple, Peach)

    public MyBookShelf() {
        booksMap = new HashMap<>();
    }

    @Override
    public void addBook(Book book) {
        String author = book.getAuthor();
        if (booksMap.containsKey(author)) {
            booksMap.get(author).add(book);
        } else {
            List<Book> books = new ArrayList<>();
            books.add(book);
            booksMap.put(author, books);
        }
    }

    // 1.Dabū sarakstu ar visiem grāmatu sarakstiem List<List<Book>>
    // 2.Izveidot tukšu sarakstu ar grāmatām List<Book>
    // 3.Ar cikla palīdzību ej cauri katram iepriekš izveidotajam sarakstam (no punkta 1.)
    // 4.Katrā iterācijā grāmatu sarakstam pievieno visas tekošās grāmatas
    // 5. beigās atgriez aizpildītu sarakstu (to kuru uztaisīji punktā 2.)
    @Override
    public List<Book> getAllBooks() {
        List<List<Book>> values = new ArrayList<>(booksMap.values());
        List<Book> newBookList = new ArrayList<>();
        for (List<Book> authorBooks : values) {
            newBookList.addAll(authorBooks);
        }
        return newBookList;
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
        Book bookByTitle = null;
        for(Book books : getAllBooks()){
            if(books.getTitle().equals(title)){
                bookByTitle = books;
            }
        }
        return bookByTitle;
    }

    // Dabūjam visas grāmatas un tad meklējam pēc perioda
    @Override
    public List<Book> findBookReleasedInPeriod(int yearFrom, int yearTo) {
        List<Book> releasedPeriod = new ArrayList<>();
        for(Book books : getAllBooks()){
            if(books.getYear() >= yearFrom && books.getYear() <= yearTo){
                releasedPeriod.add(books);
            }
        }
        return releasedPeriod;
    }

    // Dabūjam autora grāmatas un no tā saraksta izņemam konkrēto grāmatu
    @Override
    public void removeBook(Book book) {
        List<Book> booksByAuthor = booksMap.get(book.getAuthor());
        if (booksByAuthor != null) {
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
        for(Book books : getAllBooks()){
            if (books.getTitle().equals(title)){
                removeBook(books);
            }
        }
    }

    @Override
    public void removeBooksByAuthor(String author) {
        booksMap.remove(author);
    }

    //For ciklā ejam cauri books
    // Katra iteracijā izsaucam metodi addBook ar tekošo grāmatu
    @Override
    public void addBooks(List<Book> books) {
        Book book = null;
        for(int i = 0; i <= books.size(); i++){
            addBook(book);
        }
    }
}
