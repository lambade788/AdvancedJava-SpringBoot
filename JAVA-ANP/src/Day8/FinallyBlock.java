package Day8;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a=10;
        try{
            System.out.println(a/0);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }
        finally {
            System.out.println("Hello World");
        }
        sc.close();

        System.out.println("It's Raining");
    }
}
