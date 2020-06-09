package sample;

import java.sql.Connection;
import java.sql.*;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dbConnection {

    public static Connection Connect(){
        try{
            String url="jdbc:mysql://localhost:3308/projet?verifyServerCertificate=false&useSSL=true";
            String user="root";
            String password="";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(url,user,password);
            return con;

        }catch(ClassNotFoundException|SQLException e){
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE,null,e);

        }
        return null;

    }
}
