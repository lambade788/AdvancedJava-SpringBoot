package com.Repository;

import com.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Studentrepository {

    String url="jdbc:mysql://127.0.0.1:3306/student_db";
    String username="root";
    String password="Lambade@12";

//    public void createUser() {
//        try {
//            Connection connection = DriverManager.getConnection(url, username, password);
//
//            Statement statement = connection.createStatement();
//
//            String sql ="INSERT INTO student(name,email,age)" +
//                    "VALUES('Rahul','rlambade@gmail.com',22);" ;
//
//            int result = statement.executeUpdate(sql);
//
//            if(result==1){
//                System.out.println("Data Stored");
//            }
//            else {
//                System.out.println("Failed");
//            }
//
//            connection.close();
//        } catch (SQLException s) {
//            System.out.println("Failed to connect" + s);
//        }
//    }




    public void createUser(Student student) {

        String sql ="INSERT INTO student(name,email,age)" +
                "VALUES(?,?,?);" ;
        try(Connection connection = DriverManager.getConnection(url, username, password);

            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2,student.getEmail());
            preparedStatement.setInt(3,student.getAge());

            int rowAffected = preparedStatement.executeUpdate();

            if(rowAffected == 1) {
                System.out.println("Create Student successful");
            }
            else {
                System.out.println("Create Student failed");
            }

        } catch (SQLException s) {
            System.out.println("Failed to connect" + s);
        }
    }


    public void updateuser(Student student,int id){

        String sql = """
                     UPDATE student
                     SET name = ?,
                         email = ?,
                         age = ?
                     WHERE id = ?
""";

        try(Connection connection = DriverManager.getConnection(url, username, password);

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {

            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getEmail());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.setInt(4, id);

            int result = preparedStatement.executeUpdate();

            if(result==1){
                System.out.println("Updated successfully.");
            }
            else {
                System.out.println("Failed.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteuser(int id){


        String sql = "DELETE from student WHERE id=?";

        try(Connection connection = DriverManager.getConnection(url, username, password);

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setInt(1, id);

            int result = preparedStatement.executeUpdate();

            if(result==1){
                System.out.println("Delete successfully.");
            }
            else {
                System.out.println("Failed.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void getuserbyid(int id){

        String sql = """
                SELECT id, name, email, age FROM student
                WHERE id = ?
                """;
        try(Connection connection = DriverManager.getConnection(url, username, password);

            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, id);


            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                if(resultSet.next()) {
                    Student student = mapRow(resultSet);
                    System.out.println(student);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void getStudent() {

        String sql = """
                SELECT id, name, email, age FROM student
                """;

        try(
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement =
                        connection.prepareStatement(sql);
        ) {

            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                List<Student> studentList = new ArrayList<>();

                while(resultSet.next()) {
                    Student student = mapRow(resultSet);
                    studentList.add(student);
                    System.out.println(student);
                }
            }
        }
        catch(SQLException e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }


    public void completeCRUD() {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String sql = "SELECT id, name, email, age " +
                    "FROM student where id = 7";

            boolean result = statement.execute(sql);

            if(result) {
                ResultSet resultSet = statement.getResultSet();
            }
            else {
                int rowAffected = statement.getUpdateCount();
            }

            connection.close();
        }
        catch(SQLException e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }

    private Student mapRow(ResultSet resultSet) throws SQLException {
        Student student = new Student();

        student.setId(resultSet.getLong("id"));
        student.setName(resultSet.getString("Name"));
        student.setEmail(resultSet.getString("Email"));
        student.setAge(resultSet.getInt("Age"));

        return student;

    }


}
