package day6;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Name:");

        String name = sc.next();

        switch (name){
            case "Raj":
                System.out.println("Male Student");
                break;
            case "Neha":
                System.out.println("Female Student");
                break;
            default:
                System.out.println("Invalid name.");
        }
    }
}
