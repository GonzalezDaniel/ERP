/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

import static erp.ERPMain.mt;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class JPProductos extends javax.swing.JPanel {

    /**
     * Creates new form JPProductos
     */
    //private MySQL db = new MySQL();
    public JPProductos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPProductos = new javax.swing.JPanel();
        jLProductos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jBMostrarClientes = new javax.swing.JButton();
        jTFBuscarP = new javax.swing.JTextField();
        jBBuscarC = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFIDP = new javax.swing.JTextField();
        jTFProvP = new javax.swing.JTextField();
        jTFNombreP = new javax.swing.JTextField();
        jTFPU = new javax.swing.JTextField();
        jTFPVP = new javax.swing.JTextField();
        jTFStock = new javax.swing.JTextField();
        jBAnadirC = new javax.swing.JButton();
        jBActualizarC = new javax.swing.JButton();
        jBModificarC = new javax.swing.JButton();
        jBEliminarC = new javax.swing.JButton();

        jLProductos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLProductos.setText("PRODUCTOS");

        jTable.setAutoCreateRowSorter(true);
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabel1.setText("Buscar por:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBMostrarClientes.setText("Mostrar todos");
        jBMostrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarClientesActionPerformed(evt);
            }
        });

        jBBuscarC.setText("Buscar");
        jBBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarCActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Proveedor:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre:");

        jLabel5.setText("Precio/unidad:");

        jLabel6.setText("P.V.P:");

        jLabel7.setText("Stock:");

        jTFStock.setEditable(false);

        jBAnadirC.setText("Añadir");
        jBAnadirC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnadirCActionPerformed(evt);
            }
        });

        jBActualizarC.setText("Actualizar");
        jBActualizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFProvP, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jTFNombreP)
                    .addComponent(jTFIDP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFPVP, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jTFStock)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFPU, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBActualizarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAnadirC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFIDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAnadirC)
                            .addComponent(jLabel5)
                            .addComponent(jTFPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jBActualizarC)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFPVP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFProvP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jBModificarC.setText("Modificar");
        jBModificarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarCActionPerformed(evt);
            }
        });

        jBEliminarC.setText("Eliminar");
        jBEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPProductosLayout = new javax.swing.GroupLayout(jPProductos);
        jPProductos.setLayout(jPProductosLayout);
        jPProductosLayout.setHorizontalGroup(
            jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLProductos)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addGroup(jPProductosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscarC)
                        .addGap(18, 18, 18)
                        .addComponent(jBMostrarClientes))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBModificarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBEliminarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPProductosLayout.setVerticalGroup(
            jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLProductos)
                .addGap(18, 18, 18)
                .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBMostrarClientes)
                    .addComponent(jTFBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPProductosLayout.createSequentialGroup()
                        .addComponent(jBModificarC)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminarC)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int fila = jTable.rowAtPoint(evt.getPoint());
        int columna = jTable.columnAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTableMouseClicked

    private void jBMostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarClientesActionPerformed
        ResultSet res=mt.consultaTodo("productos");
        modelo=mt.resetTableModel(modelo,jTable);
        mt.setTableHeader(res,modelo,jTable);
        mt.setTableData(res,jTable,modelo);
        mt.setComboBox(res,jComboBox1,CBModel);
    }//GEN-LAST:event_jBMostrarClientesActionPerformed

    private void jBAnadirCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnadirCActionPerformed
        String ID,nombre,ap1,ap2,tel,dir;
        ID = jTFIDP.getText();
        nombre = jTFProvP.getText();
        ap1 = jTFNombreP.getText();
        ap2 = jTFPU.getText();
        tel = jTFPVP.getText();
        dir = String.valueOf(0);
        String Query = "INSERT INTO "+"productos"+" Values("+"\""+ ID + "\", " + "\"" + nombre + "\", " + "\"" + ap1 + "\", " + "\""+ ap2 + "\", "+"\""+ tel + "\", "+"\"" + dir + "\")";
        ERPMain.db.insertData(Query);
    }//GEN-LAST:event_jBAnadirCActionPerformed

    private void jBActualizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarCActionPerformed
        String[] producto = new String[6];
        obtenerDatosProducto(producto);
        String Query = "UPDATE "+"productos"+" SET proveedorID='"+producto[1]+"',nombre='"+producto[2]+"',precio/unidad='"+producto[3]+"',pvp='"+producto[4]+"' WHERE clienteID='"+producto[0]+"'";
        ERPMain.db.insertData(Query);
        producto = null;
    }//GEN-LAST:event_jBActualizarCActionPerformed

    private void jBModificarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarCActionPerformed
        int fila = jTable.getSelectedRow();
        if(fila>=0){
            jTFIDP.setText(jTable.getValueAt(fila, 0).toString());
            jTFProvP.setText(jTable.getValueAt(fila, 1).toString());
            jTFNombreP.setText(jTable.getValueAt(fila, 2).toString());
            jTFPU.setText(jTable.getValueAt(fila, 3).toString());
            jTFPVP.setText(jTable.getValueAt(fila, 4).toString());
            jTFStock.setText(jTable.getValueAt(fila, 5).toString());
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila.");
        }
    }//GEN-LAST:event_jBModificarCActionPerformed

    private void jBEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarCActionPerformed
        int fila = jTable.getSelectedRow();
        if(fila>=0){
            int res=JOptionPane.showConfirmDialog(this, "¿Desea borrar el usuario seleccionado?", "Eliminar", JOptionPane.OK_CANCEL_OPTION);
            if(res==0){
                String Query ="DELETE FROM productos WHERE productoID = \""+jTable.getValueAt(fila, 0).toString()+"\"";
                ERPMain.db.deleteRecord(Query);
            }
        }
        else{JOptionPane.showMessageDialog(null, "Seleccione una fila.");}
    }//GEN-LAST:event_jBEliminarCActionPerformed

    private void jBBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarCActionPerformed
        int index=jComboBox1.getSelectedIndex();
        String Query = "SELECT * FROM productos WHERE "+jComboBox1.getSelectedItem()+" = '"+jTFBuscarP.getText()+"'";
        ResultSet res=mt.buscarConsulta("productos",Query);
        mt.setTableData(res, jTable, modelo);
    }//GEN-LAST:event_jBBuscarCActionPerformed

     public String[] obtenerDatosProducto(String[] producto){
        producto[0] = jTFIDP.getText();
        producto[1] = jTFProvP.getText();
        producto[2] = jTFNombreP.getText();
        producto[3] = jTFPU.getText();
        producto[4] = jTFPVP.getText();
        producto[5] = jTFStock.getText();
        return producto;
   }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarC;
    private javax.swing.JButton jBAnadirC;
    private javax.swing.JButton jBBuscarC;
    private javax.swing.JButton jBEliminarC;
    private javax.swing.JButton jBModificarC;
    private javax.swing.JButton jBMostrarClientes;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPProductos;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBuscarP;
    private javax.swing.JTextField jTFIDP;
    private javax.swing.JTextField jTFNombreP;
    private javax.swing.JTextField jTFPU;
    private javax.swing.JTextField jTFPVP;
    private javax.swing.JTextField jTFProvP;
    private javax.swing.JTextField jTFStock;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
    private javax.swing.table.DefaultTableModel modelo;
    private DefaultComboBoxModel CBModel;
}
