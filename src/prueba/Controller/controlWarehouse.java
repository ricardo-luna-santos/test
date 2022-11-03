/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Controller;


import java.awt.HeadlessException;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import prueba.Model.ConexionMySQL;
import prueba.View.Products;
import prueba.View.Sales;
import prueba.View.Warehouse;

/**
 *
 * @author ricardols
 */
public class controlWarehouse {
  
    ConexionMySQL conn1;
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;

    public controlWarehouse() throws SQLException {
        this.conn1 = new ConexionMySQL();
    }
       
   public Object[] MostrarWarehouse(String Name){
        String sql="";
        if(Name.equals("")){
            sql="select * from WAREHOUSES";
        }else{
           sql="select * from WAREHOUSES where Name like '%"+Name+"%'";
        }
        Object Warehouses_datos[]= new Object[3];
           try{
            conet=conn1.getConnection();
            st=conet.createStatement();
            rs=st.executeQuery(sql);
            modelo=(DefaultTableModel) Warehouse.tblWarehouse.getModel();
            
            while(rs.next()){
                Warehouses_datos[0]=rs.getString("Name");
                Warehouses_datos[1]=rs.getInt("MinProduct");
                Warehouses_datos[2]=rs.getInt("MaxProduct");
               modelo.addRow(Warehouses_datos);
            }
            Warehouse.tblWarehouse.setModel(modelo);
            
            
        }catch(SQLException ex){
            //Logger.getLogger(Registro.class)
        }
    
           return Warehouses_datos;
    }
   public void AgregarWarehouse(String Name,int MinProduct,int MaxProduct){
       
       try{
           if(Name.equals("")){
               JOptionPane.showMessageDialog(null, "Algunos datos estan vacios");
           }else{
               String sql="insert into WAREHOUSES(Name,MinProduct,MaxProduct)values('"+Name+"','"+MinProduct+"','"+MaxProduct+"')";
               conet=conn1.getConnection();
                st=conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Se agrego un nuevo Warehouse");
           }
       }catch(HeadlessException | SQLException e){
           
       }
       
   }
    public void ActualizarWarehouse(String Name,int MinProduct,int MaxProduct){
       
       try{

               String sql="update WAREHOUSES set MinProduct='"+MinProduct+"',MaxProduct='"+MaxProduct+"' where Name='"+Name+"'";
               conet=conn1.getConnection();
                st=conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Se actualizo el Warehouse"+Name);
                
       }catch(HeadlessException | SQLException e){
           
       }
       
   }
     public void EliminarWarehouse(String Name){
       
       try{

               String sql="delete from WAREHOUSES where Name='"+Name+"'";
               conet=conn1.getConnection();
                st=conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Se elimino el Warehouse"+Name);
                
       }catch(HeadlessException | SQLException e){
           
       }
       
   }
     public void LLenarCboBox(){
          String sql="select * from WAREHOUSES";
          String Warehouses_nombre;
           try{
            conet=conn1.getConnection();
            st=conet.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                Warehouses_nombre=rs.getString("Name");
               Products.OpWarehouse.addItem(Warehouses_nombre);

            }
        }catch(SQLException ex){
            
        }
        
     }
     public void LLenarCboBoxSales(){
          String sql="select * from WAREHOUSES";
          String Warehouses_nombre;
           try{
            conet=conn1.getConnection();
            st=conet.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                Warehouses_nombre=rs.getString("Name");
               Sales.OpWarehouse.addItem(Warehouses_nombre);
            }
        }catch(SQLException ex){
            
        }
        
     }
    
}
