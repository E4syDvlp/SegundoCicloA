
package formularios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmProductos extends javax.swing.JInternalFrame {
DefaultTableModel modelox;
    public frmProductos() {
        initComponents();
        mtdPrepararTabla();
    }

    private void mtdPrepararTabla(){
    String titulos []={"ID","Nombre","Descripcion","Stock Min", "Stock Max","Precio Compra","Precio Venta","Registro","Expiracion","% Descuento","Marca","Categoria"};
modelox = new DefaultTableModel(null, titulos);
tablaProductos.setModel(modelox);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombrePro = new javax.swing.JTextField();
        txtDescripcionPro = new javax.swing.JTextField();
        txtStockMinimo = new javax.swing.JTextField();
        txtStockMaximo = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtPorcentajeDescuento = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtIdPro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtFechaRegistro = new org.jdesktop.swingx.JXDatePicker();
        txtExpiracion = new org.jdesktop.swingx.JXDatePicker();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("PRODUCTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 80, 30));

        jLabel2.setText("Precio de venta:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel3.setText("Nombre de categoria");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        jLabel4.setText("Precio de compra:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel5.setText("Stock Máximo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setText("Stock minimo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel7.setText("Descripción:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel8.setText("Nombre:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel9.setText("Id producto:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel10.setText("Fecha de registro:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel11.setText("Fecha de expiración:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel12.setText("Porcentaje de descuento:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jLabel13.setText("Marca:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        txtNombrePro.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtNombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 180, 30));

        txtDescripcionPro.setBackground(new java.awt.Color(204, 255, 255));
        txtDescripcionPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionProActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescripcionPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, 30));

        txtStockMinimo.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtStockMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 180, 30));

        txtStockMaximo.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtStockMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 180, 30));

        txtPrecioCompra.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 180, 30));

        txtPrecioVenta.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 180, 30));

        txtPorcentajeDescuento.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtPorcentajeDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 180, 30));

        txtMarca.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 180, 30));

        txtCategoria.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 180, 30));

        txtIdPro.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txtIdPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 180, 30));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 790, 470));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 90, 30));
        getContentPane().add(txtFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));
        getContentPane().add(txtExpiracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private static boolean ga=false;

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        clases.productos obj = new clases.productos(txtIdPro.getText(),txtNombrePro.getText(),txtDescripcionPro.getText(),
               Integer.parseInt(txtStockMinimo.getText()),Integer.parseInt(txtStockMaximo.getText()),Double.parseDouble(txtPrecioCompra.getText()),Double.parseDouble(txtPrecioVenta.getText()),txtFechaRegistro.getEditor().getText(),txtExpiracion.getEditor().getText(),
       Double.parseDouble(txtPorcentajeDescuento.getText()),txtMarca.getText(),txtCategoria.getText());
if(txtIdPro.getText().length()>0){
    if(txtNombrePro.getText().length()>0){
        if(txtDescripcionPro.getText().length()>0){
            if(txtStockMinimo.getText().length()>0){
    if(txtStockMaximo.getText().length()>0){
        if(txtPrecioCompra.getText().length()>0){
            if(txtPrecioVenta.getText().length()>0){
                if(txtFechaRegistro.getEditor().getText().length()>0){
                    if(txtExpiracion.getEditor().getText().length()>0){
                        if(txtPorcentajeDescuento.getText().length()>0){
                            if(txtMarca.getText().length()>0){
                                if(txtCategoria.getText().length()>0){
    
        if(ga==false){
       modelox= (DefaultTableModel) tablaProductos.getModel(); 

String nuevaFila[]={obj.getIdProducto(),obj.getNombreProducto(), obj.getDesProducto(), String.valueOf(obj.getStockMinimo()),String.valueOf(obj.getStockMaximo()),
String.valueOf(obj.getPrCompra()),String.valueOf(obj.getPrVenta()),obj.getFechaRegistro(),obj.getFechaExpiracion(),String.valueOf(obj.getPorcentajeDescuento()),
obj.getNombreMarca(),obj.getCategoria()};

modelox.addRow(nuevaFila);
mtdLimpiar();
}
if (ga==true){
    int filasel=tablaProductos.getSelectedRow();
    if(filasel==-1){
        JOptionPane.showMessageDialog(null, "Por favor seleccione una fila","Sistema de Canchas",JOptionPane.INFORMATION_MESSAGE);
    }else{
        tablaProductos.setValueAt(txtIdPro.getText(), filasel, 0);
        tablaProductos.setValueAt(txtNombrePro.getText(), filasel, 1);
        tablaProductos.setValueAt(txtDescripcionPro.getText(), filasel, 2);
        tablaProductos.setValueAt(txtStockMinimo.getText(), filasel, 3);
        tablaProductos.setValueAt(txtStockMaximo.getText(), filasel, 4);
        tablaProductos.setValueAt(txtPrecioCompra.getText(), filasel, 5);
        tablaProductos.setValueAt(txtPrecioVenta.getText(), filasel, 6);
        tablaProductos.setValueAt(txtFechaRegistro.getEditor().getText(), filasel, 7);
        tablaProductos.setValueAt(txtExpiracion.getEditor().getText(), filasel, 8);
        tablaProductos.setValueAt(txtPorcentajeDescuento.getText(), filasel, 9);
        tablaProductos.setValueAt(txtMarca.getText(), filasel, 10);
        tablaProductos.setValueAt(txtCategoria.getText(), filasel, 11);
        ga=false;
        mtdLimpiar();
    }
}else{
}
}else{
JOptionPane.showMessageDialog(null, "Por favor ingrese la categoria","Error",JOptionPane.INFORMATION_MESSAGE);
}
}else{
JOptionPane.showMessageDialog(null, "Por favor ingrese la marca","Error",JOptionPane.INFORMATION_MESSAGE);    
}
}else{
JOptionPane.showMessageDialog(null, "Por favor ingrese el porcentaje de descuento","Error",JOptionPane.INFORMATION_MESSAGE);    
}
}else{
JOptionPane.showMessageDialog(null, "Por favor ingrese la fecha de expiración","Error",JOptionPane.INFORMATION_MESSAGE);    
}
}else{
JOptionPane.showMessageDialog(null, "Por favor ingrese la fecha de registro","Error",JOptionPane.INFORMATION_MESSAGE);    
}
}else{
JOptionPane.showMessageDialog(null, "Por favor ingrese el precio de venta","Error",JOptionPane.INFORMATION_MESSAGE);    
}
}else{
JOptionPane.showMessageDialog(null, "Por favor ingrese el precio de compra","Error",JOptionPane.INFORMATION_MESSAGE);    
}
}else{
JOptionPane.showMessageDialog(null, "Por favor ingrese el stock máximo","Error",JOptionPane.INFORMATION_MESSAGE);    
}
}else{
JOptionPane.showMessageDialog(null, "Por favor ingrese el stock mínimo","Error",JOptionPane.INFORMATION_MESSAGE);    
}
}else{
JOptionPane.showMessageDialog(null, "Por favor ingrese la descripción del producto","Error",JOptionPane.INFORMATION_MESSAGE);    
}
}else{
JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre del producto","Error",JOptionPane.INFORMATION_MESSAGE);    
}
}else{
JOptionPane.showMessageDialog(null, "Por favor ingrese el ID del producto","Error",JOptionPane.INFORMATION_MESSAGE);    
}
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDescripcionProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionProActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int filasel = tablaProductos.getSelectedRow();
        if (filasel==-1){
            JOptionPane.showMessageDialog(null, "No hay ninguna fila seleccionada, para continuar debe seleccionar una","Sistema de Canchas",JOptionPane.INFORMATION_MESSAGE);
        }else{
            modelox=(DefaultTableModel) tablaProductos.getModel();
            modelox.removeRow(filasel);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
                int filasel = tablaProductos.getSelectedRow();
        if (filasel==-1){
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila!","Sistema de Canchas",JOptionPane.INFORMATION_MESSAGE);
        }else{
            txtIdPro.setText(tablaProductos.getValueAt(filasel, 0).toString());
            txtNombrePro.setText(tablaProductos.getValueAt(filasel, 1).toString());
txtDescripcionPro.setText(tablaProductos.getValueAt(filasel, 2).toString());
txtStockMinimo.setText(tablaProductos.getValueAt(filasel, 3).toString());
txtStockMaximo.setText(tablaProductos.getValueAt(filasel, 4).toString());
            txtPrecioCompra.setText(tablaProductos.getValueAt(filasel, 5).toString());
            txtPrecioVenta.setText(tablaProductos.getValueAt(filasel, 6).toString());
txtFechaRegistro.getEditor().setText(tablaProductos.getValueAt(filasel, 7).toString());
txtExpiracion.getEditor().setText(tablaProductos.getValueAt(filasel, 8).toString());
txtPorcentajeDescuento.setText(tablaProductos.getValueAt(filasel, 9).toString());
txtMarca.setText(tablaProductos.getValueAt(filasel, 10).toString());
txtCategoria.setText(tablaProductos.getValueAt(filasel, 11).toString());

        ga = true;
        }
    }//GEN-LAST:event_btnEditarActionPerformed
/*
           clases.productos obj = new clases.productos(txtIdPro.getText(),txtNombrePro.getText(),txtDescripcionPro.getText(),
       Integer.parseInt(txtStockMinimo.getText()),Integer.parseInt(txtStockMaximo.getText()),Double.parseDouble(txtPrecioCompra.getText()),Double.parseDouble(txtPrecioVenta.getText()),txtFechaRegistro.getEditor().getText(),txtExpiracion.getEditor().getText(),
       Double.parseDouble(txtPorcentajeDescuento.getText()),txtMarca.getText(),txtCategoria.getText());
    */
private void mtdLimpiar(){
    txtIdPro.setText("");
    txtNombrePro.setText("");
    txtDescripcionPro.setText("");
    txtStockMinimo.setText("");
    txtStockMaximo.setText("");
    txtPrecioCompra.setText("");
    txtPrecioVenta.setText("");
    txtFechaRegistro.getEditor().setText("");
    txtExpiracion.getEditor().setText("");
    txtPorcentajeDescuento.setText("");
    txtMarca.setText("");
    txtCategoria.setText("");
    
}
private void mtdLimpiar2(){
    txtIdPro.setText("");
    txtNombrePro.setText("");
    txtDescripcionPro.setText("");
    txtStockMinimo.setText("");
    txtStockMaximo.setText("");
    txtPrecioCompra.setText("");
    txtPrecioVenta.setText("");
    txtFechaRegistro.getEditor().setText("");
    txtExpiracion.getEditor().setText("");
    txtMarca.setText("");
    txtCategoria.setText("");
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtDescripcionPro;
    private org.jdesktop.swingx.JXDatePicker txtExpiracion;
    private org.jdesktop.swingx.JXDatePicker txtFechaRegistro;
    private javax.swing.JTextField txtIdPro;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombrePro;
    private javax.swing.JTextField txtPorcentajeDescuento;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtStockMaximo;
    private javax.swing.JTextField txtStockMinimo;
    // End of variables declaration//GEN-END:variables
}
