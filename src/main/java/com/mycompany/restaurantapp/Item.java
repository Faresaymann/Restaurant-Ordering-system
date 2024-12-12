package com.mycompany.restaurantapp;

import java.util.Objects;

/**
 * Represents a menu item in the restaurant.
 */
public class Item {
    private int itemID; // Unique identifier for the item
    private String name; // Name of the item
    private double price; // Price of the item
    private String description; // Description of the item

    // Constructor to initialize an item
    public Item(int itemID, String name, double price, String describtion) {
        this.itemID = itemID;
        this.name = name;
        this.price = price;
        this.description = description;
    }
 // Factory method to create an Item from a string
   public static Item fromString(String line) {
    // Assuming the line format is something like "itemID=1,name=ItemName,price=100"
    String[] parts = line.split(","); // Split by commas
    int itemID = -1;
    String name = "";
    double price = 0.0;
    String desc="";

    for (String part : parts) {
        if (part.startsWith("itemID=")) {
            itemID = Integer.parseInt(part.split("=")[1]); // Extract itemID
        } else if (part.startsWith("name=")) {
            name = part.split("=")[1]; // Extract name
        } else if (part.startsWith("price=")) {
            price = Double.parseDouble(part.split("=")[1]); // Extract price
        }else if (part.startsWith("price=")) {
            desc = part.split("=")[1]; // Extract desc
        }
    }

    return new Item(itemID, name, price, desc); // Create Item instance
    

   }
    
    // Getters
    public int getItemID() { return itemID; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return itemID == item.itemID && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemID, name);
    }

    @Override
    public String toString() {
        return "Item{" + "itemID=" + itemID + ", name=" + name + ", price=" + price + ", description=" + description + '}';
    }
    
}
