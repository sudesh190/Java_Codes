package com.JDBC;

import java.sql.*;

public class ResultSet1
{
    public static void main(String[] args) throws SQLException
    {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
        Statement st = cn.createStatement();

        String str = "SELECT * FROM EMPLOYEE";

        ResultSet resultSet = st.executeQuery(str);
        while (resultSet.next())
        {
            System.out.println("emp_id:" + resultSet.getInt("emp_id")
                             + "emp_name:" + resultSet.getString("emp_name")
                             + "salary:" + resultSet.getDouble("salary")
                              );
        }
        cn.close();
        st.close();
        resultSet.close();
    }
}

