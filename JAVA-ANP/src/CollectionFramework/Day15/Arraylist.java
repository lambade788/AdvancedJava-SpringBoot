package CollectionFramework.Day15;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Rahul",24));
        students.add(new Student("aam",21));
        students.add(new Student("Rajesh",14));
        students.add(new Student("Rahul",88));


        Collections.sort(students);
        for(Student s:students){
            System.out.println(s);
        }





    }
}
