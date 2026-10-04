package task2.Start;

import task2.entity.CreditCardPayment;
import task2.entity.DebitCardPayment;
import task2.entity.Payment;
import task2.entity.UPIPayment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        Payment payment;

        switch (choice) {
            case 1:
                payment = new UPIPayment();
                break;

            case 2:
                payment = new CreditCardPayment();
                break;

            case 3:
                payment = new DebitCardPayment();
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        payment.pay(amount);

        sc.close();
    }
}