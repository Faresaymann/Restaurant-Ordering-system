package com.mycompany.restaurantapp;

/**
 * Represents a bill generated for an order.
 */
public class Bill {
    private int billID; // Unique identifier for the bill
    private Order order; // Order associated with this bill
    private float totalAmount; // Total amount of the order
    private float discountedAmount; // Total amount after applying discounts

    // Constructor to initialize a bill
    public Bill(int billID, Order order) {
        this.billID = billID;
        this.order = order;
        this.totalAmount = (float) order.calculateTotal();
        this.discountedAmount = totalAmount; // Default to totalAmount, before discount
    }

    // Returns the order associated with this bill (placeholder method, revise if needed)
    public int getOrder() { return 0; }

    // Getter for billID
    public int getBillID() { return billID; }

    // Getter for total amount
    public float getTotalAmount() { return totalAmount; }

    // Getter for discounted amount
    public float getDiscountedAmount() { return discountedAmount; }
}
