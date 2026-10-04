// package oop.object_class;

// class Student {
//     int id;
//     String name;

//     Student(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     @Override
//     public int hashCode() {
//         return id + name.hashCode();
//     }

//     @Override
//     public boolean equals(Object obj) {
//         Student s = (Student) obj;
//         return id == s.id && name.equals(s.name);
//     }
// }

// public class hashcodemethod {
//     public static void main(String[] args) {
//         Student s1 = new Student(1, "Rahul");
//         Student s2 = new Student(1, "Rahul");

//         System.out.println(s1.hashCode());
//         System.out.println(s2.hashCode());
//     }
// }
