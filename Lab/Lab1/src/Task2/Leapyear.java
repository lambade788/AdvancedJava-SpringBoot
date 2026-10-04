package Task2;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a leap year:");
        int year = sc.nextInt();

        if((year%4 ==0  && year%100!=0) || (year%400 == 0)){
            System.out.println("This is a leap year");
        }
        else{
            System.out.println("This is not a leap year.");
        }
    }
}
