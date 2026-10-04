package oop.class_object_constructor.practice;
// **Q:** Create class `Car`

// * default constructor
// * parameterized constructor
//   Print values

class Car{
    String type;
    int number;

    Car(){
        type = "Unknown";
        number = 0;
    }

    Car(String type , int number){
        this.type=type;
        this.number=number;
    }

    public void print(){
        System.out.println("Type: "+type+" , number: "+number);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Car c1 = new Car("Sports",8);
        c1.print();

        Car c2 = new Car();
        c2.print();
    } 
}
