/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Model;

/**
 *
 * @author ricardols
 */
public class ModelSales {
    int Ventas;
    int id_products;

    public ModelSales(int Ventas, int id_products) {
        this.Ventas = Ventas;
        this.id_products = id_products;
    }

    public int getVentas() {
        return Ventas;
    }

    public void setVentas(int Ventas) {
        this.Ventas = Ventas;
    }

    public int getId_products() {
        return id_products;
    }

    public void setId_products(int id_products) {
        this.id_products = id_products;
    }

    public ModelSales() {
    }
    
    public void addColumn(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
