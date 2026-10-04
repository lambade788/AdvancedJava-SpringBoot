package oop.polymorphism;

public class Polymorphism {

    public static class Dog{
        void voice(){
            System.out.println("Bhauu Bhauu");
        }
    }

    public static class Cat{
         void voice(){
            System.out.println("Meoww Meoww");
        }
    }

    public static class Crow{
         void voice(){
            System.out.println("Kau Kau");
        }
    }

    public static class Human{
         void voice(){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Dog Sheru = new Dog();
        Cat mau = new Cat();
        Crow kalwa = new Crow();
        Human raju =new Human();

        Sheru.voice();
        mau.voice();
        kalwa.voice();
        raju.voice();
    }
    
}
