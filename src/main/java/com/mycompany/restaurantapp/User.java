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
    private List<Item> orderItems = new ArrayList<>(); // List of items in the order
    private String phoneNumber; // Single phone number
    
    private String deliveryAddress; // Single address

    // Constructor
      public User() {
    }
    public User(int userID, String name, String email, String password,String address,String phonenumber) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber=phonenumber;
        this.deliveryAddress=address;
        this.isElite = false; // Default to non-elite
    }
  
    // Sign-Up Method
       public static User signUp(String name, String email, String password, String address, String phoneNumber) {
           try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {

               String line;
//               // Check if email already exists
//               while ((line = reader.readLine()) != null) {
//                   String[] userDetails = line.split(",");
//                   if (userDetails[2].trim().equalsIgnoreCase(email)) {
//                       System.out.println("Email already exists. Please use a different email.");
//                       return null;
//                   }
//               }

               // Determine next userID
               int userID = 1; // Default userID
               while ((line = reader.readLine()) != null) {
                   String[] userDetails = line.split(",");
                   userID = Integer.parseInt(userDetails[0]) + 1;
               }

               // Create new user
               User newUser = new User(userID, name, email, password, address, phoneNumber);

               // Save to `users.txt`
               writer.write(userID + "," + name + "," + email + "," + password + ",Phone:" + phoneNumber + ",Address:" + address);
               writer.newLine();

               // Create individual user file
               newUser.saveToFile();

            return newUser;
           } catch (IOException e) {
               e.printStackTrace();
           }
           return null;
       }

       // Login Method
       public static User login(String email, String password) {
           try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
               String line;
               while ((line = reader.readLine()) != null) {
                   String[] userDetails = line.split(",");
                   if (userDetails[2].equals(email) && userDetails[3].equals(password)) {
                       int userID = Integer.parseInt(userDetails[0]);
                       return loadFromFile(userID); // Load user data from file
                       
                   }
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
           return null; // Login failed
       }

        // Save User Data to Individual File
        public void saveToFile() {
           try (BufferedWriter writer = new BufferedWriter(new FileWriter("user_" + userID + ".txt"))) {
               writer.write("UserID:" + userID + "\n");
               writer.write("Name:" + name + "\n");
               writer.write("Email:" + email + "\n");
               writer.write("Password:" + password + "\n");
               writer.write("PhoneNumber:" + phoneNumber + "\n");
               writer.write("DeliveryAddress:" + deliveryAddress + "\n");
               writer.write("EliteStatus:" + isElite + "\n");
               writer.write("Orders:\n");
               
               //write the new items
               for (Item item : orderItems) {
                   writer.write(item.toString() + "\n");
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
       }

        public static User loadFromFile(int userID) {
            try (BufferedReader reader = new BufferedReader(new FileReader("user_" + userID + ".txt"))) {
                User user = new User();
                user.userID = userID;
                user.orderItems = new ArrayList<>(); // Initialize orderItems list

                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.startsWith("Name:")) user.name = line.split(":")[1];
                    else if (line.startsWith("Email:")) user.email = line.split(":")[1];
                    else if (line.startsWith("Password:")) user.password = line.split(":")[1];
                    else if (line.startsWith("PhoneNumber:")) user.phoneNumber = line.split(":")[1];
                    else if (line.startsWith("DeliveryAddress:")) user.deliveryAddress = line.split(":")[1];
                    else if (line.startsWith("EliteStatus:")) user.isElite = Boolean.parseBoolean(line.split(":")[1]);
                    else if (line.startsWith("Orders:")) {
                        // Reading the items properly
                        while ((line = reader.readLine()) != null && !line.isEmpty()) {
                            // Only parse if the line represents an item
                            if (line.startsWith("itemID=")) {
                                user.orderItems.add(Item.fromString(line)); // Assuming `Item.fromString` can handle the format
                            }
                        }
                    }
                }
                return user;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
    }



       public void placeOrder(Order order) {
        if (orderItems == null) {
            orderItems = new ArrayList<>();
        }
        orderItems.clear(); // Clear any previous items before adding new ones
        orderItems.addAll(order.getOrderItems()); // Add all items from the order
        saveToFile(); // Save user data with updated orders
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    // Sign-up method to save user data to a file
//   public void SignUp(String name, String email, String password, String address, String phoneNumber) {
//    try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
//         BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
//        
//        String currentLine;
//
//        
////         // Check if the email already exists
////        while ((currentLine = reader.readLine()) != null) {
////            String[] userDetails = currentLine.split(",");
////            if (userDetails[2].trim().equalsIgnoreCase(email)) {
////                System.out.println("Email already exists. Please use a different email.");
////                return;
////            }
////        }
//
//        // Determine the next userID
//        int userID = 1; // Default userID for the first user
//        String lastLine = null;
//        
//
//        // Read the file to find the last userID
//        while ((currentLine = reader.readLine()) != null) {
//            lastLine = currentLine;
//        }
//
//        if (lastLine != null) {
//            String[] lastUserDetails = lastLine.split(",");
//            userID = Integer.parseInt(lastUserDetails[0]) + 1; // Increment the last userID
//        }
//
//        // Prepare user data
//        String userData = userID + "," + name + "," + email + "," + password +
//                          ",Phone:" + phoneNumber +
//                          ",Address:" + address;
//
//        // Write the new user data to the file
//        writer.write(userData);
//        writer.newLine();
//        
//        //create a new user 
//        new User( userID,  name,  email,  password, address,phoneNumber);
//
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//}
//
//    
//    // Login method to check user credentials
//    public static boolean login(String email, String password) {
//        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] userDetails = line.split(",");
//                if (userDetails[2].equals(email) && userDetails[3].equals(password)) {
//                    return true; // Login successful
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return false; // Login failed
//    }
//
   
    
    //order of the user
    public void setOrderItems(List<Item> orderItems) {
        this.orderItems = orderItems;
    }
    
    public List<Item> getOrderItems() {
        return orderItems;
    }
    
//    public void Addorder(Order order){
//        order.getOrderItems();
//    }
    
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    // Getter and setter for Elite status
    public boolean isElite() {
        return isElite;
    }

    public void setElite(boolean elite) {
        isElite = elite;
    }

   @Override
    public String toString() {
        return "UserID: " + userID + "\nName: " + name + "\nEmail: " + email + "\nPhone: " + phoneNumber +
               "\nAddress: " + deliveryAddress + "\nElite Status: " + (isElite ? "Yes" : "No");
    }
    
}