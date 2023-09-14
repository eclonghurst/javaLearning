package org.example;

public class Factorials {

    public static String ReverseFactorial(String factorial) {

        double result = Double.parseDouble(factorial);
        int count = 2;

        if (result == 1){return 0 + "!";}

        while (result != 1){
            result = result / count;
            if (result % 1 != 0){return "NONE";}
            count ++;
        }

        return count-1 + "!";
    }

}
