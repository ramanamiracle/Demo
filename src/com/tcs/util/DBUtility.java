package com.tcs.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
        private static Connection connection = null;
      

        public static Connection getConnection() throws Exception {
                if (connection != null)
                        return connection;
                else {

                        String serverName = "127.0.0.1";
                        String portNumber = "1521";
                        String sid = "XE";
                        String dbUrl = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
                        Class.forName("oracle.jdbc.driver.OracleDriver");

                        connection = DriverManager.getConnection(dbUrl, "system", "admin");
                        return connection;
                }
        }
}