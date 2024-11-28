package formularios;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmMarcas extends javax.swing.JInternalFrame {
DefaultTableModel modeloxx;
  
    public frmMarcas() {
        initComponents();
        mtdPrepararTabla();
    }
private void mtdPrepararTabla(){
    String titulos []={"ID","Nombre","Descripción"};
modeloxx=new DefaultTableModel(null,titulos);
tablaMarca.setModel(modeloxx);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtNombreMarca = new javax.swing.JTextField();
        txtDescripcionMarca = new javax.swing.JTextField();
        txtIDMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMarca = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Descripcion Marca:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel2.setText("Nombre Marca:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setText("MARCAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        jLabel4.setText("ID Marca:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtNombreMarca.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtNombreMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 150, -1));

        txtDescripcionMarca.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtDescripcionMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 140, -1));

        txtIDMarca.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtIDMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 150, -1));

        tablaMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMarca);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private static boolean ga= false;

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
             clases.Marcas obj = new clases.Marcas(txtIDMarca.getText(), txtNombreMarca.getText(), txtDescripcionMarca.getText());
        if(txtIDMarca.getText().length()>0){
        if(txtNombreMarca.getText().length()>0){
            if(txtDescripcionMarca.getText().length()>0){
             if (ga==false){
            modeloxx= (DefaultTableModel) tablaMarca.getModel(); 
            String nuevaFila[]={obj.getIdMarca(),obj.getNombreMarca(),obj.getDescripcionMarca()};
            modeloxx.addRow(nuevaFila);
        }
        if (ga==true){
            int filasel=tablaMarca.getSelectedRow();
    if(filasel==-1){
        JOptionPane.showMessageDialog(null, "Por favor seleccione una fila","error",JOptionPane.INFORMATION_MESSAGE);
    }else{
        tablaMarca.setValueAt(txtIDMarca.getText(),filasel,0);
        tablaMarca.setValueAt(txtNombreMarca.getText(),filasel, 1);
        tablaMarca.setValueAt(txtDescripcionMarca.getText(), filasel, 2);
        ga=false;
        mtdLimpiar();
    }
        }
        }else{
        JOptionPane.showMessageDialog(null, "Por favor ingrese la descripción de la marca","Error",JOptionPane.INFORMATION_MESSAGE);   
        }
        }else{
         JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre de la marca","Error",JOptionPane.INFORMATION_MESSAGE);       
            }
        }else{
         JOptionPane.showMessageDialog(null, "Por favor ingrese el Id de la marca","Error",JOptionPane.INFORMATION_MESSAGE);   
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
                int filasel = tablaMarca.getSelectedRow();
        if (filasel==-1){
            JOptionPane.showMessageDialog(null, "No hay ninguna fila seleccionada, para continuar debe seleccionar una","error",JOptionPane.INFORMATION_MESSAGE);
        }else{
            modeloxx=(DefaultTableModel) tablaMarca.getModel();
            modeloxx.removeRow(filasel);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
                         int filasel = tablaMarca.getSelectedRow();
        if (filasel==-1){
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila!","Sistema de Canchas",JOptionPane.INFORMATION_MESSAGE);
        }else{
            txtNombreMarca.setText(tablaMarca.getValueAt(filasel, 0).toString());
            txtNombreMarca.setText(tablaMarca.getValueAt(filasel, 1).toString());
txtDescripcionMarca.setText(tablaMarca.getValueAt(filasel, 2).toString());


        ga = true;
        }
    }//GEN-LAST:event_btnEditarActionPerformed
private void mtdLimpiar(){
    txtIDMarca.setText("");
    txtNombreMarca.setText("");
    txtDescripcionMarca.setText("");
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMarca;
    private javax.swing.JTextField txtDescripcionMarca;
    private javax.swing.JTextField txtIDMarca;
    private javax.swing.JTextField txtNombreMarca;
    // End of variables declaration//GEN-END:variables
}
