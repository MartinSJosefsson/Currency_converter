package se.lexicon;

public class Converter {
    // todo: needs completion

    public static double convertSekToUsd(double sekAmount) {
        double usdAmount = sekAmount * ExchangeRates.SEK_TO_USD_RATE;
        System.out.println("USD: ");
        return usdAmount;
    }
    public static double convertUsdToSek(double usdAmount){
        double sekAmount = usdAmount * ExchangeRates.USD_TO_SEK_RATE;
        System.out.println("SEK: ");
        return sekAmount;
    }
    public static double convertSekToEuro(double sekAmount){
        double euroAmount = sekAmount * ExchangeRates.SEK_TO_EURO_RATE;
        System.out.println("Euro: ");
        return euroAmount;
    }
    public static double convertEuroToSek(double euroAmount){
        double sekAmount = euroAmount * ExchangeRates.EURO_TO_SEK_RATE;
        System.out.println("SEK: ");
        return sekAmount;
    }


}
