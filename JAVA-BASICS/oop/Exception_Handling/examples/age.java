package oop.Exception_Handling.examples;

import java.util.Scanner;

// Class definition
public class age {

    // Main method - program starts from here
    public static void main(String[] args) {

        // Scanner is used to take input from user
        Scanner sc = new Scanner(System.in);

        try {
            // Taking integer input from user
            int age = sc.nextInt();

            // Condition check
            if (age < 18) {

                // throw → used to manually create and throw an exception
                throw new Exception("Motha ho mgh ye");
            }

            // If no exception occurs
            System.out.println("You are eligible");

        } 
        
        // catch → used to handle exception
        catch (Exception e) {

            // e.getMessage() → returns the message of exception
            System.out.println(e.getMessage());
        }

        // Closing scanner (good practice)
        sc.close();
    }
}