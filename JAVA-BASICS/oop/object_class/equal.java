package oop.object_class;


class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Student s = (Student) obj;

        return id == s.id && name.equals(s.name);
    }
}

public class equal {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(1, "Rahul");

        System.out.println(s1.equals(s2)); // true
    }
}