package Operators;

import java.util.Scanner;

public class SquareAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double square = a * b;
        double perimeter = 2 * (a + b);
        System.out.println("Square of rectangle is " + square);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
}
