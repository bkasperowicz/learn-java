package com.javaexcercises.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectExample {
    public static void main(String[] args) {
        // deklaracja zmiennej "connection" musi być na zewnątrz, żeby w sekcji finally móc zamknąć połączenie
        Connection connection = null;

        try {
            // zarejestruj sterownik do polaczenia z baza Microsoft SQL
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            String dbName = "MyDatabase"; // nazwa bazy danych
            String dbURL = "jdbc:sqlserver://127.0.0.1;databaseName=" + dbName;
            String user = "sa";
            String password = "NzeBB1qc50Nl#123"; // haslo takie jak w skrypcie docker-compose.yml
            // nawiaz polaczenie
            connection = DriverManager.getConnection(dbURL, user, password);
            // sprawdz, czy polaczenie sostalo pomyslnie nawiazane
            if(connection != null) {
                System.out.println("Connected to MS SQL database.");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // WAZNE: zawsze zamykaj polaczenie z baza danych
            try {
                if(connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
