/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Hydra
 */
public class PanelDesign extends javax.swing.JPanel {

    /**
     * Creates new form PanelDesign
     */
    public PanelDesign() {

        initComponents();

    }

    public void run() {
        try {
            new PanelDesign().setVisible(true);

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(PanelDesign.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        imgCamisa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlOpciones = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        btnCargar = new javax.swing.JButton();
        pnlColor = new javax.swing.JPanel();
        cmbTalla = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        pnlTipo = new javax.swing.JPanel();
        btnComprar = new javax.swing.JButton();
        fotocargada = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(122, 108, 105));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgCamisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/images/kamisama.png"))); // NOI18N
        add(imgCamisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 189, 356, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/images/letras.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 59, -1, -1));

        pnlOpciones.setLayout(new javax.swing.BoxLayout(pnlOpciones, javax.swing.BoxLayout.Y_AXIS));

        pnlLogo.setBackground(new java.awt.Color(153, 153, 153));
        pnlLogo.setPreferredSize(new java.awt.Dimension(120, 30));

        btnCargar.setText("Subir imagen");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        pnlLogo.add(btnCargar);

        pnlOpciones.add(pnlLogo);

        pnlColor.setBackground(new java.awt.Color(153, 153, 153));
        pnlColor.setPreferredSize(new java.awt.Dimension(120, 30));

        cmbTalla.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        cmbTalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TALLA", "115 - Chica", "140 - Mediana", "170 - Grande", "190 - Extra Grande", "210 - Jumbo", " " }));
        pnlColor.add(cmbTalla);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre camisa");
        pnlColor.add(jLabel2);

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setMinimumSize(new java.awt.Dimension(50, 20));
        txtNombre.setPreferredSize(new java.awt.Dimension(120, 20));
        pnlColor.add(txtNombre);

        pnlOpciones.add(pnlColor);

        pnlTipo.setBackground(new java.awt.Color(153, 153, 153));
        pnlTipo.setPreferredSize(new java.awt.Dimension(120, 30));

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        pnlTipo.add(btnComprar);

        pnlOpciones.add(pnlTipo);

        add(pnlOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 189, -1, 256));
        add(fotocargada, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 254, 110, 160));
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        String can = javax.swing.JOptionPane.showInputDialog(this, "Cantidad de articulos").trim();
        try {
            cantidad = Integer.parseInt(can);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Compra cancelada", "Datos incorrectos", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        clases.Cuenta c = PanelCuenta.cuenta;
        if (c.getTarjeta() == null) {
            PaneldePago objPanelPagoT = new PaneldePago();

            objPanelPagoT.setVisible(true);
            return;
        }
        String numT = c.getTarjeta().getNumero();
        String clave = javax.swing.JOptionPane.showInputDialog(this,
                "Introduza su clave a 3 o 4 digitos para la tarjeta con terminacion " + numT.substring(numT.length() - 4, numT.length()));
        if (!clave.equals(c.getTarjeta().getCvv() + "")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Clave incorrecta, compra revocada", "Error de validacion", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            datos.Escritura es = new datos.EscrituraTxt();
            String talla = ((String)cmbTalla.getSelectedItem()).split("-")[1], marca = "Generica", nombre = txtNombre.getText().trim();
            int precio = Integer.parseInt(((String)cmbTalla.getSelectedItem()).split("-")[0].trim());
            clases.Producto p = new clases.Producto(talla, nombre, precio, cantidad);
            
            es.agregarVenta(new clases.Venta(precio*cantidad, c.getUsuario(), null), p);
            javax.swing.JOptionPane.showMessageDialog(this, "Compra realizada con exito", "Compra completada", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Buscar Imagen");

        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            //   File archivo = new File(fc.getSelectedFile().toString());

            rsscalelabel.RSScaleLabel.setScaleLabel(fotocargada, fc.getSelectedFile().toString());

        }
    }//GEN-LAST:event_btnCargarActionPerformed

    public static String id = "";
    public static int cantidad = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JComboBox<String> cmbTalla;
    private javax.swing.JLabel fotocargada;
    private javax.swing.JLabel imgCamisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnlColor;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlTipo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
