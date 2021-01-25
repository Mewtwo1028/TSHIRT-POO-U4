/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Cuenta;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Hydra
 */
public class Login extends javax.swing.JFrame implements ActionListener, KeyListener {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        datos.EscrituraTxt es = new datos.EscrituraTxt();
        es.agregarCuenta(new Cuenta("admin", "admin", new clases.Cliente("", "", 20, "", "", false), Cuenta.ADMINISTRADOR));
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
        setResizable(false);

        pnlLogin.setBackground(new java.awt.Color(122, 108, 105));
        pnlLogin.setLayout(new java.awt.GridBagLayout());

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
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlLogin.add(txtUsuario, gridBagConstraints);

        txtPassword.setBackground(new java.awt.Color(122, 108, 105));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlLogin.add(txtPassword, gridBagConstraints);

        btnLogin.setBackground(new java.awt.Color(122, 108, 105));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Iniciar Sesion");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });
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
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
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
        if (this.getExtendedState() == Frame.MAXIMIZED_BOTH) {
            this.setExtendedState(Frame.NORMAL);
        } else {
            this.setExtendedState(Frame.MAXIMIZED_BOTH);
        }
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

    public void ingresar() {
        String user, pass;
        user = txtUsuario.getText().trim();
        pass = String.valueOf(txtPassword.getPassword());
        datos.LecturaTxt lec = new datos.LecturaTxt();
        Cuenta[] cuentas = lec.obtenerCuentas();
        int i = 0;

        boolean existe = false;
        int a = 0;
        while (cuentas[i] != null) {
            System.out.println(cuentas[i].getNickName());
            System.out.println(cuentas[i].getContrasena());
            if (cuentas[i].getNickName().equals(user)) {
                existe = true;
                if (cuentas[i].getContrasena().equals(pass)) {
                    switch (cuentas[i].getTipo()) {
                        case Cuenta.ADMINISTRADOR -> {
                            a = 1;
                            PanelCuenta.cuenta = cuentas[i];
                            PanelCuenta.index = i;
                            AdministracionAdmin aa = new AdministracionAdmin();
                            aa.setLocationRelativeTo(null);
                            aa.setVisible(true);

                            this.dispose();
                            break;
                        }
                        case Cuenta.CLIENTE -> {
                            a = 1;
                            PanelCuenta.cuenta = cuentas[i];
                            PanelCuenta.index = i;
                            AdministracionUsuario au = new AdministracionUsuario();
                            au.setLocationRelativeTo(null);
                            au.setDefaultCloseOperation(EXIT_ON_CLOSE);
                            au.setVisible(true);

                            this.dispose();
                            break;
                        }
                    }
                    if (a == 1) {
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Introduzca la password correcta", "Password incorrecta", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
            i++;
        }

        if (!existe) {
            JOptionPane.showMessageDialog(this, "No existe el usuario ingresado", "Usuario no encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        ingresar();

    }//GEN-LAST:event_btnLoginActionPerformed

    private void validar(int a) {
        if ((a == KeyEvent.VK_ENTER)
                && (!String.valueOf(txtPassword.getPassword()).trim().equals(""))
                && (!txtUsuario.getText().trim().equals(""))) {

            ingresar();
        }
    }


    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed

        validar(evt.getKeyCode());


    }//GEN-LAST:event_btnLoginKeyPressed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        validar(evt.getKeyCode());
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        validar(evt.getKeyCode());
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        SignUp su = new SignUp();
        su.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        su.setVisible(true);
        su.setSize(su.getPreferredSize());
    }//GEN-LAST:event_btnRegistrarActionPerformed

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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
