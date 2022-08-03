/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrypbo.apps.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author azkaz
 */
public class DatabaseConnection {
    
    private static Connection connection;
    
    public static Connection getConnection() throws SQLException{    
        if(connection == null){
            //Buat koneksi
            MysqlDataSource dataSource = new MysqlDataSource();
            
            //set nilai URL, USERNAME, * password dari database yang dituju
            dataSource.setURL("jdbc:mysql://localhost:3306/laundry");
            dataSource.setUser("root");
            dataSource.setPassword("");
            
            //Isi atribut Connection dengan informais database (Laundry)
            connection = dataSource.getConnection();
        }
        return connection;
    }
}
