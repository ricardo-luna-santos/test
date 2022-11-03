/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Model;


import java.sql.*;

/**
 *
 * @author ricardols
 */
public class ConexionMySQL {

    Connection conneccion=null;
    
    private String usuario="superadmin";
    private String contrasena="1@2b3C4d";
    private String servidor="localhost";
    private String puerto="3307";
    private String base="test";
    
    private String url="jdbc:mysql://"+servidor+":"+puerto+"/"+base;
    private String drive="com.mysql.cj.jdbc.Driver";          

    public ConexionMySQL() throws SQLException {
        try{           
            Class.forName(drive);
            conneccion = DriverManager.getConnection(url, usuario, contrasena);
            if(conneccion!=null){
            //    System.out.println("Conexion realizada");
            }
        }catch (ClassNotFoundException e){
            System.out.println("Error"+e.getMessage());
        }
    }
    
    public Connection getConnection(){
        return conneccion;
    }    
    
}
