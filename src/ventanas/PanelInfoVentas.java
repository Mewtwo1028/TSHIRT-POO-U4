/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Venta;
import excepciones.ExVacio;

/**
 *
 * @author Hydra
 */
public class PanelInfoVentas extends javax.swing.JPanel {

    /**
     * Creates new form PanelVentas
     */
    public PanelInfoVentas() {
        initComponents();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        menuPop = new javax.swing.JPopupMenu();
        itEditarVenta = new javax.swing.JMenuItem();
        itEditarRegistro = new javax.swing.JMenuItem();
        itBorrarVenta = new javax.swing.JMenuItem();
        itBorrarRegistro = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itCobertura = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        lblUsuario = new javax.swing.JLabel();
        lblFolio = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        cmbUsuario = new javax.swing.JComboBox<>();
        cmbProducto = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        txtFolio = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();

        itEditarVenta.setText("Editar venta");
        itEditarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itEditarVentaActionPerformed(evt);
            }
        });
        menuPop.add(itEditarVenta);

        itEditarRegistro.setText("Editar registro");
        menuPop.add(itEditarRegistro);

        itBorrarVenta.setText("Eliminar venta");
        menuPop.add(itBorrarVenta);

        itBorrarRegistro.setText("Borrar Registro");
        menuPop.add(itBorrarRegistro);
        menuPop.add(jSeparator1);

        itCobertura.setText("Ver cobertura");
        menuPop.add(itCobertura);

        setBackground(new java.awt.Color(122, 108, 105));
        setMinimumSize(new java.awt.Dimension(900, 400));
        setPreferredSize(new java.awt.Dimension(900, 400));
        setLayout(new java.awt.GridBagLayout());

        tblVentas.setAutoCreateRowSorter(true);
        tblVentas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Fecha", "Folio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVentas.setComponentPopupMenu(menuPop);
        jScrollPane1.setViewportView(tblVentas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 600;
        gridBagConstraints.ipady = 300;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jScrollPane1, gridBagConstraints);

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblUsuario, gridBagConstraints);

        lblFolio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblFolio.setForeground(new java.awt.Color(255, 255, 255));
        lblFolio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFolio.setText("Folio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblFolio, gridBagConstraints);

        lblProducto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProducto.setText("Producto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblProducto, gridBagConstraints);

        lblFecha.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Fecha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblFecha, gridBagConstraints);

        cmbUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(cmbUsuario, gridBagConstraints);

        cmbProducto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(cmbProducto, gridBagConstraints);

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(btnGuardar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txtFolio, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txtFecha, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void itEditarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itEditarVentaActionPerformed
        btnGuardar.setEnabled(true);
        seleccion = tblVentas.getSelectedRow();
        String val = (String) tblVentas.getValueAt(seleccion, 0);
        valorCombo(cmbUsuario, val);
        val = (String) tblVentas.getValueAt(seleccion, 1);
        valorCombo(cmbProducto, val);

        //tblVentas.setValueAt(cmbUsuario.getSelectedItem(), seleccion, 0);
        //tblVentas.setValueAt(cmbProducto.getSelectedItem(), seleccion, 1);
        //tblVentas.setValueAt(date, seleccion, 2);
        //tblVentas.setValueAt(txtFolio.getText().trim(), seleccion, 3);
        //tblVentas.setValueAt(cmbGarantia.getSelectedItem(), seleccion, 4);
        //tblVentas.setValueAt(chkExpirado.isSelected(), seleccion, 5);
        //tblVentas.setValueAt(chkCobrado.isSelected(), seleccion, 6);
    }//GEN-LAST:event_itEditarVentaActionPerformed

    private void llenarTabla() {
        ventas = lt.obtenerVenta();
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tblVentas.getModel();
        for (Venta v : ventas) {
            try {
                for (clases.Producto p : v.getProductos()) {
                    try {
                        dtm.addRow(new Object[]{p.getId(), v.getFecha(), v.getFolio()});
                    } catch (NullPointerException e) {
                    }

                }
            } catch (NullPointerException e) {
                break;
            }

        }
    }

    private void valorCombo(javax.swing.JComboBox<String> combo, String val) {
        for (int i = 1; i < combo.getItemCount(); i++) {
            if (val.equalsIgnoreCase(combo.getItemAt(i))) {
                combo.setSelectedIndex(i);
                break;
            }
        }
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            validarCombo(cmbProducto);
        } catch (ExVacio e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Error de seleccion", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtFolio.getText().trim().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Sin folio", "Folio faltante", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        java.util.Calendar fecha = txtFecha.getCalendar();
        String date;
        try {
            date = fecha.get(java.util.Calendar.DATE) + "/";
            date += fecha.get(java.util.Calendar.MONTH + 1) + "/";
            date += fecha.get(java.util.Calendar.YEAR) + "/";
        } catch (NullPointerException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Error en fecha", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        tblVentas.setValueAt(cmbProducto.getSelectedItem(), seleccion, 0);
        tblVentas.setValueAt(date, seleccion, 1);
        tblVentas.setValueAt(txtFolio.getText().trim(), seleccion, 2);

        int folio = Integer.parseInt(txtFolio.getText().trim());
        for (Venta venta : ventas) {
            try {
                if (venta.getFolio() == folio) {
                    es.modificarVenta(venta, folio);
                    break;
                }
            } catch (NullPointerException e) {
                break;
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void validarCombo(javax.swing.JComboBox combo) throws ExVacio {
        if (combo.getSelectedIndex() == 0) {
            combo.requestFocus();
            throw new ExVacio("No se ha seleccionado una opcion");
        }
    }

    private int seleccion;
    private clases.Venta[] ventas;
    private final datos.Escritura es = new datos.EscrituraTxt();
    private final datos.Lectura lt = new datos.LecturaTxt();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JComboBox<String> cmbUsuario;
    private javax.swing.JMenuItem itBorrarRegistro;
    private javax.swing.JMenuItem itBorrarVenta;
    private javax.swing.JMenuItem itCobertura;
    private javax.swing.JMenuItem itEditarRegistro;
    private javax.swing.JMenuItem itEditarVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPopupMenu menuPop;
    private javax.swing.JTable tblVentas;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtFolio;
    // End of variables declaration//GEN-END:variables
}
