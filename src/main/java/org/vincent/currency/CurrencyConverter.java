package org.vincent.currency;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private static final Map<String, Double> TO_USD = new HashMap<>();
    private static final Map<String, Double> FROM_USD = new HashMap<>();

    static {
        // Convert to USD
        TO_USD.put("USD", 1.00);
        TO_USD.put("EUR", 1 / 0.92);  // = 1.087
        TO_USD.put("GBP", 1 / 0.79);  // = 1.266
        TO_USD.put("JPY", 1 / 147.65); // = 0.00677

        // Convert from USD
        FROM_USD.put("USD", 1.00);
        FROM_USD.put("EUR", 0.92);
        FROM_USD.put("GBP", 0.79);
        FROM_USD.put("JPY", 147.65);
    }

    public static double roundUp(double value) {
        return Math.ceil(value * 100) / 100;
    }

    public static double convert(String from, String to, double amount) {
        if (from.equalsIgnoreCase(to)) return amount;
        double amountInUSD;

        if(from.equalsIgnoreCase("usd")){
            amountInUSD = amount;
        } else {
            amountInUSD = amount * TO_USD.get(from.toUpperCase());
        }

        return roundUp(amountInUSD * FROM_USD.get(to.toUpperCase()));
    }
}
