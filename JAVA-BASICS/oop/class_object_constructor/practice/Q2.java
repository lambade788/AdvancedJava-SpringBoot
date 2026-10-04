package oop.class_object_constructor.practice;

class student{
    String name;
    int age;

    student(String name,int age){
        this.name= name;
        this.age =age;
    }

    void print(){
        System.out.println("Name :"+name+" ,Age :"+age);
    }
}
public class Q2 {
    public static void main(String[] args) {
        student [] stud =new student[3];

        stud[0]=new student("raj", 21);
        stud[1]=new student("raj", 21);
        stud[2]=new student("raj", 21);

        for(int i=0; i<stud.length; i++){
            stud[i].print();
        }

    }
}
