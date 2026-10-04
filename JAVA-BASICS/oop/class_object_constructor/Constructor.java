package oop.class_object_constructor;
// Classes Object And Constructor
public class Constructor{
    public static void main(String[] args) {
        // Student [] students=new Student[5];

        Student Kunal=new Student(12,"Rahul",89.6f);
        Student Rahul=new Student();
        Rahul.rollno=38;
        Rahul.marks=94;
        Rahul.name="Rahul Lambade";
        System.out.println(Kunal.rollno);
        System.out.println(Kunal.name);
        System.out.println(Kunal.marks);
        System.out.println(Rahul.name);
        System.out.println(Rahul.marks);

        Student Kirti=Rahul;
        System.out.println(Kirti.name);

      Kunal.print();
      Rahul.print();
        

    }

}
class Student{
        int rollno;
        String name;
        float marks;

        Student(){    //default constructor
            this.rollno=0;
            this.name="admin";
            this.marks=00;
        }

        Student(int rollno , String name, float marks){
            this.rollno=rollno;
            this.name=name;
            this.marks=marks;
        }

        void print(){
            System.out.println(rollno +" " +name+" "+ marks);
        }
    }