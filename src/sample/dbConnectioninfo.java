package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dbConnectioninfo {
    public static Connection Connect(){
        try{
            String url="jdbc:mysql://localhost:3308/projet?verifyServerCertificate=false&useSSL=true";
            String user="root";
            String password="";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(url,user,password);
            return con;

        }catch(ClassNotFoundException| SQLException e){
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE,null,e);

        }
        return null;

    }
    public static int save(depense d){
        int x=0;
        try{
            String sql="INSERT INTO depense(categorie,montant,date)VALUES(?,?,?)";
            Connection con=dbConnectioninfo.Connect();
            PreparedStatement stat;
            stat=con.prepareStatement(sql);
            stat.setString(1,d.getCategorie());
            stat.setDouble(2,d.getMontant());
            stat.setString(3,d.getDate());
            x=stat.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return x;
    }
}
