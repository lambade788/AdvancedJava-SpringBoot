package oop.inheritance;
//  **Q:** Create:

// // * `Animal` (eat method)
// // * `Dog` (bark method)

// // Call both methods

class Animal {
    String name = "Animal";

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    void dark() {
        System.out.println(name + " is barking");
    }
}

public class Q1 {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "Doggy";

        d1.eat();   // inherited method
        d1.dark();  // child method
    }
}