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
public class AdministracionAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Venta
     */
    public AdministracionAdmin() {
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

        tpnlAdministracion = new javax.swing.JTabbedPane();
        panelClientes1 = new ventanas.PanelClientes();
        panelInfoVentas1 = new ventanas.PanelInfoVentas();
        panelInventario1 = new ventanas.PanelInventario();
        panelProductos1 = new ventanas.PanelProductos();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout panelClientes1Layout = new javax.swing.GroupLayout(panelClientes1);
        panelClientes1.setLayout(panelClientes1Layout);
        panelClientes1Layout.setHorizontalGroup(
            panelClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        panelClientes1Layout.setVerticalGroup(
            panelClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        tpnlAdministracion.addTab("Clientes", panelClientes1);

        javax.swing.GroupLayout panelInfoVentas1Layout = new javax.swing.GroupLayout(panelInfoVentas1);
        panelInfoVentas1.setLayout(panelInfoVentas1Layout);
        panelInfoVentas1Layout.setHorizontalGroup(
            panelInfoVentas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        panelInfoVentas1Layout.setVerticalGroup(
            panelInfoVentas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        tpnlAdministracion.addTab("InfoVentas", panelInfoVentas1);

        javax.swing.GroupLayout panelInventario1Layout = new javax.swing.GroupLayout(panelInventario1);
        panelInventario1.setLayout(panelInventario1Layout);
        panelInventario1Layout.setHorizontalGroup(
            panelInventario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        panelInventario1Layout.setVerticalGroup(
            panelInventario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        tpnlAdministracion.addTab("Inventario", panelInventario1);

        panelProductos1.setMinimumSize(new java.awt.Dimension(700, 500));
        panelProductos1.setPreferredSize(new java.awt.Dimension(795, 595));

        javax.swing.GroupLayout panelProductos1Layout = new javax.swing.GroupLayout(panelProductos1);
        panelProductos1.setLayout(panelProductos1Layout);
        panelProductos1Layout.setHorizontalGroup(
            panelProductos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        panelProductos1Layout.setVerticalGroup(
            panelProductos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        tpnlAdministracion.addTab("Productos", panelProductos1);

        getContentPane().add(tpnlAdministracion, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AdministracionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministracionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministracionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministracionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdministracionAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ventanas.PanelClientes panelClientes1;
    private ventanas.PanelInfoVentas panelInfoVentas1;
    private ventanas.PanelInventario panelInventario1;
    private ventanas.PanelProductos panelProductos1;
    private javax.swing.JTabbedPane tpnlAdministracion;
    // End of variables declaration//GEN-END:variables
}
