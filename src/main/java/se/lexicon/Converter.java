package se.lexicon;

public class Converter {
    // todo: needs completion

    public static double convertSekToUsd(double sekAmount) {
        double usdAmount = sekAmount * ExchangeRates.SEK_TO_USD_RATE;
        return usdAmount;
    }
    public static double convertUsdToSek(double usdAmount){
        double sekAmount = usdAmount * ExchangeRates.USD_TO_SEK_RATE;
        return sekAmount;
    }
    public static double convertSekToEuro(double sekAmount){
        double euroAmount = sekAmount * ExchangeRates.SEK_TO_EURO_RATE;
        return euroAmount;
    }
    public static double convertEuroToSek(double euroAmount){
        double sekAmount = euroAmount * ExchangeRates.EURO_TO_SEK_RATE;
        return sekAmount;
    }


}
