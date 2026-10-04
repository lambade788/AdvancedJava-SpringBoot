package oop.inheritance;

class Animal {
    String name = "Animal";

    void eat() {
        System.out.println(name + " is eating...");
    }
}

// Child class 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Child class 3
class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.name = "Dog";
        d.eat();      // inherited
        d.sound();

        System.out.println();

        Cat c = new Cat();
        c.name = "Cat";
        c.eat();      // inherited
        c.sound();

        System.out.println();

        Cow cw = new Cow();
        cw.name = "Cow";
        cw.eat();     // inherited
        cw.sound();
    }
}
