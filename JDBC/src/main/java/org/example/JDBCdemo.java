package org.example;


import java.sql.*;

public class JDBCdemo {
    private static final String URL="jdbc:mysql://localhost:3306/DEMOJDBC";
    private static final String USER="root";
    private static final String PASSWORD="Lambade@12";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD)) {
            System.out.println(" Connected to Database.");
//            insertstudent(conn,"rahul","rahul@12");
            updatestudent(conn,3,"Akash","akash@gmail.com");
            updatestudent(conn,2,"Omkar","omkar@gmail.com");
            deletestudent(conn,3);
            selectstudent(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertstudent(Connection conn,String name,String email){
        String sql = "INSERT INTO STUDENT (name, email) VALUES ('" + name + "','" + email + "')";
        try (Statement stmt = conn.createStatement()) {
            int rows = stmt.executeUpdate(sql);
            System.out.println("INSERTED: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectstudent(Connection conn){
        String sql = "SELECT * FROM STUDENT";
        try(Statement stmt = conn.createStatement()){
            ResultSet resultSet = stmt.executeQuery(sql);
            System.out.println("Student List: ");
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println(id+" : "+ name + " : " + email);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }


    public static void updatestudent(Connection conn,int id ,String name,String email){
        String sql="UPDATE STUDENT SET name = ?,email= ? WHERE id = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setInt(3,id);
            int rows = pstmt.executeUpdate();
            System.out.println("UPDATED: "+rows);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void deletestudent(Connection conn,int id){
        String sql="DELETE FROM STUDENT WHERE id="+id;
        try(Statement stmt = conn.createStatement()){
            int rows = stmt.executeUpdate(sql);
            System.out.println("DELETE: "+rows);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}