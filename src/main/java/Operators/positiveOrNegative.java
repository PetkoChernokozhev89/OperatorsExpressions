package Operators;

import java.util.Scanner;

public class positiveOrNegative {
    public static void main(String[] args) {
        numberPositiveOrNegative(-5);

    }

    public static void numberPositiveOrNegative(int number) {

        if (number > 0) {
            System.out.println(number + " is Positive");
        } else if (number < 0) {
            System.out.println(number + " is Negative");
        } else {
            System.out.println(" it is neither positive or negative");
        }
    }


}


