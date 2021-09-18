package com.metroDemo.springbootmavenmetrodemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/metro_routes?useSSL=false";
        String user = "student";
        String password = "student";

        try {
            System.out.println("Connecting to DB");
            //Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection(jdbcUrl,user,password);
            System.out.println("Connected to DB");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
