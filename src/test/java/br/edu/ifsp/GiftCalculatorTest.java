package br.edu.ifsp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GiftCalculatorTest {
    @Test
    @DisplayName("Must balance gifts")
    void mustBalanceGifts(){
        GiftCalculator calculator= new GiftCalculator();
        assertThat(calculator.checksBalance(5)).isTrue();
    }
}