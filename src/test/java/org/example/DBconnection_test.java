package org.example;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DBconnection_test {
    @Test
    void testGetConnection() throws SQLException {
    Connection connection = null;
        try {
             connection = DBconnection.getConnection();
            System.out.println(connection);
            System.out.println("Conection established");
            assertNotNull(connection);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
