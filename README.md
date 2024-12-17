## Restaurant Ordering System with Java GUI

This repository contains a Java GUI-based restaurant ordering system. The system allows users to sign up, log in, and place orders from a restaurant menu. It uses text files to store user and menu data persistently. The project includes features like Elite Membership with a 10% discount for premium users.

## Installation

To get started, clone this repository:

``` bash
git clone https://github.com/Faresaymann/Restaurant-Ordering-system.git
cd restaurant-ordering-system
```
Ensure you have Java Development Kit (JDK) installed.

## Features

User Authentication

Users can sign up and log in using their email and password.
User information is stored in a file (users.txt).
Menu Management

Menu items (item ID, name, price) are loaded from menu.txt.
Order System

Users can add items to their order and generate a bill.
Elite Membership

Elite members receive a 10% discount on their total bill.
## How to Run

Compile the Code:
Use the following commands to compile and run the program:

``` bash
javac RestaurantApp.java  
java RestaurantApp
```
Sign Up / Log In:

For first-time users, sign up with your details.
Existing users can log in using their credentials.
Place an Order:

Browse the menu and select items.
Finalize your order and view the total bill.
## File Structure

RestaurantApp.java - Main application file.
users.txt - Stores user data in the following format:
graphql
UserID,Name,Email,Password,Address,PhoneNumber,IsElite  
Example: 1,John Doe,john@example.com,password123,123 Main St,555-1234,true  
menu.txt - Stores the list of menu items:
makefile

ItemID,ItemName,Price  
Example: 1,Burger,$5.99
         2,Pizza,$8.49
## Example Output

When the application runs, users will see the following:

mathematica

Welcome to the Restaurant Ordering System!  

1. Sign Up  
2. Log In  
3. Exit


Example for Elite Discount:

yaml

Total Bill: $50.00  
Elite Discount Applied: 10%  
Final Amount: $45.00  
## Future Improvements

Add a database (e.g., MySQL) for persistent data storage.
Implement an admin panel for managing the menu and orders.
Improve the GUI with enhanced visuals and themes.
## License

This project is open-source and available .
