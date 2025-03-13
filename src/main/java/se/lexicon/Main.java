package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Converter calculator = new Converter();
        String input = "";

        while (true) {
            System.out.println("Welcome to my currency converter");
            System.out.println("________________________________");
            System.out.println("1: SEK to USD");
            System.out.println("2: USD to SEK");
            System.out.println("3: SEK to Euro");
            System.out.println("4: Euro to SEK");
            System.out.println("0: Close converter");
            System.out.println("________________________________");

            System.out.println("Choose currency exchange: ");
            double num1 = scanner.nextDouble();

            System.out.println("Choose amount: ");
            double num2 = scanner.nextDouble();


            double result = 0;
            boolean validOperation = true;

            input = scanner.nextLine();


            if (validOperation) {
                System.out.println("Result: " + result);
            }

            System.out.println("Would you like to continue? (y/n): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("n")) {
                System.out.println("Thank you for trying my calculator!");
                break;


            }


        }
    }

}