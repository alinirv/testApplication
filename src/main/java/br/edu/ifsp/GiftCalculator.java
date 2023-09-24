package br.edu.ifsp;

public class GiftCalculator {
    private int sideA;
    private int sideB;

    public int calculateWeight() {
        int sumWeightGifts = sideA - sideB;
        return sumWeightGifts;
    }

    public boolean checksBalance(int[] weightGifts) {

        for (int i = 0; i < weightGifts.length; i++) {
            int gifts = weightGifts[i];
            if (calculateWeight() <= 5) {
                if (sideA <= sideB) {
                    sideA = +gifts;
                } else {
                    sideB = +gifts;
                }
            }else {
                return false;
            }
        }
        return true;
    }
}
