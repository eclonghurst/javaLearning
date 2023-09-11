package OOP;

public class Book {

    private String name;
    private String author;
    private int cost;
    private String genre;
    private Boolean completed;

    public String bookDetails(){
        return name + " is a " + genre + " book, written by " + author + " that costs £" + cost + ". Read = " + completed;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
