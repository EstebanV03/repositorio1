package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection conn;
    
    public static Connection getConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcitas","root","");
        } catch (ClassNotFoundException | SQLException e){
            System.out.println(e.toString());
            conn=null;
        }
        return conn;
    }
}



