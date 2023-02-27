package com.example.mathtuitioncenter;

import java.sql.*;

public class Database {

    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://db4free.net:3306/oopjan23utp","nordin","n00Pdinutp");
//here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from Student");
            while(rs.next())
                System.out.println(rs.getString(1));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
