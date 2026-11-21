package com.example.webapphr3.Daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DaoBase {

    public Connection getConection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String username = "admin";
        String password = "l2sYaeIxFqWKyJBTLwcD";
        String database = "hr";
        String url = "jdbc:mysql://iweb2025.cr2sbw0ga7c9.us-east-1.rds.amazonaws.com:3306/" + database;

        return DriverManager.getConnection(url, username, password);
        //return DriverManager.getConnection("jdbc:mysql://34.132.80.85:3306/"+database,"root","V?pY@\\L7zUj>|^4@");

    }
}

