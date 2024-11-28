/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package formularios;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author RYZEN 7
 */
public class frmFacturax extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmFacturax
     */
    DefaultTableModel modelo;
    DefaultTableModel modeloCabecera;
    
    public frmFacturax() {
        initComponents();
        mtd_tablaDetalle();
    }
        private void mtd_tablaDetalle2() {
        //String num_fact, String fecha, String cedula_cliente, String nombre_cliente, double subt_fact, double desc_fact, double iva_fact, double total_fact
        String titulos[] = {"N° factura", "Fecha", "Cedula", "Nombre", "Subtotal", "Descuento", "Iva", "Total"};
        modeloCabecera = new DefaultTableModel(null, titulos);
        tablaFactura.setModel(modeloCabecera);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        txtNumFactura = new javax.swing.JTextField();
        btnBuscarPro = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        cboxFecha = new org.jdesktop.swingx.JXDatePicker();
        btnEditar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        btnEliminar2 = new javax.swing.JButton();
        btnBuscar2 = new javax.swing.JButton();
        btnAgregar2 = new javax.swing.JButton();
        cboxDescuento = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 56, -1, -1));

        jLabel2.setText("ID Producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 116, -1, -1));

        jLabel3.setText("Producto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 146, -1, -1));

        jLabel4.setText("Subtotal:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 276, 50, -1));

        jLabel5.setText("Cédula:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 16, -1, -1));

        jLabel6.setText("Cantidad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 176, -1, -1));

        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 116, 140, -1));

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 16, 140, -1));

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 146, 140, -1));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 176, 140, -1));

        txtSubtotal.setEditable(false);
        txtSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 276, 140, -1));

        txtNumFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 6, 140, -1));

        btnBuscarPro.setText("Buscar Productos");
        getContentPane().add(btnBuscarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 130, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 116, 110, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 116, 110, -1));

        jLabel7.setText("Fecha:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 56, -1, -1));

        jLabel8.setText("Número de factura:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 6, -1, -1));

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 56, 140, -1));
        getContentPane().add(cboxFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 56, -1, -1));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 116, 110, -1));

        jButton7.setText("Buscar Clientes");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 36, -1, -1));

        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaFactura);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 456, 730, 100));

        jLabel9.setText("Descuento:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 316, 70, -1));

        jLabel10.setText("IVA:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 346, 40, -1));

        jLabel11.setText("Total:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 376, 50, -1));

        jLabel12.setText("Precio:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 206, 50, -1));

        txtTotal.setEditable(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 376, 140, -1));

        txtIva.setEditable(false);
        txtIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIvaActionPerformed(evt);
            }
        });
        getContentPane().add(txtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 348, 110, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 206, 140, -1));

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaDetalle);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 146, 490, 120));

        btnEliminar2.setText("Eliminar");
        getContentPane().add(btnEliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 416, -1, -1));

        btnBuscar2.setText("Buscar");
        getContentPane().add(btnBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 416, -1, -1));

        btnAgregar2.setText("Agregar");
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 416, -1, -1));

        cboxDescuento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cboxDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxDescuentoActionPerformed(evt);
            }
        });
        getContentPane().add(cboxDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        jLabel13.setText("%");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 150, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 30, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotalActionPerformed

    private void txtNumFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumFacturaActionPerformed
private static boolean ga = false;
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtIdProducto.getText().length() > 0) {
            if (txtProducto.getText().length() > 0) {
                if (txtCantidad.getText().length() > 0) {
                    if (txtPrecio.getText().length() > 0) {
                        clases.factura objdetalle = new clases.factura(txtIdProducto.getText(), txtProducto.getText(), Integer.parseInt(txtCantidad.getText()), Double.parseDouble(txtPrecio.getText()));

                        if (ga == false) {

                            modelo = (DefaultTableModel) tablaDetalle.getModel();
String nueva_fila[]={objdetalle.getIdProducto(), objdetalle.getNombreProducto(), Integer.toString(objdetalle.getCantProducto()),Double.toString(objdetalle.getPrecioProducto()),Double.toString(objdetalle.getTotalLinea())};

modelo.addRow(nueva_fila);
                            mtd_limpiar1();
                            mtd_calculos();
                        }
                        if (ga) {
                            int filasel = tablaDetalle.getSelectedRow();
                            tablaDetalle.setValueAt(txtIdProducto.getText(), filasel, 0);
                            tablaDetalle.setValueAt(txtProducto.getText(), filasel, 1);
                            tablaDetalle.setValueAt(txtCantidad.getText(), filasel, 2);
                            tablaDetalle.setValueAt(txtPrecio.getText(), filasel, 3);
                            tablaDetalle.setValueAt(objdetalle.getTotalLinea(), filasel, 4);

                            ga = false;
                            mtd_limpiar1();
                            mtd_calculos();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese el precio del producto", "Facturas", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida", "Facturas", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un nombre valido", "Facturas", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un id valido", "Facturas", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
     int filasel = tablaFactura.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila", "Equipamiento", JOptionPane.ERROR_MESSAGE);
        } else {
            txtIdProducto.setText(tablaDetalle.getValueAt(filasel, 0).toString());
            txtProducto.setText(tablaDetalle.getValueAt(filasel, 1).toString());
            txtCantidad.setText(tablaDetalle.getValueAt(filasel, 2).toString());
            txtPrecio.setText(tablaDetalle.getValueAt(filasel, 3).toString());
            ga = true;
            mtd_calculos();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIvaActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void cboxDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxDescuentoActionPerformed
        // TODO add your handling code here:
        mtd_calculos();
    }//GEN-LAST:event_cboxDescuentoActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char aplastado = evt.getKeyChar();

        if ((aplastado < '0') || (aplastado > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
         char aplastado = evt.getKeyChar();

        if ((aplastado < '0') || (aplastado > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
               int filasel = tablaDetalle.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila antes de borrarla");
        } else {
            modelo = (DefaultTableModel) tablaDetalle.getModel();
            modelo.removeRow(filasel);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        // TODO add your handling code here:
        if (txtCedula.getText().length() > 0) {
            if (txtNombres.getText().length() > 0) {
                if (txtNumFactura.getText().length() > 0) {
                    if (txtSubtotal.getText().length() > 0) {
                        if (cboxFecha.getDate() != null) {
                            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                            //Clases.cls_factura objfactura = new Clases.cls_factura(jTextField7.getText(), dateFormat.format(jXDatePicker1.getDate()), jTextField1.getText(), jTextField2.getText(), Double.parseDouble(jTextField9.getText()), Double.parseDouble(jTextField10.getText()), Double.parseDouble(jTextField11.getText()), Double.parseDouble(jTextField12.getText()));
                            clases.factura objfactura = new clases.factura(txtNumFactura.getText(), dateFormat.format(cboxFecha.getDate()), txtCedula.getText(), txtNombres.getText(), Double.parseDouble(txtSubtotal.getText()), Double.parseDouble(txtDescuento.getText()), Double.parseDouble(txtIva.getText()), Double.parseDouble(txtTotal.getText()));
                            modeloCabecera = (DefaultTableModel) tablaFactura.getModel();

                            String nueva_fila2[] = {objfactura.getNumFactura(), objfactura.getFecha(), objfactura.getCedulaCliente(), objfactura.getNombresCliente(), Double.toString(objfactura.getSubtFactura()), Double.toString(objfactura.getDescFactura()), Double.toString(objfactura.getIvaFactua()), Double.toString(objfactura.getTotalFactura())};

                            modeloCabecera.addRow(nueva_fila2);
                            mtd_limpiar2();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error", "Facturas", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error", "Facturas", JOptionPane.ERROR_MESSAGE);

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error", "Facturas", JOptionPane.ERROR_MESSAGE);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Error", "Facturas", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error", "Facturas", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregar2ActionPerformed
    //METODOS
    private void mtd_calculos() {
        DecimalFormat df = new DecimalFormat("####.##");
        double subtotal = 0;
        for (int i = 0; i < tablaDetalle.getRowCount(); i++) {
            subtotal = subtotal + Double.parseDouble(tablaDetalle.getValueAt(i, 4).toString());
        }
        txtSubtotal.setText(String.valueOf(df.format(subtotal).replace(",", ".")));

        double descuento = 0;
        descuento = (subtotal * (Double.parseDouble(cboxDescuento.getSelectedItem().toString()))) / 100;
        txtDescuento.setText(String.valueOf(df.format(descuento).replace(",",".")));

        double iva = 0;
        iva = (subtotal - descuento) * 0.15;
        txtIva.setText(String.valueOf(df.format(iva).replace(",",".")));

        double total = 0;
        total = (subtotal - descuento) + iva;
        txtTotal.setText(String.valueOf(df.format(total).replace(",",".")));
    }

    private void mtd_tablaDetalle() {
        String titulos[] = {"ID Producto", "Producto", "Cantidad", "Precio", "total"};
        modelo = new DefaultTableModel(null, titulos);
        tablaDetalle.setModel(modelo);
    }

    private void mtd_limpiar1() {
        txtIdProducto.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
    }

    //para no usar numeros de serie repetidos
    private boolean mtd_validacion_ingreso1(String dato_validacion) {
        boolean ban = false;
        for (int i = 0; i < tablaDetalle.getRowCount(); i++) {
            if (dato_validacion.equals(tablaDetalle.getValueAt(i, 0).toString())) {
                ban = true;
                break;
            }
        }
        return ban;
    }
    private void mtd_limpiar2() {
        txtIdProducto.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtCedula.setText("");
        txtNombres.setText("");
        txtNumFactura.setText("");
        txtSubtotal.setText("");
        txtCedula.setText("");
        txtIva.setText("");
        txtTotal.setText("");
        cboxFecha.setDate(null);
        
        DefaultTableModel modelo1 = (DefaultTableModel) tablaDetalle.getModel();
        int rowCount = modelo1.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            modelo1.removeRow(i);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnBuscarPro;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JComboBox<String> cboxDescuento;
    private org.jdesktop.swingx.JXDatePicker cboxFecha;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTable tablaFactura;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumFactura;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
