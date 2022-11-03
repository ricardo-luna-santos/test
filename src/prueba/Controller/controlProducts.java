/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import prueba.Model.ConexionMySQL;
import prueba.View.Products;
import prueba.View.Sales;
import static prueba.View.Sales.OpProducts;

/**
 *
 * @author ricardols
 */
public class controlProducts {
    ConexionMySQL conn1;
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    
    public controlProducts() throws SQLException{
        this.conn1 = new ConexionMySQL();
    }
    
    public Object[] MostrarProducts(String Name){
        String sql="";
        if(Name.equals("")){
            sql="select * from PRODUCTS";
        }else{
           sql="select * from PRODUCTS where Name like '%"+Name+"%'";
        }
        Object Products_datos[]= new Object[5];
           try{
            conet=conn1.getConnection();
            st=conet.createStatement();
            rs=st.executeQuery(sql);
            modelo=(DefaultTableModel) Products.tblProducts.getModel();
            
            while(rs.next()){
                Products_datos[0]=rs.getInt("id");
                Products_datos[1]=rs.getString("Name");
                Products_datos[2]=rs.getInt("Total_Qty");
                Products_datos[3]=rs.getInt("Remaning_Qty");
                Products_datos[4]=rs.getString("Warehouse");
               modelo.addRow(Products_datos);
            }
            Products.tblProducts.setModel(modelo);
            
            
        }catch(SQLException ex){
            
        }
       
           return Products_datos;
    }
      public void AgregarProduct(String Name,int Total_Qty, String Warehouse){
       
       try{
           if(Name.equals("")||Warehouse.equals("")){
               JOptionPane.showMessageDialog(null, "Algunos datos estan vacios");
           }else{
               String sql="insert into PRODUCTS (Name,Total_Qty,Warehouse)values('"+Name+"','"+Total_Qty+"','"+Warehouse+"')";
               conet=conn1.getConnection();
                st=conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Se agrego un nuevo Product");
           }
       }catch(HeadlessException | SQLException e){
           
       }
       
   }
    public void ActualizarProduct(int id, String Name,int Total_Qty, String Warehouse){
       
       try{
               String sql="update PRODUCTS set Name='"+Name+"',Total_Qty='"+Total_Qty+"',Warehouse='"+Warehouse+"' where id='"+id+"'";
               conet=conn1.getConnection();
                st=conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Se actualizo el Product"+id+": "+Name);
                
       }catch(HeadlessException | SQLException e){
           
       }
       
   }
     public void EliminarProduct(int id){
       
       try{

               String sql="delete from PRODUCTS where id='"+id+"'";
               conet=conn1.getConnection();
                st=conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Se elimino el Product"+id);
                
       }catch(HeadlessException | SQLException e){
           
       }
       
   }
    public void LLenarCboBox(String Warehouse){
        Sales.OpProducts.removeAllItems();
          String sql="select * from PRODUCTS where Warehouse='"+Warehouse+"'";
          String Products_nombre;
          int Products_id;
           try{
            conet=conn1.getConnection();
            st=conet.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                Products_nombre=rs.getString("Name");
                Products_id=rs.getInt("id");
               Sales.OpProducts.addItem(Products_id+" "+Products_nombre);
            }
        }catch(SQLException ex){
            
        }
        
     }
    
}
