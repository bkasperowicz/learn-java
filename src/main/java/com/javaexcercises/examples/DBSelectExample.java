package com.javaexcercises.examples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSelectExcample {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DBUtils.connectToDatabase();

            if(connection != null) {
                // połączenie udane
                Statement selectStatement = connection.createStatement();

                ResultSet resultSet = selectStatement.executeQuery("SELECT * FROM Persons WHERE Age > 30");

                while(resultSet.next())
                {
                    String firstName = resultSet.getString("FirstName");
                    String lastName = resultSet.getString("LastName");
                    int age = resultSet.getInt("Age");
                    String address = resultSet.getString("Address");
                    String city = resultSet.getString("City");

                    System.out.println("Imie: " + firstName + "; Nazwisko: " + lastName + "; Wiek: " + age + "; Adres: " + address + "; Miasto: " + city);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.Close(connection);
        }
    }
}
