package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2
{
    public static void main(String[] args)  throws SQLException
    {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","root");
        Statement st = cn.createStatement();

        String  str = "Insert into Employee values (1,'Sudesh',2500)";
        st.executeUpdate(str);
        System.out.println("Record Inserted Successfully....");
    }
}
