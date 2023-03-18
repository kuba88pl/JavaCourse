package com.example.OOP.basics;

import java.sql.SQLOutput;

class DBConnection {
    private static DBConnection instance;
    private DBConnection () {
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public void getFromDB() {
        System.out.println("Dane z bazy.");
    }
}
public class SIngletonExample {
    public static void main(String[] args) {

    DBConnection connection = DBConnection.getInstance();
    DBConnection connection1 = DBConnection.getInstance();
        System.out.println(connection1 == connection);
        connection.getFromDB();
        connection1.getFromDB();

    }
}
