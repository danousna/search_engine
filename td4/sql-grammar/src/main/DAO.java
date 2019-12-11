package main;

import java.sql.*;
import java.io.*;

public class DAO  {
	public DAO() {
	}
	
	public void query(String request) {
		String username;
        String password;
        String url;
        String nom;
        int nbre;

        // ---- configure START
        username = "lo17xxx";
        password = "dblo17";
        // The URL that will connect to TECFA's MySQL server
        // Syntax: jdbc:TYPE:machine:port/DB_NAME
        url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
        
        // INSTALL/load the Driver (Vendor specific Code)
        try {
            Class.forName("org.postgresql.Driver");
        } catch(java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        // Establish Connection to the database at URL with usename and password
        // using try-with-resources Statement and AutoCloseable resources
        // cf. https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
        try (
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
        ) {
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
        }  catch(SQLException ex) {        // print out decent erreur messages
            System.err.println("==> SQLException: ");
            while (ex != null) {
                System.out.println("Message:   " + ex.getMessage ());
                System.out.println("SQLState:  " + ex.getSQLState ());
                System.out.println("ErrorCode: " + ex.getErrorCode ());
                ex = ex.getNextException();
                System.out.println("");
            }
        }
	}
}
