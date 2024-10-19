package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1
{
        public static void main(String[] args) throws SQLException {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
            Statement statement = cn.createStatement();

            String str = "create table Employee (" +
                    "emp_id int," +
                    "emp_name varchar(20)," +
                    "salary double(7,2)" +
                    ")";
            statement.executeUpdate(str);
            System.out.println("Employee Table created.....");
        }
    }
