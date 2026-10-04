package oop.class_object_constructor.practice;
// 4. Constructor Overloading

// 👉 **Q:** Create class `Employee`

// * constructor with name
// * constructor with name + salary

class Employee{
    String name;
    int salary;

    Employee(String name){
        this.name=name;
        this.salary=0;
    }

    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }

    void print (){
        System.out.println("name: "+name+" salary:"+salary);
    }
}



public class Q4 {
    public static void main(String[] args) {
        Employee e1 =  new Employee("Rahul");
        Employee e2 = new Employee("Rahul", 500000);
        e1.print();
        e2.print();
    }
}
