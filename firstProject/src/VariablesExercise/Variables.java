package VariablesExercise;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        /*String firstName = "Em";
        String lastName = "Long";
        String name = firstName + lastName;
        System.out.println(name);*/

        /*float num1 = 4F;
        float num2 = 16F;
        System.out.println(num1 + num2);
        float result = num1 / num2;
        System.out.println(result);

        int num3 = 8;
        System.out.println(num3);
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);*/

        // difference is that num3++ prints then adds, ++num3 adds then prints

        System.out.println("Enter your first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Your name is " + firstName + " " + lastName);
    }
}
