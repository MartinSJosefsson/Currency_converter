package se.lexicon;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Consol {
    // todo: needs completion

    public static void displayMenu() {
        System.out.println("Welcome to my currency converter");
        System.out.println("________________________________");
        System.out.println("Exchange Rate as of:"+ LocalDate.now() + " :");
        System.out.println("________________________________");
        System.out.println("1: SEK to USD");
        System.out.println("2: USD to SEK");
        System.out.println("3: SEK to Euro");
        System.out.println("4: Euro to SEK");
        System.out.println("0: Close converter");
        System.out.println("Choose currency exchange: ");

    }

    public static void displayDates() {
        System.out.println("________________________________");
        System.out.println("Exchange Rate as of" + LocalDate.now() + " :");


    }

    public static void performOperations(int operationNumber) {
        double sekAmount, usdAmount, euroAmount;
        Scanner scanner = new Scanner(System.in);

        switch (operationNumber) {
            case 1:
                System.out.println("Enter amount: ");
                sekAmount = scanner.nextDouble();
                System.out.println( Converter.convertSekToUsd(sekAmount));
                break;
            case 2:
                System.out.println("Enter amount: ");
                usdAmount = scanner.nextDouble();
                System.out.println( Converter.convertUsdToSek(usdAmount));
                break;
            case 3:
                System.out.println("Enter amount: ");
                sekAmount = scanner.nextDouble();
                System.out.println( Converter.convertSekToEuro(sekAmount));
                break;
            case 4:
                System.out.println("Enter amount: ");
                euroAmount = scanner.nextDouble();
                System.out.println( Converter.convertEuroToSek(euroAmount));
                break;


        }
    }


    public static void start(){

        while (true) {
            Consol.displayMenu();
            System.out.println("Enter operation:");
            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();

            if (operation == 0) {
                // call the method to ask do you want to continue or no ...
                break;
            }
            Consol.performOperations(operation);


        }
    }


    /*public static double getAmount(String currency) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount in " + currency + " : ");
        return scanner.nextDouble();

    }

    public static void displayConversionResult(double fromAmount, double toAmount, String fromCurrency, String toCurrency) {
        System.out.println(fromAmount);
    }*/

}
