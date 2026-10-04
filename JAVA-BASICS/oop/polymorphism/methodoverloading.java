package oop.polymorphism;

// Method overloading means:
// Same method name + different parameter list (type, number, or order)
// Method overloading is an OOP concept in Java where two or more methods in the same class have the same name 
// but different parameters (number, type, or order).

class calculator {
    int a;
    int b;

    // Method 1: add() with 2 integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: add() with 3 integer parameters
    // ✔ Same method name (add)
    // ✔ Different number of parameters → Method Overloading
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: add() with different data types
    // ✔ Same method name (add)
    // ✔ Different type of parameters (double, int) → Method Overloading
    public double add(double a, int b) {
        return a + b;
    }

    public String add(String str1 , String str2){
        return str1+" "+str2;
    }

    void print() {
        // normal method (not overloaded)
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        calculator c1 = new calculator();

        // Calls Method 1 → add(int, int)
        int r = c1.add(4, 4);
        System.out.println(r);

        // Calls Method 2 → add(int, int, int)
        int m = c1.add(4, 4, 4);
        System.out.println(m);

        // Calls Method 3 → add(double, int)
        System.out.println(c1.add(2.3, 3));

        System.out.println(c1.add("Rahul", "Lambade"));
    }
}