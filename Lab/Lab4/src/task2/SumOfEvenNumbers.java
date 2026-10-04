package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEvenNumbers {

    // Method to calculate the sum of even numbers
    public static int findEvenSum(ArrayList<Integer> numbers) {

        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for(int i=0;i<n;i++){
            a1.add(sc.nextInt());
        }

        // Call the method
        int evenSum = findEvenSum(a1);

        System.out.println("Sum of even numbers from Arraylist is:"+evenSum);


    }
}
