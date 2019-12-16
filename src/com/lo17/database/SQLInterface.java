package com.lo17.database;

import java.sql.*;
import java.util.*;

public class SQLInterface {
    final private static String DB_URL = "jdbc:postgresql://tuxa.sme.utc/dblo17";
    final private static String DB_USER = "lo17xxx";
    final private static String DB_PASSWORD = "dblo17";
    Connection connection = null;

    public SQLInterface() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch(java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
            Properties props = new Properties();
            props.setProperty("user", DB_USER);
            props.setProperty("password", DB_PASSWORD);
            connection = DriverManager.getConnection(DB_URL, props);
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

    public List<Map<String, String>> query(String request) {
        List<Map<String, String>> results = new ArrayList<>();

        if (connection != null) {
            try {
                Statement stmt = connection.createStatement();
                // Send the query and bind to the result set
                ResultSet rs = stmt.executeQuery(request);
                ResultSetMetaData metadata = rs.getMetaData();
                int columnCount = metadata.getColumnCount();

                while (rs.next()) {
                    Map<String, String> row = new HashMap<>();
                    for (int i = 1; i <= columnCount; i++) {
                        row.put(metadata.getColumnName(i), rs.getString(i));
                    }
                    results.add(row);
                }
            } catch (SQLException e) {
                handleSQLException(e);
            }
        }

        return results;
    }
}
