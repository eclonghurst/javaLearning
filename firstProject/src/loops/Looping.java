package loops;
import java.util.Scanner;

public class Looping {
    static void Seasons(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12 pls: ");
        int userNumber = scanner.nextInt();

        switch (userNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("You chose Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("You chose Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("You chose Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("You chose Autumn");
                break;
            default:
                System.out.println("Invalid number");
                Seasons();

        }
    }

    public static void main(String[] args) {

        Seasons();

        /*int x = 10;
        while (x > 0){
            System.out.println(x--);
        }
        System.out.println("We have lift off");*/

        /*int sum = 0;
        for (int i=0; i < 10; sum += i++) {
            System.out.println("Sum is " + sum);
        }*/
    }
}
