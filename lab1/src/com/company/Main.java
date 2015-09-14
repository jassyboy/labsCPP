package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	    Controller c = new Controller();
        try {
            ResultSet data = c.doQueryR("SELECT * FROM teachers");
            while(data.next()){
                System.out.println("Teacher: " + data.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
