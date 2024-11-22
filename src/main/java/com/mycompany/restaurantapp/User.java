package com.mycompany.restaurantapp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a user of the restaurant application.
 */
public class User {
    private int userID;
    private String name;
    private String email;
    private String password;
    private boolean isElite;
    private String phoneNumber; // Single phone number
    private Address deliveryAddress; // Single address

    // Constructor
    public User(int userID, String name, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isElite = false; // Default to non-elite
    }

    // Sign-up method to save user data to a file
    public void signUp() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
            String userData = userID + "," + name + "," + email + "," + password + "," + isElite +
                    ",Phone:" + phoneNumber +
                    ",Address:" + (deliveryAddress != null ? deliveryAddress.getAddressDetails() : "None");
            writer.write(userData);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Login method to check user credentials
    public static boolean login(String email, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userDetails = line.split(",");
                if (userDetails[2].equals(email) && userDetails[3].equals(password)) {
                    return true; // Login successful
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Login failed
    }

    
    public static User loadUserByEmail(String email) {
    try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] userDetails = line.split(",");
            if (userDetails[2].equals(email)) {
                int userID = Integer.parseInt(userDetails[0]);
                String name = userDetails[1];
                String password = userDetails[3];
                boolean isElite = Boolean.parseBoolean(userDetails[4]);
                String phoneNumber = userDetails[5];
                String[] addressParts = userDetails[6].split(";");
                Address address = new Address(1, addressParts[0], addressParts[1]);

                User user = new User(userID, name, email, password);
                user.setPhoneNumber(phoneNumber);
                user.setDeliveryAddress(address);
                user.setElite(isElite);
                return user;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
}

    
    
    
    
    
    // Setters and Getters for phone number and delivery address
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getPassword() {
        return password;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    // Getter and setter for Elite status
    public boolean isElite() {
        return isElite;
    }

    public void setElite(boolean elite) {
        isElite = elite;
    }
}