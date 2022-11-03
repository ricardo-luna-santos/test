/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Model;

/**
 *
 * @author ricardols
 */
public class ModelWarehouse {
    String Name;
    int MinProduct;
    int MaxProduct;

    public ModelWarehouse(String Name, int MinProduct, int MaxProduct) {
        this.Name = Name;
        this.MinProduct = MinProduct;
        this.MaxProduct = MaxProduct;
    }

    public String getName() {
        return Name;
    }

    public int getMinProduct() {
        return MinProduct;
    }

    public int getMaxProduct() {
        return MaxProduct;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setMinProduct(int MinProduct) {
        this.MinProduct = MinProduct;
    }

    public void setMaxProduct(int MaxProduct) {
        this.MaxProduct = MaxProduct;
    }

    public ModelWarehouse() {
    }

    public void addColumn(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
    
}
