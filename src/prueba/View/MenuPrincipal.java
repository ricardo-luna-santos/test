/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prueba.View;

import prueba.Model.ConexionMySQL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import prueba.Controller.MiRenderer;
import prueba.Controller.controlSales;
import static prueba.View.Products.tblProducts;

/**
 *
 * @author ricardols
 */
public class MenuPrincipal extends javax.swing.JFrame {
    controlSales llenarInventario;
    /**
     * Creates new form MenuPrincipal
     * @throws java.sql.SQLException
     */
    public MenuPrincipal() throws SQLException {
        this.llenarInventario=new controlSales();
        initComponents();
        DefaultTableModel dm = (DefaultTableModel) tblreporte.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
        llenarInventario.MostrarInventario();
        this.tblreporte.setDefaultRenderer(Object.class,new MiRenderer());
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblreporte = new javax.swing.JTable();
        lblvacio = new javax.swing.JLabel();
        lblnormal = new javax.swing.JLabel();
        lbllleno = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnuRegis = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemWarehouse = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemProducts = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ItemsSales = new javax.swing.JMenuItem();
        MnuReports = new javax.swing.JMenu();
        MnuConfig = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Inventario");
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1024, 768));

        tblreporte.setBorder(null);
        tblreporte.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        tblreporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Product", "Name", "Total Qty", "Sales", "On Stock", "Wharehouse"
            }
        ));
        tblreporte.setRequestFocusEnabled(false);
        tblreporte.setRowHeight(32);
        jScrollPane1.setViewportView(tblreporte);

        lblvacio.setBackground(new java.awt.Color(204, 0, 51));
        lblvacio.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblvacio.setForeground(new java.awt.Color(204, 0, 0));
        lblvacio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblvacio.setText("Not enough product");

        lblnormal.setBackground(new java.awt.Color(255, 255, 0));
        lblnormal.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblnormal.setForeground(new java.awt.Color(255, 204, 0));
        lblnormal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnormal.setText("More than necessary ");

        lbllleno.setBackground(new java.awt.Color(0, 204, 0));
        lbllleno.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lbllleno.setForeground(new java.awt.Color(0, 204, 0));
        lbllleno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllleno.setText("Full capacity");

        MnuRegis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/Images/folder-plus-solid-36.png"))); // NOI18N
        MnuRegis.setText("Regis");
        MnuRegis.add(jSeparator3);

        itemWarehouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/Images/store-alt-solid-36.png"))); // NOI18N
        itemWarehouse.setText("Warehouse");
        itemWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemWarehouseActionPerformed(evt);
            }
        });
        MnuRegis.add(itemWarehouse);
        MnuRegis.add(jSeparator1);

        itemProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/Images/purchase-tag-solid-36.png"))); // NOI18N
        itemProducts.setText("Products");
        itemProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductsActionPerformed(evt);
            }
        });
        MnuRegis.add(itemProducts);
        MnuRegis.add(jSeparator2);

        ItemsSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/Images/cart-alt-solid-36.png"))); // NOI18N
        ItemsSales.setText("Sales");
        ItemsSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemsSalesActionPerformed(evt);
            }
        });
        MnuRegis.add(ItemsSales);

        jMenuBar1.add(MnuRegis);

        MnuReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/Images/report-solid-36.png"))); // NOI18N
        MnuReports.setText("Update Report");
        MnuReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MnuReportsMousePressed(evt);
            }
        });
        MnuReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuReportsActionPerformed(evt);
            }
        });
        jMenuBar1.add(MnuReports);

        MnuConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/Images/wrench-solid-36.png"))); // NOI18N
        MnuConfig.setText("Config");
        MnuConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuConfigActionPerformed(evt);
            }
        });
        jMenuBar1.add(MnuConfig);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/Images/exit-solid-36.png"))); // NOI18N
        jMenu1.setText("Salir");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblvacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblnormal, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
                            .addComponent(lbllleno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblvacio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblnormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbllleno)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnuConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuConfigActionPerformed

       
        
    }//GEN-LAST:event_MnuConfigActionPerformed

    private void itemWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemWarehouseActionPerformed

        Warehouse verformulario1 = null; 
        try {
            verformulario1 = new Warehouse();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
         verformulario1.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_itemWarehouseActionPerformed

    private void itemProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProductsActionPerformed
        //línea 1-instanciamos un objeto de la clase Formulario2.java
        Products verformulario2 = null; 
        try {
            verformulario2 = new Products();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
 
         //línea 2-hacemos visible el formulario que queremos llamar 
         verformulario2.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_itemProductsActionPerformed

    private void ItemsSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemsSalesActionPerformed
        //línea 1-instanciamos un objeto de la clase Formulario2.java
        Sales verformulario3 = null; 
        try {
            verformulario3 = new Sales();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
 
         //línea 2-hacemos visible el formulario que queremos llamar 
         verformulario3.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_ItemsSalesActionPerformed

    private void MnuReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuReportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnuReportsActionPerformed

    private void MnuReportsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnuReportsMousePressed
        DefaultTableModel dm = (DefaultTableModel) tblreporte.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
        try {
            llenarInventario.MostrarInventario();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        MenuPrincipal.tblreporte.setDefaultRenderer(Object.class,new MiRenderer());        // TODO add your handling code here:
    }//GEN-LAST:event_MnuReportsMousePressed

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
        System.exit(0);     // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MenuPrincipal().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemsSales;
    private javax.swing.JMenu MnuConfig;
    private javax.swing.JMenu MnuRegis;
    private javax.swing.JMenu MnuReports;
    private javax.swing.JMenuItem itemProducts;
    private javax.swing.JMenuItem itemWarehouse;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lbllleno;
    private javax.swing.JLabel lblnormal;
    private javax.swing.JLabel lblvacio;
    public static javax.swing.JTable tblreporte;
    // End of variables declaration//GEN-END:variables
}