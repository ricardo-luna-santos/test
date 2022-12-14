/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prueba.View;

import java.awt.Point;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import prueba.Controller.controlProducts;
import prueba.Controller.controlSales;
import prueba.Controller.controlWarehouse;

/**
 *
 * @author ricardols
 */
public class Sales extends javax.swing.JFrame {
    controlSales llenarSales;
    controlWarehouse llenarWarehouse;
    controlProducts llenarProducts;
    /**
     * Creates new form Warehouse
     * @throws java.sql.SQLException
     */
    public Sales() throws SQLException {
        initComponents();
        this.llenarSales = new controlSales();
        this.llenarWarehouse=new controlWarehouse();
        this.llenarProducts=new controlProducts();
        DefaultTableModel dm = (DefaultTableModel)tblSales.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
        llenarSales.MostrarSales("");
        llenarWarehouse.LLenarCboBoxSales();
        txtid_product.setVisible(false);
        txtid.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSales = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        SPcantidad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        OpProducts = new javax.swing.JComboBox<>();
        OpWarehouse = new javax.swing.JComboBox<>();
        txtid = new javax.swing.JSpinner();
        txtid_product = new javax.swing.JSpinner();

        setLocation(new java.awt.Point(400, 300));
        setResizable(false);

        jLabel1.setText("Product");

        jLabel2.setText("Qty");

        tblSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Sale", "Qty Sold", "Id Product", "Product", "Warehouse"
            }
        ));
        tblSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSalesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblSales);

        jToolBar1.setRollover(true);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sales");
        jLabel4.setMaximumSize(new java.awt.Dimension(400, 36));
        jLabel4.setMinimumSize(new java.awt.Dimension(400, 36));
        jLabel4.setPreferredSize(new java.awt.Dimension(400, 44));
        jToolBar1.add(jLabel4);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/Images/plus-square-solid-36.png"))); // NOI18N
        jButton1.setText("New");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/Images/save-solid-36.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/Images/search-alt-2-regular-36.png"))); // NOI18N
        jButton3.setText("Search");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/Images/edit-alt-solid-36.png"))); // NOI18N
        jButton4.setText("Edit");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/Images/trash-solid-36.png"))); // NOI18N
        jButton5.setText("Delete");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton6.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/Images/exit-solid-36.png"))); // NOI18N
        jButton6.setText("Exit");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jLabel3.setText("Warehouse");

        OpWarehouse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OpWarehouseItemStateChanged(evt);
            }
        });
        OpWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpWarehouseActionPerformed(evt);
            }
        });

        txtid.setEnabled(false);

        txtid_product.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OpWarehouse, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OpProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(SPcantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(txtid_product, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SPcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(OpProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(OpWarehouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid_product, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id=(String)OpProducts.getSelectedItem();
        String[] dato=id.split(" ");
        String idfinal=dato[0];
        int number = Integer.parseInt(idfinal);
                JOptionPane.showMessageDialog(null, "Id Producto: "+number);
        llenarSales.AgregarSale((Integer)SPcantidad.getValue(),number); 
        
        DefaultTableModel dm = (DefaultTableModel)tblSales.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
        try {
            llenarSales.MostrarSales((String)OpWarehouse.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void OpWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpWarehouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpWarehouseActionPerformed

    private void OpWarehouseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_OpWarehouseItemStateChanged
        // TODO add your handling code here:
        llenarProducts.LLenarCboBox((String)OpWarehouse.getSelectedItem());
    }//GEN-LAST:event_OpWarehouseItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         DefaultTableModel dm = (DefaultTableModel)tblSales.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
        try {
            llenarSales.MostrarSales((String)OpWarehouse.getSelectedItem());         // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String id=(String)OpProducts.getSelectedItem();
        String[] dato=id.split(" ");
        String idfinal=dato[0];
        int number = Integer.parseInt(idfinal);
                JOptionPane.showMessageDialog(null, "Id Producto: "+number);
        llenarSales.EliminarSale((Integer)txtid.getValue(),(Integer)SPcantidad.getValue(),number); 
        
        DefaultTableModel dm = (DefaultTableModel)tblSales.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
        try {
            llenarSales.MostrarSales((String)OpWarehouse.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblSalesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSalesMousePressed
       JTable table=(JTable) evt.getSource();       
            Point point =evt.getPoint();
            if(evt.getClickCount()==1){
                txtid.setValue(tblSales.getValueAt(tblSales.getSelectedRow(),0 ));
                SPcantidad.setValue(tblSales.getValueAt(tblSales.getSelectedRow(),1 ));
                txtid_product.setValue(tblSales.getValueAt(tblSales.getSelectedRow(),2 ));
            }        // TODO add your handling code here:
    }//GEN-LAST:event_tblSalesMousePressed

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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Sales().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> OpProducts;
    public static javax.swing.JComboBox<String> OpWarehouse;
    private javax.swing.JSpinner SPcantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JTable tblSales;
    private javax.swing.JSpinner txtid;
    private javax.swing.JSpinner txtid_product;
    // End of variables declaration//GEN-END:variables
}
