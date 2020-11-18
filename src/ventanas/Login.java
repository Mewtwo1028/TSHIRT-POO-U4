/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Frame;
import java.awt.Point;

/**
 *
 * @author Hydra
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        pnlLogin = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10));
        pnlCabecera = new javax.swing.JPanel();
        pnlOpciones = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        lblMaximizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        pnlTitulos = new javax.swing.JPanel();
        lblIcono = new javax.swing.JLabel();
        lblTitular = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(122, 108, 105));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setName("Login"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);

        pnlLogin.setBackground(new java.awt.Color(122, 108, 105));
        pnlLogin.setLayout(new java.awt.GridBagLayout());

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlLogin.add(lblPassword, gridBagConstraints);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/images/letras.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        pnlLogin.add(lblLogo, gridBagConstraints);

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlLogin.add(lblUsuario, gridBagConstraints);

        txtUsuario.setBackground(new java.awt.Color(122, 108, 105));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlLogin.add(txtUsuario, gridBagConstraints);

        txtPassword.setBackground(new java.awt.Color(122, 108, 105));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlLogin.add(txtPassword, gridBagConstraints);

        btnLogin.setBackground(new java.awt.Color(122, 108, 105));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Iniciar Sesion");
        btnLogin.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlLogin.add(btnLogin, gridBagConstraints);

        btnRegistrar.setBackground(new java.awt.Color(122, 108, 105));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlLogin.add(btnRegistrar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 10;
        pnlLogin.add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = 10;
        pnlLogin.add(filler2, gridBagConstraints);

        getContentPane().add(pnlLogin, java.awt.BorderLayout.CENTER);

        pnlCabecera.setBackground(new java.awt.Color(0, 148, 2));
        pnlCabecera.setLayout(new java.awt.BorderLayout());

        pnlOpciones.setLayout(new java.awt.GridLayout(1, 3));

        lblMinimizar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
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

        lblMaximizar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
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

        lblCerrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
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
        lblIcono.setMaximumSize(new java.awt.Dimension(35, 35));
        lblIcono.setMinimumSize(new java.awt.Dimension(35, 35));
        lblIcono.setPreferredSize(new java.awt.Dimension(35, 35));
        pnlTitulos.add(lblIcono, java.awt.BorderLayout.WEST);

        lblTitular.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitular.setForeground(new java.awt.Color(255, 255, 255));
        lblTitular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitular.setText("Login");
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaximizarMouseClicked
        this.setState(Frame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_lblMaximizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblTitularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitularMousePressed
        this.puntoInicial = evt.getPoint();
    }//GEN-LAST:event_lblTitularMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    private Point puntoInicial;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMaximizar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCabecera;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlTitulos;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
