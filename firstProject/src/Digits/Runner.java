package Digits;

public class Runner {
    public static void main(String[] args) {

    int num = 57;
        System.out.println(addDigits(num));
    }

    private static int addDigits(int num) {
        if (num < 10 || num > 99)
            return -1;
        else {
            return num / 10 + num % 10;
        }
    }
}
