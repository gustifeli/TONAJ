package Controlador;

import java.sql.*;

/**
 *
 * @author gusti
 */
public class Data {
    
    public Connection connection;
    public final static String UserDb = "root";
    public final static String Passdb = "34885949";
    
    //Contectar con la base de datos.
    public void conectar() throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tonaWeb", UserDb, Passdb);
    }
    
    //Desconectar la base de datos
    public void desconectar() throws SQLException, ClassNotFoundException{
        connection.close();
    }
    
    // verificar si un usuario y una contraña pertenece a un cuenta registrada
    public boolean cuentaExistente(String user, String pass) throws SQLException{
        String sql = "select * from  usuario where user='"+user+"' and pass='"+ pass+"'";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        return rs.next();
    } 
    //Verificar si el usuario existe
    public boolean userExistente(String user) throws SQLException{
        String sql = "Select * from usuario where user='"+ user+"'";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        return rs.next();
    }
    
    public void registrarUsuario(String user, String pass) throws SQLException{
        String sql = "Insert into usuario (user, pass) Values('"+ user+"','"+pass+"')";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.executeUpdate();
    }
   
    
}
