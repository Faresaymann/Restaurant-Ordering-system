package com.mycompany.restaurantapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a menu containing multiple items.
 */
public class Menu {
    private int menuID; // Unique identifier for the menu
    private List<Item> menuItems; // List of items in the menu

    // Constructor to initialize a menu
    public Menu(int menuID) {
        this.menuID = menuID;
        this.menuItems = new ArrayList<>();
    }

    // Adds an item to the menu
    public void addItem(Item item) {
        menuItems.add(item);
    }

    // Returns the list of menu items
    public List<Item> getMenuItems() {
        return menuItems;
    }
}
