/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

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
        public void run(){
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
        jComboBox1 = new javax.swing.JComboBox<>();
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

        jComboBox1.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TALLA", "$115 Chica", "$140 Mediana", "$170 Grande", "$190 Extra Grande", "$210 Jumbo", " " }));
        pnlColor.add(jComboBox1);

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
        PaneldePago objPanelPagoT = new PaneldePago();
        
        objPanelPagoT.setVisible(true);
        
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        JFileChooser fc= new JFileChooser();
        fc.setDialogTitle("Buscar Imagen");
        
        if(fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
    //   File archivo = new File(fc.getSelectedFile().toString());
        
        rsscalelabel.RSScaleLabel.setScaleLabel(fotocargada,fc.getSelectedFile().toString());

        }
    }//GEN-LAST:event_btnCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JLabel fotocargada;
    private javax.swing.JLabel imgCamisa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnlColor;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlTipo;
    // End of variables declaration//GEN-END:variables
}
