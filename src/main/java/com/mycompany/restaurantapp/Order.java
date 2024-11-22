package com.mycompany.restaurantapp;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID; // Unique identifier for the order
    private List<Item> orderItems; // List of items in the order
    private Address deliveryAddress; // Delivery address for the order
    private float totalPrice; // Total price of the order

    // Constructor to initialize the order with an ID and delivery address
    public Order(int orderID, Address deliveryAddress) {
        this.orderID = orderID;
        this.deliveryAddress = deliveryAddress;
        this.orderItems = new ArrayList<>(); // Initialize empty list for order items
    }

    /**
     * Adds an item to the order.
     * Updates the total price with the item's price.
     *
     * @param item the Item object to add to the order
     */
    public void addItemToOrder(Item item) {
        orderItems.add(item);
        totalPrice += item.getPrice(); // Update total price
    }

    /**
     * Calculates the total price of the order.
     * This method simply returns the current total price.
     *
     * @return the total price of the order
     */
    public float calculateTotal() {
        return totalPrice;
    }

    /**
     * Applies an Elite discount to the order's total price.
     * Uses the `EliteService` class to calculate the discounted price.
     */
    public void applyEliteDiscount() {
        totalPrice = EliteService.applyDiscount(totalPrice);
    }

    /**
     * Updates the delivery address for the order.
     *
     * @param newAddress the new Address object to set as the delivery address
     */
    public void updateDeliveryAddress(Address newAddress) {
        this.deliveryAddress = newAddress;
    }

    /**
     * Finalizes the order and displays a confirmation message.
     * Includes the delivery address in the message.
     */
    public void placeOrder() {
        System.out.println("Order placed successfully to " + deliveryAddress.getAddressDetails());
    }

    // Getter for delivery address
    public Address getDeliveryAddress() {
        return deliveryAddress;
    }
}
