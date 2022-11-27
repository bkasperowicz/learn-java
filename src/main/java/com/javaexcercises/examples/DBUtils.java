package com.javaexcercises.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
    // kod tworzenia połączenia przeniesiony do osobnej metody (dla czytelności kodu)
    // metoda deklaruje potencjalne wyrzucenie exceptiona SQLException
    public static Connection connectToDatabase() throws SQLException {
        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        String dbName = "MyDatabase"; // nazwa bazy danych
        String dbURL = "jdbc:sqlserver://127.0.0.1;databaseName=" + dbName;
        String user = "sa";
        String password = "NzeBB1qc50Nl#123"; // haslo takie jak w skrypcie docker-compose.yml

        return DriverManager.getConnection(dbURL, user, password);
    }

    // kod zamykania połączenia przeniesiony do osobnej metody (dla czytelności kodu)
    public static void Close(Connection connection) {
        try {
            if(connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
