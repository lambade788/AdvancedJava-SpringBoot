package oop.Exception_Handling;

public class ThrowsExample {

    // Method declaring exception
    static void divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {

        try {
            divide(10, 0); // calling method
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
    }
}