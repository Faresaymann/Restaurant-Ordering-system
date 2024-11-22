package com.mycompany.restaurantapp;

/**
 * Represents a delivery address for a user or an order.
 */
public class Address {
    private int addressID; // Unique identifier for the address
    private String street; // Street name of the address
    private String city; // City name of the address

    // Constructor to initialize an address
    public Address(int addressID, String street, String city) {
        this.addressID = addressID;
        this.street = street;
        this.city = city;
    }

    // Returns the full address details as a string
    public String getAddressDetails() {
        return street + ", " + city;
    }

    // Updates the address with details from another Address object
    public void setDeliveryAddress(Address ad) {
        this.street = ad.street;
        this.city = ad.city;
    }

    // Getter and Setter for addressID
    public int getAddressID() { return addressID; }
    public void setAddressID(int addressID) { this.addressID = addressID; }

    // Getter and Setter for street
    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    // Getter and Setter for city
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}
