package br.edu.ifsp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class GiftCalculatorTest {
    @Test
    @DisplayName("Must balance gifts")
    void mustBalanceGifts(){
        GiftCalculator calculator= new GiftCalculator();
        int[] weightGifts = {4,6,2};
        assertThat(calculator.checksBalance(weightGifts)).isTrue();
    }

    @Test
    @DisplayName("Should unbalance gifts")
    void shouldUnbalanceGifts(){
        GiftCalculator calculator= new GiftCalculator();
        int[] weightGifts = {6,6,};
        assertThat(calculator.checksBalance(weightGifts)).isFalse();
    }
}