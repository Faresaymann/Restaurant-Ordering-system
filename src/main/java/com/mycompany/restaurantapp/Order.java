package com.mycompany.restaurantapp;

import java.util.*;

public class Order {
    private int orderID; // Unique identifier for the order
    private List<Item> orderItems=new ArrayList<>(); // List of items in the order
    private String deliveryAddress; // Delivery address for the order
    private float totalPrice; // Total price of the order

    // Constructor to initialize the order with an ID and delivery address
    public Order(int orderID, String deliveryAddress) {
        this.orderID = orderID;
        this.deliveryAddress = deliveryAddress;
        this.orderItems = new ArrayList<>(); // Initialize empty list for order items
    }

       // Default constructor
       public Order() {
           this.orderItems = new ArrayList<>(); // Always initialize the list
        }

       // Factory method to create an Order from a string
       public static Order fromString(String data) {
           String[] parts = data.split(";");
           int id = Integer.parseInt(parts[0].trim());
           String address = parts[1].trim();
           Order order = new Order(id, address);

           // Parse items
           for (int i = 2; i < parts.length; i++) {
               order.addOrderItem(Item.fromString(parts[i]));
           }
           return order;
       }

       // Method to add an item to the order
       public void addOrderItem(Item item) {
           System.out.println("Adding item: " + item.getName());
           this.orderItems.add(item); 
       }

   

    // Add an item to the order
    public void addItemToOrder(Item item) {
        orderItems.add(item);
        totalPrice += item.getPrice();
    }

    // Calculate total price
    public double calculateTotal() {
        return totalPrice;
    }

    // Update delivery address
    public void updateDeliveryAddress(String newAddress) {
        this.deliveryAddress = newAddress;
    }

    // Getters
    public int getOrderID() { return orderID; }
    public String getDeliveryAddress() { return deliveryAddress; }
    public List<Item> getOrderItems() { return orderItems; }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(orderID).append(";").append(deliveryAddress);
        for (Item item : orderItems) {
            sb.append(";").append(item.toString());
        }
        return sb.toString();
    }
}
