package ArraysLists;

import java.util.ArrayList;
import java.util.List;

public class BookRunner {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("The Lord Of The Rings", "J.R.R Tolkien", 18, "Fantasy",false));
        books.add(new Book("Alice in Wonderland", "Lewis Carroll", 8, "Fantasy Fiction", false));

        // for loop
        /*for (int i=0; i<books.size(); i++){
            System.out.println(books.get(i));
        }*/

        // enhanced for loop
        for (Book b : books) System.out.println(b);
    }
}