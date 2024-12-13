package com.mycompany.restaurantapp;



public class EliteService {
    private static final float ELITE_FEE = 100; // Annual fee for Elite membership
    private static final float DISCOUNT_PERCENTAGE = 0.10f; // Discount percentage for Elite members

    // Returns the Elite membership fee
    public static float getEliteFee() {
        return ELITE_FEE;
    }

    // Returns the discount percentage for Elite members
    public static float getDiscountPercentage() {
        return DISCOUNT_PERCENTAGE;
    }

    // Applies the Elite discount to a given price
    public static float applyDiscount(float totalPrice) {
        return totalPrice * (1 - DISCOUNT_PERCENTAGE);
    }
}
