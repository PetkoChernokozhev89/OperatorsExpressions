package Operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 1:
                System.out.println("You enter 1.So week day is Monday");
                break;
            case 2:
                System.out.println("You enter 2.So week day is Tuesday");
                break;
            case 3:
                System.out.println("You enter 3.So week day is Wednesday");
                break;
            case 4:
                System.out.println("You enter 4.So week day is Thursday");
                break;
            case 5:
                System.out.println("You enter 5.So week day is Friday");
                break;
            case 6:
                System.out.println("You enter 6.So week day is Saturday");
                break;
            case 7:
                System.out.println("You enter 7.So week day is Sunday");
                break;


        }


    }
}
