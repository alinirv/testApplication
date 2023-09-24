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
        int resultOfComparingSides= 5;
        GiftCalculator calculator= new GiftCalculator();
        assertThat(calculator.checksBalance(resultOfComparingSides)).isTrue();
    }

}