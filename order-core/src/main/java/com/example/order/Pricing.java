package com.example.order;

public class Pricing {

    public static double applyDiscount(double amount, double percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("percent must be 0..100");
        }
        return amount * (1.0 - percent / 100.0);
    }
}
