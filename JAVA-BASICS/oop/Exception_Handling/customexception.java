package oop.Exception_Handling;

import java.util.Scanner;

class Rahulexception extends Exception{
    public Rahulexception(String string){
        super(string);
    }
}
public class customexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        try{
             if(a < 0){
                throw new Rahulexception("Number can't be negative");
             }

             System.out.println("Number is Positive and its :"+a);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}


