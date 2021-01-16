/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.*;
import java.awt.Frame;
import java.awt.Point;
import java.util.ArrayList;
/**
 *
 * @author codeboy1028
 */
public class SignUp extends javax.swing.JFrame {

    ArrayList<Cuenta> cuenta;
    public SignUp() {
        this.cuenta = new ArrayList<>();
        initComponents();
        this.setUndecorated(true);
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

        pnlRegistro = new javax.swing.JPanel();
        txtCorreo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNickname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxMayorista = new javax.swing.JCheckBox();
        pnlCabecera = new javax.swing.JPanel();
        pnlOpciones = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        lblMaximizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        pnlTitulos = new javax.swing.JPanel();
        lblIcono = new javax.swing.JLabel();
        lblTitular = new javax.swing.JLabel();

        setBackground(new java.awt.Color(122, 108, 105));

        pnlRegistro.setBackground(new java.awt.Color(122, 108, 105));
        pnlRegistro.setLayout(new java.awt.GridBagLayout());

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 25, 0, 0);
        pnlRegistro.add(txtCorreo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 25, 0, 0);
        pnlRegistro.add(txtApellido, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 25, 0, 0);
        pnlRegistro.add(txtNombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 200, 0, 38);
        pnlRegistro.add(jSeparator1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 28, 0, 0);
        pnlRegistro.add(jSeparator2, gridBagConstraints);

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre (s)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 143, 0, 0);
        pnlRegistro.add(lblNombre, gridBagConstraints);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 143, 0, 0);
        pnlRegistro.add(jLabel2, gridBagConstraints);

        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellido (s)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 143, 0, 0);
        pnlRegistro.add(lblApellido, gridBagConstraints);

        lblRegistro.setFont(new java.awt.Font("Rachana", 1, 36)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setText("Registro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 24, 0, 0);
        pnlRegistro.add(lblRegistro, gridBagConstraints);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 143, 0, 0);
        pnlRegistro.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 25, 0, 0);
        pnlRegistro.add(txtContrasena, gridBagConstraints);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(46, 26, 40, 0);
        pnlRegistro.add(btnRegistrar, gridBagConstraints);

        jLabel3.setText("Nickname");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        pnlRegistro.add(jLabel3, gridBagConstraints);

        txtNickname.setText("jTextField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        pnlRegistro.add(txtNickname, gridBagConstraints);

        jLabel4.setText("jLabel4");
        pnlRegistro.add(jLabel4, new java.awt.GridBagConstraints());

        txtEdad.setText("jTextField1");
        pnlRegistro.add(txtEdad, new java.awt.GridBagConstraints());

        jLabel5.setText("jLabel5");
        pnlRegistro.add(jLabel5, new java.awt.GridBagConstraints());

        txtDireccion.setText("jTextField1");
        pnlRegistro.add(txtDireccion, new java.awt.GridBagConstraints());

        jLabel6.setText("jLabel6");
        pnlRegistro.add(jLabel6, new java.awt.GridBagConstraints());

        cbxMayorista.setText("Mayorista?");
        pnlRegistro.add(cbxMayorista, new java.awt.GridBagConstraints());

        getContentPane().add(pnlRegistro, java.awt.BorderLayout.CENTER);

        pnlCabecera.setBackground(new java.awt.Color(0, 148, 2));
        pnlCabecera.setLayout(new java.awt.BorderLayout());

        pnlOpciones.setLayout(new java.awt.GridLayout(1, 3));

        lblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/images/-.png"))); // NOI18N
        lblMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setOpaque(true);
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        pnlOpciones.add(lblMinimizar);

        lblMaximizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/images/O.png"))); // NOI18N
        lblMaximizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMaximizar.setOpaque(true);
        lblMaximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaximizarMouseClicked(evt);
            }
        });
        pnlOpciones.add(lblMaximizar);

        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/images/X.png"))); // NOI18N
        lblCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCerrar.setOpaque(true);
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        pnlOpciones.add(lblCerrar);

        pnlCabecera.add(pnlOpciones, java.awt.BorderLayout.EAST);

        pnlTitulos.setOpaque(false);
        pnlTitulos.setLayout(new java.awt.BorderLayout());

        lblIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/images/T.png"))); // NOI18N
        pnlTitulos.add(lblIcono, java.awt.BorderLayout.WEST);

        lblTitular.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitular.setForeground(new java.awt.Color(255, 255, 255));
        lblTitular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitular.setText("Registro");
        lblTitular.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblTitularMouseDragged(evt);
            }
        });
        lblTitular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTitularMousePressed(evt);
            }
        });
        pnlTitulos.add(lblTitular, java.awt.BorderLayout.CENTER);

        pnlCabecera.add(pnlTitulos, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlCabecera, java.awt.BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaximizarMouseClicked
        if (this.getExtendedState() == Frame.MAXIMIZED_BOTH) {
            this.setExtendedState(Frame.NORMAL);
        } else {
            this.setExtendedState(Frame.MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_lblMaximizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblTitularMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitularMouseDragged
        //Puntos iniciales
        int thisX = this.getLocation().x;
        int thisY = this.getLocation().y;

        //Movimiento de arrastre
        int xMov = evt.getX() - this.puntoInicial.x;
        int yMov = evt.getY() - this.puntoInicial.y;

        //Nuevas posiciones
        int x = thisX + xMov;
        int y = thisY + yMov;

        this.setLocation(x, y);
    }//GEN-LAST:event_lblTitularMouseDragged

    private void lblTitularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitularMousePressed
        this.puntoInicial = evt.getPoint();
    }//GEN-LAST:event_lblTitularMousePressed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Cliente cliente = new Cliente("",txtNombre.getText(),Integer.parseInt(txtEdad.getText()),txtCorreo.getText(),txtDireccion.getText(),cbxMayorista.isSelected());
        Cuenta usuario = new Cuenta(txtNombre.getText(),txtApellido.getText(), cliente);
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private Point puntoInicial;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox cbxMayorista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblMaximizar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JPanel pnlCabecera;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JPanel pnlTitulos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
