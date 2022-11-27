package com.javaexcercises.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInsertExample {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DBUtils.connectToDatabase();

            if(connection != null) {
                // połączenie udane
                Statement insertStatement = connection.createStatement();
                int numberOfRowsInserted = insertStatement.executeUpdate("INSERT INTO Persons(LastName, FirstName, Age, Address, City) VALUES ('Pobłocka', 'Karolina', 32, 'Rzeczypospolitej 1', 'Gdańsk');");
                System.out.println("Wstawiono " + numberOfRowsInserted + " wierszy.");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.Close(connection);
        }
    }
}
