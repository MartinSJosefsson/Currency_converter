package se.lexicon;

import java.time.LocalDate;
import java.util.Scanner;

public class Consol {
    // todo: needs completion

public static void displayMenu() {

    System.out.println("Welcome to my currency converter");
    System.out.println("________________________________");
    System.out.println("1: SEK to USD");
    System.out.println("2: USD to SEK");
    System.out.println("3: SEK to Euro");
    System.out.println("4: Euro to SEK");
    System.out.println("0: Close converter");
    System.out.println("Choose currency exchange: ");

    }

    public static void displayRates (){
        System.out.println("________________________________");
        System.out.println("Exchange Rate as of" + LocalDate.now() + " :");



    }

    public static void performOperations (int operationNumber) {
double sekAmount, usdAmount;
        Scanner scanner = new Scanner(System.in);

    switch (operationNumber){
        case 1:



    }
    }
public static double getAmount(String currency) {
Scanner scanner = new Scanner(System.in);
    System.out.println("Enter amount in " + currency + " : ");
    return scanner.nextDouble();

}

public static void displayConversionResult (double fromAmount, double toAmount, String fromCurrency, String toCurrency){
    System.out.println(fromAmount );
}

}
