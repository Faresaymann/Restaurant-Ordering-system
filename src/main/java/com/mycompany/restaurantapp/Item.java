package com.mycompany.restaurantapp;

/**
 * Represents a menu item in the restaurant.
 */
public class Item {
    private int itemID; // Unique identifier for the item
    private String name; // Name of the item
    private double price; // Price of the item
    private String description; // Description of the item

    // Constructor to initialize an item
    public Item(int itemID, String name, double price, String description) {
        this.itemID = itemID;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getter for itemID
    public int getItemID() { return itemID; }

    // Getter for name
    public String getName() { return name; }

    // Getter for price
    public double getPrice() { return price; }

    // Getter for description
    public String getDescription() { return description; }

    // Returns item details as a string
    public String getDetails() {
        return name + ": " + description + " - $" + price;
    }
}
