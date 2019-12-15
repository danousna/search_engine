package com.lo17.database;

import java.sql.*;

public class SQLInterface {
    final private static String DB_USERNAME = "lo17xxx";
    final private static String DB_PASSWORD = "dblo17";
    final private static String DB_URL = "jdbc:postgresql://tuxa.sme.utc/dblo17";
    Connection connection = null;

    public SQLInterface() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch(java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            handleSQLException(e);
        }
    }

    private void handleSQLException(SQLException e) {
        System.err.println("SQLException: ");
        while (e != null) {
            System.out.println("Message: " + e.getMessage ());
            System.out.println("SQLState: " + e.getSQLState ());
            System.out.println("ErrorCode: " + e.getErrorCode ());
            e = e.getNextException();
            System.out.println("");
        }
    }

    public void query(String request) {
        if (connection != null) {
            try {
                Statement stmt = connection.createStatement();
                // Send the query and bind to the result set
                ResultSet rs = stmt.executeQuery(request);
                ResultSetMetaData metadata = rs.getMetaData();
                int columnCount = metadata.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(metadata.getColumnName(i) + ", ");
                }
                System.out.println();
                while (rs.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.print(rs.getString(i) + ",");
                    }
                    System.out.println();
                }
            } catch (SQLException e) {
                handleSQLException(e);
            }
        }
    }
}
