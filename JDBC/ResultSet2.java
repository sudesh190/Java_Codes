package com.JDBC;

import java.sql.*;

public class ResultSet2
{
    public static void main(String[] args) throws SQLException
     {
            Connection cn = null;
            Statement st = null;
            ResultSet resultSet = null;

            try {
                // Establishing the connection
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");

                // Creating a statement
                st = cn.createStatement();

                // SQL query
                String str = "SELECT * FROM EMPLOYEE";

                // Executing the query and getting the result set
                resultSet = st.executeQuery(str);

                // Processing the result set
                while (resultSet.next())
                {
                    System.out.println("emp_id:" + resultSet.getInt("emp_id")
                            + " emp_name:" + resultSet.getString("emp_name")
                            + " salary:" + resultSet.getDouble("salary")
                    );
                }
            } catch (SQLException e)
            {
                // Handle SQLException
                throw new RuntimeException(e);
            } finally
            {
                // Closing resources in the finally block to ensure they are closed even if an exception occurs
                        resultSet.close();
                        st.close();
                        cn.close();


                }
            }
        }



