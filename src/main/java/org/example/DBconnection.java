package org.example;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBconnection {
    public static Connection getConnection()
    {
        MysqlDataSource ds = new MysqlDataSource();
        ds.setUser("root");
        ds.setPassword("WJ28@krhps");
        ds.setUrl("jdbc:mysql://localhost:3306/company_db");
        Connection connection = null;
        {
            try
            {
                connection = ds.getConnection();

            }catch (SQLException e)
            {
                e.printStackTrace();
            }
            return connection;
        }
    }
}
