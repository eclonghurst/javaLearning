package ClassesObjects;

public class BookRunner {

    public static void main(String[] args) {
        Book tlotr = new Book();

        System.out.println(tlotr.bookDetails());

        tlotr.setName("The Lord Of The Rings");
        tlotr.setAuthor("J.R.R Tolkien");
        tlotr.setGenre("Fantasy");
        tlotr.setCost(18);
        tlotr.setCompleted(false);

        System.out.println(tlotr.bookDetails());

        Book aliceInWonderland = new Book();

        aliceInWonderland.setName("Alice in Wonderland");
        aliceInWonderland.setAuthor("Lewis Carroll");
        aliceInWonderland.setGenre("Fantasy Fiction");
        aliceInWonderland.setCost(8);
        aliceInWonderland.setCompleted(false);
        System.out.println(aliceInWonderland.bookDetails());

        Book headFirstJava = new Book();
        headFirstJava.setName("Head First Java");
        headFirstJava.setAuthor("Kathy Sierra & Bert Bates");
        headFirstJava.setGenre("Non-fiction");
        headFirstJava.setCost(14);
        headFirstJava.setCompleted(false);
        System.out.println(headFirstJava.bookDetails());

    }
}