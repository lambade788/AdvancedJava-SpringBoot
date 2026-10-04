package oop.Problems;
import java.util.*;
public class tcs{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the bill amount");
        int a = sc.nextInt();
        int b;

        if(a <1000){
             b =a *5/100;
             int c= a-b;
            System.out.println(c);
        }else if(1000 <= a && a <= 5000){
            b= a*5/100;
            int c= a-b;
            System.out.println(c);
        }else if(a >= 10000){
             b=a*10/100;
             int c= a-b;
            System.out.println(c);
        }

    }
}


// Perfect 🔥 this is how toppers prepare — **topic-wise practice**.
// I’ll give you **1–2 strong questions per topic** (interview level mix).

// ---

// # 🔹 1. Class & Object

// 👉 **Q1:** Create a class `Student` with fields (name, age).
// Create object and print details.

// 👉 **Q2:** Create 3 objects and store in array.

// ---

// # 🔹 2. Encapsulation + Getter/Setter

// 👉 **Q:** Create class `BankAccount`

// * private balance
// * getter & setter
// * prevent negative balance

// ---

// # 🔹 3. Constructors

// 👉 **Q:** Create class `Car`

// * default constructor
// * parameterized constructor
//   Print values

// ---

// # 🔹 4. Constructor Overloading

// 👉 **Q:** Create class `Employee`

// * constructor with name
// * constructor with name + salary

// ---

// # 🔹 5. Inheritance

// 👉 **Q:** Create:

// * `Animal` (eat method)
// * `Dog` (bark method)

// Call both methods

// ---

// # 🔹 6. Hierarchical Inheritance

// 👉 **Q:** Create:

// * `Shape`
// * `Circle`, `Rectangle`
//   Each prints its type

// ---

// # 🔹 7. Method Overriding + Runtime Polymorphism 🔥

// 👉 **Q:** Create:

// * `Vehicle` → start()
// * `Car` → override start()

// Use:

// ```java
// Vehicle v = new Car();
// ```

// ---

// # 🔹 8. Abstraction (Abstract Class)

// 👉 **Q:** Create abstract class `Payment`

// * abstract method `pay()`

// Child:

// * `UPI`, `Card`

// ---

// # 🔹 9. Interface

// 👉 **Q:** Create interface `Playable`

// * method `play()`

// Class:

// * `Football`, `Cricket`

// ---

// # 🔹 10. super keyword

// 👉 **Q:** Parent class `Person` (name)
// Child class `Student`
// Use `super` to call parent constructor

// ---

// # 🔹 11. this keyword

// 👉 **Q:** Create class with constructor
// Use `this` to differentiate variables

// ---

// # 🔹 12. static keyword

// 👉 **Q:** Create class `Counter`

// * static variable count
// * increment when object created

// ---

// # 🔹 13. final keyword

// 👉 **Q:** Create:

// * final variable
// * final method
// * final class

// Try modifying → observe error

// ---

// # 🔹 14. Access Modifiers

// 👉 **Q:** Create class with:

// * private
// * public
// * protected

// Access from another class

// ---

// # 🔹 15. Object Class Methods

// 👉 **Q:** Override:

// * `toString()`
// * `equals()`

// ---

// # 🔹 16. Exception Handling

// 👉 **Q:** Take two numbers

// * divide
// * handle divide by zero

// 👉 **Q2:** Handle invalid input (string instead of int)

// ---

// # 🔹 17. Recursion (Extra)

// 👉 **Q1:** Factorial
// 👉 **Q2:** Fibonacci
// 👉 **Q3:** Reverse number

// ---

// # 🔥 BONUS (VERY IMPORTANT 🔥🔥)

// 👉 Combine everything:

// **Q:** Create mini system:

// * Employee / Bank
// * Use:

//   * inheritance
//   * encapsulation
//   * exception
//   * menu

// ---

// # 💡 Study Strategy (IMPORTANT)

// 👉 Don’t just read — do this:

// 1. Solve 2–3 questions daily
// 2. Write code without copy
// 3. Explain aloud (like interview)



