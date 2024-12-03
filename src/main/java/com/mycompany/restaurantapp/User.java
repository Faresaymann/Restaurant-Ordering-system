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
    public User() {
    }
    


    // Sign-up method to save user data to a file
   public void SignUp(String name, String email, String password, String address, String phoneNumber) {
    try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
         BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {

        // Determine the next userID
        int userID = 1; // Default userID for the first user
        String lastLine = null;
        String currentLine;

        // Read the file to find the last userID
        while ((currentLine = reader.readLine()) != null) {
            lastLine = currentLine;
        }

        if (lastLine != null) {
            String[] lastUserDetails = lastLine.split(",");
            userID = Integer.parseInt(lastUserDetails[0]) + 1; // Increment the last userID
        }

        // Prepare user data
        String userData = userID + "," + name + "," + email + "," + password +
                          ",Phone:" + phoneNumber +
                          ",Address:" + address;

        // Write the new user data to the file
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

    // Setters and Getters for phone number and delivery address
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
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