package com.mycompany.restaurantapp;

import java.io.*;
import java.util.Scanner;

public class RestaurantApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = null;

        System.out.println("Welcome to the Restaurant App!");

        // Ask user to either sign up or log in
        System.out.print("Do you want to sign up or log in? (signup/login): ");
        String action = scanner.nextLine();

        if (action.equalsIgnoreCase("signup")) {
            // Sign up process
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            System.out.print("Enter your phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Enter your street address: ");
            String street = scanner.nextLine();

            System.out.print("Enter your city: ");
            String city = scanner.nextLine();

            // Create address and user
            Address userAddress = new Address(1, street, city);
            user = new User(1, name, email, password);
            user.setPhoneNumber(phoneNumber);
            user.setDeliveryAddress(userAddress);

            // Save user details
            user.signUp();
            System.out.println("Sign-up successful! Please log in next time using your email.");

        } else if (action.equalsIgnoreCase("login")) {
            // Login process
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Attempt login
            user = User.loadUserByEmail(email);
            if (user != null && user.getPassword().equals(password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed! Exiting.");
                return;
            }
        } else {
            System.out.println("Invalid action. Exiting.");
            return;
        }

        // Display menu
        Menu menu = new Menu(1);
        menu.addItem(new Item(1, "Pizza", 15.99, "Cheese and tomato pizza"));
        menu.addItem(new Item(2, "Burger", 9.99, "Beef burger with lettuce and tomato"));
        menu.addItem(new Item(3, "Pasta", 12.99, "Penne pasta with marinara sauce"));

        System.out.println("\nMenu:");
        for (Item item : menu.getMenuItems()) {
            System.out.println(item.getItemID() + ". " + item.getDetails());
        }

        // Create order
        Order order = new Order(1, user.getDeliveryAddress());
        while (true) {
            System.out.print("\nEnter the ID of the item to add to your order (or 0 to finish): ");
            int itemID = scanner.nextInt();
            if (itemID == 0) break;

            // Find the item by ID
            boolean itemAdded = false;
            for (Item item : menu.getMenuItems()) {
                if (item.getItemID() == itemID) {
                    order.addItemToOrder(item);
                    System.out.println(item.getName() + " added to the order.");
                    itemAdded = true;
                    break;
                }
            }
            if (!itemAdded) {
                System.out.println("Invalid item ID. Please try again.");
            }
        }

        // Ask user if they want to change the delivery address
        scanner.nextLine(); // Consume newline
        System.out.println("\nYour current delivery address is: " + order.getDeliveryAddress().getAddressDetails());
        System.out.print("Do you want to change the delivery address? (yes/no): ");
        String changeAddressResponse = scanner.nextLine();

        if (changeAddressResponse.equalsIgnoreCase("yes")) {
            System.out.print("Enter your new street address: ");
            String newStreet = scanner.nextLine();

            System.out.print("Enter your new city: ");
            String newCity = scanner.nextLine();

            Address newAddress = new Address(2, newStreet, newCity);
            order.updateDeliveryAddress(newAddress);
            user.setDeliveryAddress(newAddress); // Update user's address
            System.out.println("Delivery address updated successfully!");
        }

        // Save updated user data
        user.signUp(); // Overwrite the user data in the file

        // Place the order
        System.out.println("\nOrder summary:");
        System.out.println("Total before discount: $" + order.calculateTotal());

        // Apply Elite discount if applicable
        if (user.isElite()) {
            order.applyEliteDiscount();
            System.out.println("Total after Elite discount: $" + order.calculateTotal());
        }

        order.placeOrder();

        scanner.close();
    }
}
