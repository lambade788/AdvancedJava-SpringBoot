package com.example;

import com.Repository.Studentrepository;
import com.model.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Studentrepository studentrepository = new Studentrepository();

//        studentrepository.createUser(new Student("Akash","akash@gmail.com",23));

//        studentrepository.updateuser(new Student("Akash Jadhav","akash12@gmail.com",24),3);

        studentrepository.deleteuser(3);

//        studentrepository.getuserbyid();

    }
}