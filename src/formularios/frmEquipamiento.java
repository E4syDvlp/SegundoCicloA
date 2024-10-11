/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package formularios;

import clases.equipamientos;
import javax.swing.JOptionPane;

/**
 *
 * @author RYZEN 7
 */
public class frmEquipamiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmEquipamiento
     */
    public frmEquipamiento() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNseriePro = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtNombrePro = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cboxDisponibilidad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        cboxCategoria = new javax.swing.JComboBox<>();
        cboxEstado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("EQUIPAMIENTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 160, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Número de serie del producto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, 30));

        txtNseriePro.setBackground(new java.awt.Color(153, 255, 255));
        txtNseriePro.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtNseriePro.setBorder(null);
        txtNseriePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNserieProActionPerformed(evt);
            }
        });
        getContentPane().add(txtNseriePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 270, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 270, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre de producto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 30));

        txtNombrePro.setBackground(new java.awt.Color(153, 255, 255));
        txtNombrePro.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtNombrePro.setBorder(null);
        getContentPane().add(txtNombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 360, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 360, 10));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Disponibilidad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, 30));

        cboxDisponibilidad.setBackground(new java.awt.Color(153, 255, 255));
        cboxDisponibilidad.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        cboxDisponibilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Disponible", "No disponible" }));
        cboxDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxDisponibilidadActionPerformed(evt);
            }
        });
        getContentPane().add(cboxDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Estado del objeto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Categoria:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        btnAgregar.setBackground(new java.awt.Color(255, 51, 51));
        btnAgregar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 140, 40));

        cboxCategoria.setBackground(new java.awt.Color(153, 255, 255));
        cboxCategoria.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        cboxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Futbol", "Voley", "Basketball", "Tenis" }));
        cboxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(cboxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        cboxEstado.setBackground(new java.awt.Color(153, 255, 255));
        cboxEstado.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        cboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Nuevo", "Usado", "Muy Usado" }));
        getContentPane().add(cboxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 460, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNserieProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNserieProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNserieProActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    clases.equipamientos obj = new equipamientos(txtNseriePro.getText(), txtNombrePro.getText(), medComvertir(cboxDisponibilidad.getSelectedItem().toString()),cboxCategoria.getSelectedItem().toString(),cboxEstado.getSelectedItem().toString());
    txtResultado.setText(obj.medDatos());
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cboxDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxDisponibilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxDisponibilidadActionPerformed

    private void cboxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxCategoriaActionPerformed
private boolean medComvertir(String dato){
    boolean res=false;
    if ("Disponible".equals(dato)){
        res=true;
    }else{
        res=false;
    }
    return res;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cboxCategoria;
    private javax.swing.JComboBox<String> cboxDisponibilidad;
    private javax.swing.JComboBox<String> cboxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtNombrePro;
    private javax.swing.JTextField txtNseriePro;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}