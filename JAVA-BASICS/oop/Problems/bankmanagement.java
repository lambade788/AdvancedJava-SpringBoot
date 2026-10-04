package oop.Problems;

import java.util.Scanner;

// 🔹 Bank Account Class (Encapsulation)
class BankAccount {
    private String name;
    private int accountNumber;
    private String branch;
    private String phone;
    private double balance;

    // 🔹 Constructor
    BankAccount(String name, int accountNumber, String branch, String phone) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.phone = phone;
        this.balance = 0; // initial balance
    }

    // 🔹 Deposit Method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully");
    }

    // 🔹 Withdraw Method
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Amount withdrawn successfully");
    }

    // 🔹 Display Details
    public void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Branch: " + branch);
        System.out.println("Phone: " + phone);
        System.out.println("Balance: " + balance);
    }
}

// 🔹 Main Class
public class bankmanagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // 🔹 Taking User Input
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Branch: ");
            String branch = sc.nextLine();

            System.out.print("Enter Phone: ");
            String phone = sc.nextLine();

            // 🔹 Creating Object
            BankAccount user = new BankAccount(name, accNo, branch, phone);

            int choice;

            do {
                System.out.println("\n1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount: ");
                        double dep = sc.nextDouble();
                        user.deposit(dep);
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        double wd = sc.nextDouble();
                        user.withdraw(wd);
                        break;

                    case 3:
                        user.display();
                        break;

                    case 4:
                        System.out.println("Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 4);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program Ended");
        }

        sc.close();
    }
}