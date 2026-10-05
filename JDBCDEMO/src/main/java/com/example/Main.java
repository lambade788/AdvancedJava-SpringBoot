package com.example;

import com.Repository.Studentrepository;
import com.Repository.TeacherRepository;
import com.model.Student;
import com.model.Teachers;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Studentrepository studentrepository = new Studentrepository();

        TeacherRepository teacherRepository = new TeacherRepository();

//        teacherRepository.createteacher(new Teachers("Khade","khade@gmail.com","English"));

        teacherRepository.updateteacher(new Teachers("Rajesh Khade","rkhade@gmail.com","English"),1L);

//        studentrepository.createUser(new Student("Akash","akash@gmail.com",23));

//        studentrepository.updateuser(new Student("Akash Jadhav","akash12@gmail.com",24),3);

//        studentrepository.deleteuser(3);

//        studentrepository.getuserbyid();

    }
}