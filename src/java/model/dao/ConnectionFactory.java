/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Khoa
 */
public class ConnectionFactory {

    private static Connection connection;
//    private static final String DB_NAME = "db_websitentm";
//    private static final String USER = "root";
//    private static final String PWD = "123456";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(DRIVER);
        if (connection == null) {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + util.DataFile.db_name + "", util.DataFile.user, util.DataFile.pass);
        }
        return connection;
    }

}
