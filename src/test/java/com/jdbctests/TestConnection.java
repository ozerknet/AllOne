package com.jdbctests;


import java.sql.*;

public class TestConnection {
    public static void main(String[] args) throws SQLException {

        String dbURL = "jdbc:oracle:thin:@54.163.189.18 :1521:XE";
        String dbUsername = "hr";
        String dbPassword = "hr";

        Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM regions");
/*
        resultSet.next();

        System.out.println(resultSet.getString("region_name"));
        System.out.println(resultSet.getString(2));

        System.out.println("------------------------------------------------");
        System.out.println(resultSet.getInt(1)+"-" + resultSet.getString(2));
        resultSet.next();
        System.out.println(resultSet.getInt(1)+"-" + resultSet.getString(2));
        resultSet.next();
        System.out.println(resultSet.getInt(1)+"-" + resultSet.getString(2));
        resultSet.next();
        System.out.println(resultSet.getInt(1)+"-" + resultSet.getString(2));
*/

        System.out.println("-----------------NOTES-----------------------------");
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+"-" + resultSet.getString(2));
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
