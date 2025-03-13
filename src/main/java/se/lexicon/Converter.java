package se.lexicon;

public class Converter {
    // todo: needs completion

    public static double convertSekToUsd(double sekAmount){
        double usdAmount = sekAmount * ExchangeRates.SEK_TO_USD_RATE;
        return usdAmount;

    }


}
