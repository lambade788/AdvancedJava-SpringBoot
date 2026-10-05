package com.Repository;

import com.model.Teachers;

import java.io.PipedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TeacherRepository {

    String url="jdbc:mysql://127.0.0.1:3306/student_db";
    String username="root";
    String password="Lambade@12";


    public void createteacher(Teachers teachers){

        String sql = "INSERT INTO Teachers(Name,Email,Subject)" +
                "VALUES(?,?,?)";

        try(Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setString(1, teachers.getName());
            preparedStatement.setString(2, teachers.getEmail());
            preparedStatement.setString(3, teachers.getSubject());

            int result = preparedStatement.executeUpdate();


            if( result == 1) {
                System.out.println("Create Teachers successful");
            }
            else {
                System.out.println("Create Teachers failed");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void updateteacher(Teachers teachers,Long Id){

        String sql = "UPDATE Teachers " +
                "SET Name=?, Email=?, Subject=? " +
                "WHERE Id=?";

        try(Connection connection = DriverManager.getConnection(url,username,password);
              PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setString(1, teachers.getName());
            preparedStatement.setString(2, teachers.getEmail());
            preparedStatement.setString(3, teachers.getSubject());
            preparedStatement.setLong(4, Id);

            int result = preparedStatement.executeUpdate();


            if( result == 1) {
                System.out.println("Update Teachers successful");
            }
            else {
                System.out.println("Update Teachers failed");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
