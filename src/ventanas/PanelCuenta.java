/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author Hydra
 */
public class PanelCuenta extends javax.swing.JPanel {

    /**
     * Creates new form PanelCuenta
     */
    public PanelCuenta() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        PanelContenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nick = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        cmbNick = new javax.swing.JTextField();
        cmbNombre = new javax.swing.JTextField();
        cmbDireccion = new javax.swing.JTextField();
        cmbTelefono = new javax.swing.JTextField();
        cmbCorreo = new javax.swing.JTextField();
        btnCambiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(122, 108, 105));
        setLayout(new java.awt.BorderLayout());

        PanelContenido.setBackground(new java.awt.Color(122, 108, 105));
        PanelContenido.setLayout(new java.awt.GridBagLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/images/iconousuario.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelContenido.add(jLabel1, gridBagConstraints);

        Nick.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Nick.setForeground(new java.awt.Color(255, 255, 255));
        Nick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nick.setText("Nickname:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelContenido.add(Nick, gridBagConstraints);

        Nombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelContenido.add(Nombre, gridBagConstraints);

        Direccion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Direccion.setForeground(new java.awt.Color(255, 255, 255));
        Direccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Direccion.setText("Direccion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelContenido.add(Direccion, gridBagConstraints);

        Telefono.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Telefono.setForeground(new java.awt.Color(255, 255, 255));
        Telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Telefono.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelContenido.add(Telefono, gridBagConstraints);

        Correo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Correo.setForeground(new java.awt.Color(255, 255, 255));
        Correo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Correo.setText("Correo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelContenido.add(Correo, gridBagConstraints);

        cmbNick.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmbNick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNickActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelContenido.add(cmbNick, gridBagConstraints);

        cmbNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNombreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelContenido.add(cmbNombre, gridBagConstraints);

        cmbDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmbDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDireccionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelContenido.add(cmbDireccion, gridBagConstraints);

        cmbTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmbTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTelefonoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelContenido.add(cmbTelefono, gridBagConstraints);

        cmbCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmbCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCorreoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelContenido.add(cmbCorreo, gridBagConstraints);

        btnCambiar.setText("Cambiar foto");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PanelContenido.add(btnCambiar, gridBagConstraints);

        btnGuardar.setText("Guardar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelContenido.add(btnGuardar, gridBagConstraints);

        btnSalir.setText("Salir");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelContenido.add(btnSalir, gridBagConstraints);

        add(PanelContenido, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNickActionPerformed

    private void cmbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNombreActionPerformed

    private void cmbDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDireccionActionPerformed

    private void cmbTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTelefonoActionPerformed

    private void cmbCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCorreoActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Nick;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JLabel Telefono;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField cmbCorreo;
    private javax.swing.JTextField cmbDireccion;
    private javax.swing.JTextField cmbNick;
    private javax.swing.JTextField cmbNombre;
    private javax.swing.JTextField cmbTelefono;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
