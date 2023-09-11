package ArraysLists;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String name;
    private String author;
    private int cost;
    private String genre;
    private Boolean completed;
    public static String bookOwner = "Emily";

    public Book() {

    }

    public Book(String name, String author, int cost, String genre, Boolean completed) {
        this.name = name;
        this.author = author;
        this.cost = cost;
        this.genre = genre;
        this.completed = completed;
    }
    public Book(String name, String author, int cost, Boolean completed) {
        this.name = name;
        this.author = author;
        this.cost = cost;
        this.completed = completed;
    }
    public String toString() {
            return name + " is a " + genre + " book, written by " + author + " that costs £" + cost + ". Read by " + bookOwner + " = "
                    + completed;
    }


}
