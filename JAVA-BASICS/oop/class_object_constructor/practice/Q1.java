package oop.class_object_constructor.practice;

//Q1. Create a class Student with fields (name, age).Create object and print details.

class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name ;
        this.age = age ;

    }

    public void print(){
        System.out.println("Name : "+ name);
        System.out.print("Age : "+ age);
    }
}
public class Q1{
    public static void main(String[] args) {
        Student S1 = new Student("Rahul",21);
        S1.print();
        

    }

}