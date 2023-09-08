package loops;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        float numberOne = scanner.nextFloat();
        System.out.println("Please enter another number: ");
        float numberTwo = scanner.nextFloat();
        System.out.println("Please enter an operator: ");
        String operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.println(numberOne + numberTwo);
                break;
            case "-":
                System.out.println(numberOne - numberTwo);
                break;
            case "/":
                System.out.println(numberOne / numberTwo);
                break;
            case "%":
                System.out.println(numberOne % numberTwo);
                break;
            case "*":
                System.out.println(numberOne * numberTwo);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}
