/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Controller;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author ricardols
 */
public class MiRenderer extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column ){
        int numero=(Integer) table.getValueAt(row,4);
        int numero2=(Integer) table.getValueAt(row, 2);
        if(numero>numero2-10 && numero<=numero2){
            setBackground(Color.GREEN);
            setForeground(Color.BLACK);
        }else if (numero>numero2/3 && numero<=numero2-10 ){
            setBackground(Color.YELLOW);
            setForeground(Color.BLACK);
        }else if (numero<numero2/10){
            setBackground(Color.RED);
            setForeground(Color.BLACK);
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
    
}
