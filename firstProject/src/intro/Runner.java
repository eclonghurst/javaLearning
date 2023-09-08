package intro;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int sizeOf = 5;
        int big = sizeOf * sizeOf * sizeOf;
        System.out.println(big);
        long bigger = big + big + big;
        System.out.println(bigger);
        double old = 78.0;
        System.out.println(old);
        boolean max = big > bigger;
        System.out.println(max);
        }
    }
