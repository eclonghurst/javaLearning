package ClassesObjects;

public class BookRunnerConstruct {

    public static void main(String[] args) {
        BookConstruct tlotr = new BookConstruct("The Lord Of The Rings", "J.R.R Tolkien", 18, "Fantasy", false);

        System.out.println(tlotr);

        BookConstruct aliceInWonderland = new BookConstruct("Alice in Wonderland", "Lewis Carroll", 8, "Fantasy Fiction", false);

        System.out.println(aliceInWonderland);

        BookConstruct headFirstJava = new BookConstruct("Head First Java", "Kathy Sierra & Bert Bates", 14, false);

        System.out.println(headFirstJava);

        System.out.println(tlotr);
    }
}