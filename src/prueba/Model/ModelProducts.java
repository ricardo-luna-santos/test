/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Model;

/**
 *
 * @author ricardols
 */
public class ModelProducts {
    String Name;
    int Total_Qty;
    int Remaning_Qty;
    int Warehouse;

    public ModelProducts(String Name, int Total_Qty, int Remaning_Qty, int Warehouse) {
        this.Name = Name;
        this.Total_Qty = Total_Qty;
        this.Remaning_Qty = Remaning_Qty;
        this.Warehouse = Warehouse;
    }

    public String getName() {
        return Name;
    }

    public int getTotal_Qty() {
        return Total_Qty;
    }

    public int getRemaning_Qty() {
        return Remaning_Qty;
    }

    public int getWarehouse() {
        return Warehouse;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setTotal_Qty(int Total_Qty) {
        this.Total_Qty = Total_Qty;
    }

    public void setRemaning_Qty(int Remaning_Qty) {
        this.Remaning_Qty = Remaning_Qty;
    }

    public void setWarehouse(int Warehouse) {
        this.Warehouse = Warehouse;
    }

    public ModelProducts() {
    }
    
    public void addColumn(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
