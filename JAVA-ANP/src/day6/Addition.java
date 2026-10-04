package day6;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int a1=10; //static input
        int a2= sc.nextInt(); //dynamic input

        if(a1>a2){
            System.out.println("The value in a1 is greater");
        }
        else if(a1==a2){
            System.out.println("Both numbers are same");
        }
        else {
            System.out.println("The value in a2 is greater");
        }



    }
}
