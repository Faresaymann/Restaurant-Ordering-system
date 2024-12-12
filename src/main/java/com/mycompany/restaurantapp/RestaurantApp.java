package com.mycompany.restaurantapp;

import java.util.Scanner;

public class RestaurantApp {

    public static User currentUser = null; // To store the logged-in user
    
        public static void main(String[] args) {


            /* Create and display the form */   
            Login LoginFrame= new Login();
            LoginFrame.setVisible(true);
            LoginFrame.pack();
            LoginFrame.setLocationRelativeTo(null);

        }

}

    

