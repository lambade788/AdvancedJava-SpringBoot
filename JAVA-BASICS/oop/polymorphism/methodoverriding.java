package oop.polymorphism;

/*
Definition of Method Overriding:
Method overriding is an OOP concept where a subclass provides its own implementation 
of a method that is already defined in its superclass, using the same method name, 
same parameters, and same return type.
*/

class calc {

    // Parent class method
    public int add(int a, int b) {
        return a + b;
    }
}

class Advance extends calc {

    // ✔ Method Overriding happens here
    // Same method name: add
    // Same parameters: (int a, int b)
    // Same return type: int
    // But different implementation
    public int add(int a, int b) {
        return a + b + 1;
    }
}
class Advance2 extends calc {

    // ✔ Method Overriding happens here
    // Same method name: add
    // Same parameters: (int a, int b)
    // Same return type: int
    // But different implementation
    public int add(int a, int b) {
        return a + b + 2;
    }
}


public class methodoverriding {
    public static void main(String[] args) {

        calc c1 = new calc();
        // Calls parent class method
        System.out.println(c1.add(2, 3));  // Output: 5

        Advance a1 = new Advance();
        // Calls overridden method (child class)
        System.out.println(a1.add(2, 3));  // Output: 6

        Advance2 a2 = new Advance2();
        System.out.println(a2.add(2, 3));  // Output: 7

         
    }
}