package org.vincent.currency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CurrencyConverterTest {

    @Test
    void convert() {
        assertEquals(1476.5, CurrencyConverter.convert("USD","JPY",10));
        assertEquals(1476.5, CurrencyConverter.convert("usd","jpy",10));
        assertEquals(1.09, CurrencyConverter.convert("EUR","USD",1));
        assertEquals(0.79, CurrencyConverter.convert("usd","gbp",1));
        assertEquals(0.86, CurrencyConverter.convert("eur","gbp",1));
    }
}