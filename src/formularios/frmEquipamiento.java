/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package formularios;

import clases.equipamientos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RYZEN 7
 */
public class frmEquipamiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmEquipamiento
     */
    DefaultTableModel modelo;
    public frmEquipamiento() {
        initComponents();
mtdPrepararTabla();
    }
    
    private void mtdPrepararTabla(){
    String titulos []={"# Serie","Nombre", "Disponibilidad", "Categoria", "Estado"};
modelo = new DefaultTableModel(null, titulos);
tablaEquipamiento.setModel(modelo);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEquipamiento = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        cbFecha = new org.jdesktop.swingx.JXDatePicker();

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
        txtNseriePro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNserieProKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNserieProKeyTyped(evt);
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

        btnAgregar.setBackground(new java.awt.Color(102, 255, 102));
        btnAgregar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 140, 40));

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

        tablaEquipamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaEquipamiento);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 580, 300));

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 130, 50));

        btnEditar.setBackground(new java.awt.Color(51, 153, 255));
        btnEditar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 140, 40));
        getContentPane().add(cbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNserieProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNserieProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNserieProActionPerformed
private static boolean ga=false;


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    clases.equipamientos obj = new clases.equipamientos(txtNseriePro.getText(), txtNombrePro.getText(), cboxDisponibilidad.getSelectedItem().toString(),cboxCategoria.getSelectedItem().toString(),cboxEstado.getSelectedItem().toString());
if(txtNseriePro.getText().length()>0){
    if(txtNombrePro.getText().length()>0){
        if(cboxDisponibilidad.getSelectedIndex()>0){
            if(cboxCategoria.getSelectedIndex()>0){
                if(cboxEstado.getSelectedIndex()>0){
    
    if (ga==false){
    modelo= (DefaultTableModel) tablaEquipamiento.getModel();
    //"# Serie","Nombre", "Disponibilidad", "Categoria", "Estado"
    
    String nuevFila[]={obj.getNumSerieEquip(),obj.getTipoEquip(), obj.getDisponibilidadEquip(), obj.getEstadoEquip(), obj.getCategoriaEquip()};
    modelo.addRow(nuevFila);
    mtdLimpiar();

}
if (ga==true){
    int filasel=tablaEquipamiento.getSelectedRow();
    if (filasel==-1){
        JOptionPane.showMessageDialog(null,"Seleccione una fila" );
    }else{
        tablaEquipamiento.setValueAt(txtNseriePro.getText(), filasel, 0);
        tablaEquipamiento.setValueAt(txtNombrePro.getText(), filasel, 1);
        tablaEquipamiento.setValueAt(cboxDisponibilidad.getSelectedItem().toString(), filasel, 2);
        tablaEquipamiento.setValueAt(cboxCategoria.getSelectedItem().toString(), filasel, 3);
        tablaEquipamiento.setValueAt(cboxEstado.getSelectedItem().toString(), filasel, 4);
        ga=false;
        mtdLimpiar();
    }

}else{
}
}else{
    JOptionPane.showMessageDialog(null, "Por favor seleccione el estado","Sistema de Canchas",JOptionPane.INFORMATION_MESSAGE);
        }    
    }else{
    JOptionPane.showMessageDialog(null, "Por favor seleccione la categoría","Sistema de Canchas",JOptionPane.INFORMATION_MESSAGE);
    }
}else{
    JOptionPane.showMessageDialog(null, "Por favor seleccione la disponibilidad","Sistema de Canchas",JOptionPane.INFORMATION_MESSAGE);
}
}else{
    JOptionPane.showMessageDialog(null, "Por favor dijite el nombre del producto","Sistema de Canchas",JOptionPane.INFORMATION_MESSAGE);
}
}else{
    JOptionPane.showMessageDialog(null, "Por favor dijite el numero de serie","Sistema de Canchas",JOptionPane.INFORMATION_MESSAGE);

}
    }//GEN-LAST:event_btnAgregarActionPerformed
private void mtdLimpiar(){
    txtNseriePro.setText("");
    txtNombrePro.setText("");
    cboxDisponibilidad.setSelectedIndex(0);
    cboxCategoria.setSelectedIndex(0);
    cboxEstado.setSelectedIndex(0);
    
    cbFecha.getEditor().setText("25/10/2024");
    String fecha =cbFecha.getEditor().getText();
    
}
    private void cboxDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxDisponibilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxDisponibilidadActionPerformed

    private void cboxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxCategoriaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filasel = tablaEquipamiento.getSelectedRow();
        if (filasel==-1){
            JOptionPane.showMessageDialog(null, "No hay ninguna fila seleccionada, para continuar debe seleccionar una","Sistema de Canchas",JOptionPane.INFORMATION_MESSAGE);
        }else{
            modelo=(DefaultTableModel) tablaEquipamiento.getModel();
            modelo.removeRow(filasel);
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int filasel = tablaEquipamiento.getSelectedRow();
        if (filasel==-1){
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila!","Sistema de Canchas",JOptionPane.INFORMATION_MESSAGE);
        }else{
            txtNseriePro.setText(tablaEquipamiento.getValueAt(filasel, 0).toString());
            txtNombrePro.setText(tablaEquipamiento.getValueAt(filasel, 1).toString());
cboxDisponibilidad.setSelectedItem(tablaEquipamiento.getValueAt(filasel, 2).toString());
cboxCategoria.setSelectedItem(tablaEquipamiento.getValueAt(filasel, 3).toString());
cboxEstado.setSelectedItem(tablaEquipamiento.getValueAt(filasel, 4).toString());
        ga = true;
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNserieProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNserieProKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNserieProKeyReleased

    private void txtNserieProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNserieProKeyTyped
char caracter =evt.getKeyChar();
        
//Verificar si la tecla pulsada no es un digito
        if(((caracter<'0')||(caracter>'9'))){
    evt.consume();
}
        if(txtNseriePro.getText().length()>9){
                evt.consume();

        }
    }//GEN-LAST:event_txtNserieProKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private org.jdesktop.swingx.JXDatePicker cbFecha;
    private javax.swing.JComboBox<String> cboxCategoria;
    private javax.swing.JComboBox<String> cboxDisponibilidad;
    private javax.swing.JComboBox<String> cboxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tablaEquipamiento;
    private javax.swing.JTextField txtNombrePro;
    private javax.swing.JTextField txtNseriePro;
    // End of variables declaration//GEN-END:variables
}
