package org.tesco.database.jdbc;

import java.sql.*;

class MyDatabase {
    public void process() {
        String connectionString = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
        String userName = "sa";
        String password = "";
        try {
            //loading driver is optional
            Class.forName("org.h2.Driver");
            System.out.println("Driver is loaded...");
            Connection connection = DriverManager.getConnection(connectionString, userName, password);
            System.out.println("Connection is Successful!...");
            createTable(connection);
            insertRow(connection);
            selectRow(connection);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver class " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Exception " + e.getMessage());
        }

    }

    private void selectRow(Connection connection) throws SQLException {
        String sql = "SELECT * FROM Person";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getInt("id") + rs.getString("name") + rs.getString("email"));
        }
    }

    private void insertRow(Connection connection) throws SQLException {
        String sql = "INSERT INTO person (name,email) VALUES(?,?)";
        PreparedStatement insertRow = connection.prepareStatement(sql);
        insertRow.setString(1, "Subramanian");
        insertRow.setString(2, "subu@gmail.com");
        int rows = insertRow.executeUpdate();
        System.out.println(rows + " inserted");

    }

    private void createTable(Connection connection) {
        String sql = "CREATE TABLE IF NOT EXISTS person(id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(100) NOT NULL, email VARCHAR(200))";
        try {
            //Statement represent SQL query
            Statement statement = connection.createStatement();
            boolean status = statement.execute(sql);
            if (!status) {
                System.out.println("Table is created");
            } else {
                System.out.println("Table is not created!");
            }
        } catch (SQLException e) {
            System.out.println("Create table: " + e.getMessage());
        }

    }
}

public class BasicDatabaseApp {
    public static void main(String[] args) {
        MyDatabase myDatabase = new MyDatabase();
        myDatabase.process();
    }
}
