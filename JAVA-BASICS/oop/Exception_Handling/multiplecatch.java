package oop.Exception_Handling;

import java.util.Scanner;

public class multiplecatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();

        int num[]= new int[6];


        try{
            int result = a/b;
            System.out.println("Result is :"+ result);
        }
        catch(ArithmeticException e){
            System.out.println("Cann't divide by zero.");
        }
        try{
            System.out.println(num[0]);
            System.out.println(num[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limit.");
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
        }
    }
}
