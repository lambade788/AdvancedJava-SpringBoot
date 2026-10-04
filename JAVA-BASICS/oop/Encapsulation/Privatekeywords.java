package oop.Encapsulation;

// this all concept called Encapsulation.
//getter setter are used for private properties or attributes.
class School{
    String name="Raghav";
    private int rollno;
    double marks;

     void print(){
        System.out.println(rollno);
    }

    int getrollno(){      //getter
        return rollno;
    }

    int setrollno(int x){ //setter
        rollno = x;
        return rollno;
    }
}

public class Privatekeywords{
    
    public static void main(String[] args) {
        School s1 = new School();
        s1.name="Parag";
        System.out.println(s1.name);
        School s2 = new School();
        System.out.println(s2.name);
        s1.print();

        System.out.println(s1.getrollno());
        s1.setrollno(45);
        
        System.out.println(s1.getrollno());
        
        
    }
}