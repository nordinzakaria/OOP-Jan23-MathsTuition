package com.example.mathtuitioncenter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseSingle {
    private String url;
    private String port;
    private String db;
    private String username;
    private String passwd;
    private Connection con;

    public DatabaseSingle(String url, String port, String db,
                    String username, String passwd) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e){ System.out.println(e);}

        // assign attributes
    }

    public void connect() {
        // change string to attribute
        try {
            con = DriverManager.getConnection(
                    this.url + ":" +this.port+"/"+this.db,
                    this.username, this.passwd);
        }
        catch(Exception e){ System.out.println(e);}

    }

    public void runQuery(String query) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Student");
            while (rs.next())
                System.out.println(rs.getString(1));
        }
        catch(Exception e){ System.out.println(e);}

    }

    public void close() {
        try {
            con.close();
        }
        catch(Exception e){ System.out.println(e);}
    }

    public static void display() {
        System.out.println("You are in DatabaseSingle class");
    }


}
