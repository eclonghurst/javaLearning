package ClassesObjects;

public class BookConstruct {

    private String name;
    private String author;
    private int cost;
    private String genre;
    private Boolean completed;
    public static String bookOwner = "Emily";

    public BookConstruct(){

    }
    public BookConstruct(String name, String author, int cost, String genre, Boolean completed) {
        this.name = name;
        this.author = author;
        this.cost = cost;
        this.genre = genre;
        this.completed = completed;
    }
    public BookConstruct(String name, String author, int cost,Boolean completed) {
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
