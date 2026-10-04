package task1.start;

import task1.entity.User;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your nationality: ");
        String nationality = sc.nextLine();

        User us= new User(age,nationality);
        us.firstDose();
        us.secondDose();
        us.boosterDose();
    }
}
