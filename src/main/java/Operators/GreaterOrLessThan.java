package Operators;

import java.util.Scanner;

public class GreaterOrLessThan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb1 = Integer.parseInt(scanner.nextLine());
        int numb2 = Integer.parseInt(scanner.nextLine());
        int numb3 = Integer.parseInt(scanner.nextLine());

        if (numb1 > numb2 && numb1 > numb3){
            System.out.println(numb1);
        }
        else if (numb2>numb1 && numb2>numb3){
            System.out.println(numb2);
        }
        else {
            System.out.println(numb3);
        }
        }

    }






