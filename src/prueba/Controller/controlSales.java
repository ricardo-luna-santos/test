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
import prueba.View.MenuPrincipal;
import prueba.View.Sales;

/**
 *
 * @author ricardols
 */
public class controlSales {
    ConexionMySQL conn1;
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    public controlSales() throws SQLException{
          this.conn1 = new ConexionMySQL();
    }
    
     public Object[] MostrarSales(String Warehouse) throws SQLException{
        String sql="";
        if(Warehouse.equals("")){
            sql="select INVENTORY.id,INVENTORY.Ventas,INVENTORY.id_products,PRODUCTS.Name, PRODUCTS.Warehouse from INVENTORY JOIN PRODUCTS ON INVENTORY.id_products=PRODUCTS.id ORDER BY PRODUCTS.Name";
        }else{
           sql="select INVENTORY.id,INVENTORY.Ventas,INVENTORY.id_products,PRODUCTS.Name, PRODUCTS.Warehouse from INVENTORY JOIN PRODUCTS ON INVENTORY.id_products=PRODUCTS.id where PRODUCTS.Warehouse='"+Warehouse+"' ORDER BY PRODUCTS.Name";
        }
        Object Sales_datos[]= new Object[5];
        conet=conn1.getConnection();
        st=conet.createStatement();
        rs=st.executeQuery(sql);
        modelo=(DefaultTableModel) Sales.tblSales.getModel();
        while(rs.next()){
            Sales_datos[0]=rs.getInt("id");
            Sales_datos[1]=rs.getInt("Ventas");
            Sales_datos[2]=rs.getInt("id_products");
            Sales_datos[3]=rs.getString("Name");
            Sales_datos[4]=rs.getString("Warehouse");
            modelo.addRow(Sales_datos);
        }
        Sales.tblSales.setModel(modelo);
       
           return Sales_datos;
    }
     
     public Object[] MostrarInventario() throws SQLException{
        String sql="SELECT INVENTORY.id_products, PRODUCTS.Name, PRODUCTS.Total_Qty,INVENTORY.Ventas,(PRODUCTS.Total_Qty-INVENTORY.Ventas)AS On_Stock, PRODUCTS.Warehouse FROM INVENTORY INNER JOIN PRODUCTS ON INVENTORY.id_products=PRODUCTS.id ORDER BY Warehouse";

        Object Inventario_datos[]= new Object[6];
        conet=conn1.getConnection();
        st=conet.createStatement();
        rs=st.executeQuery(sql);
        modelo=(DefaultTableModel) MenuPrincipal.tblreporte.getModel();
        while(rs.next()){
            Inventario_datos[0]=rs.getInt("id_products");
            Inventario_datos[1]=rs.getString("Name");
            Inventario_datos[2]=rs.getInt("Total_Qty");
            Inventario_datos[3]=rs.getInt("Ventas");
            Inventario_datos[4]=rs.getInt("On_Stock");
            Inventario_datos[5]=rs.getString("Warehouse");
            modelo.addRow(Inventario_datos);
        }
        MenuPrincipal.tblreporte.setModel(modelo);
       
           return Inventario_datos;
    }
    public void AgregarSale(int Ventas,int id_products){
       
       try{
          // if(id_products==null && Ventas==null){
               String sql="insert into INVENTORY (Ventas,id_products)values('"+Ventas+"','"+id_products+"')";
               String sql2="update PRODUCTS set Remaning_Qty=Remaning_Qty+'"+Ventas+"' where id='"+id_products+"'";
               conet=conn1.getConnection();
               st=conet.createStatement();
               st.executeUpdate(sql);
               st.executeUpdate(sql2);
               JOptionPane.showMessageDialog(null, "Se vendieron "+Ventas+" Products");
        //   }else{
        //       JOptionPane.showMessageDialog(null, "Algunos datos estan vacios");
        //   }
       }catch(HeadlessException | SQLException e){
           
       }
       
   }
      public void EliminarSale(int id, int Ventas, int id_products){
       
       try{

               String sql="delete from INVENTORY where id='"+id+"'";
               String sql2="update PRODUCTS set Remaning_Qty=Remaning_Qty-'"+Ventas+"' where id='"+id_products+"'";
            //   String sql3="update PRODUCTS set Total_Qty=Total_Qty+'"+Ventas+"' where id='"+id_products+"'";
               conet=conn1.getConnection();
                st=conet.createStatement();
                st.executeUpdate(sql);
                st.executeUpdate(sql2);
              //  st.executeUpdate(sql3);
                JOptionPane.showMessageDialog(null, "Se elimino la venta"+id);
           
       }catch(HeadlessException | SQLException e){
           
       }
       
   }
}
