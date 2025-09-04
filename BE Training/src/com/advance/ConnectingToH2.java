package com.advance;

import java.sql.*;
import java.util.Scanner;

public class ConnectingToH2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jdbcURL = "jdbc:h2:~/test";
        String user = "sa";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, user, password);
            System.out.println("Connected successfully!");

            Statement statement = connection.createStatement();

            
//            String createTableEmployee = "CREATE TABLE employee (" +
//                    "eid INT PRIMARY KEY, " +
//                    "ename VARCHAR(50), " +
//                    "esalary DECIMAL(10,2))";
//            statement.execute(createTableEmployee);
//            System.out.println("Employee table created");

            
            System.out.print("Enter number of employees to add: ");
            int numberOfEmployees = sc.nextInt();
            sc.nextLine(); 
            
            String insertEmployee = "INSERT INTO employee (eid, ename, esalary) VALUES (, , )";
            statement.executeUpdate(insertEmployee); 
            System.out.println("Sample employee data inserted.");

            for (int i = 1; i <= numberOfEmployees; i++) {
                System.out.println("Enter details for employee " + i);

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine(); 
            
                employee.setInt(1, i);  
                setString(2, name); 
                setDouble(3, salary);

                employee.executeUpdate();
            }  
            

            System.out.println("Employee data inserted successfully.");

           
            String selectSQL = "SELECT * FROM employee";
            ResultSet resultSet = statement.executeQuery(selectSQL);

            System.out.println("\nEmployee Table:");
            System.out.println("ID\tName\t\tSalary");
            while (resultSet.next()) {
                int id = resultSet.getInt("eid");
                String name = resultSet.getString("ename");
                double salary = resultSet.getDouble("esalary");
                System.out.println(id + "\t" + name + "\t\t" + salary);
            }

            connection.close();
            sc.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
}
}
