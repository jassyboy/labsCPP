package com.company;

import java.sql.*;

/**
 * Created by Alexander on 14.09.2015.
 */
public class Controller {

    Connection connection;

    public Controller() {
    }

    private void createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:db.db");
    }

    public ResultSet doQueryR(String query) throws SQLException, ClassNotFoundException {
        createConnection();
        Statement st = connection.createStatement();
        return st.executeQuery(query);
    }
}
