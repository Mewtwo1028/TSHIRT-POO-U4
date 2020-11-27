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
public class AdministracionAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Venta
     */
    public AdministracionAdmin() {
        initComponents();
        tpnlAdminAdmin.setFocusable(false);
    }

    public static void main(String[] args) {
        AdministracionAdmin a = new AdministracionAdmin();
        a.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpnlAdminAdmin = new javax.swing.JTabbedPane();
        pnlClientes = new ventanas.PanelClientes();
        pnlInventario = new ventanas.PanelInventario();
        pnlProductos = new ventanas.PanelProductos();
        pnlVenta = new ventanas.panelVenta();
        pnlInfoVentas = new ventanas.PanelInfoVentas();
        pnlCabecera = new javax.swing.JPanel();
        pnlOpciones = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        lblMaximizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        pnlTitulos = new javax.swing.JPanel();
        lblIcono = new javax.swing.JLabel();
        lblTitular = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(122, 108, 105));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1000, 700));

        tpnlAdminAdmin.setBackground(new java.awt.Color(0, 0, 0));
        tpnlAdminAdmin.setForeground(new java.awt.Color(200, 200, 200));
        tpnlAdminAdmin.setOpaque(true);

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        tpnlAdminAdmin.addTab("Clientes", pnlClientes);

        javax.swing.GroupLayout pnlInventarioLayout = new javax.swing.GroupLayout(pnlInventario);
        pnlInventario.setLayout(pnlInventarioLayout);
        pnlInventarioLayout.setHorizontalGroup(
            pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        pnlInventarioLayout.setVerticalGroup(
            pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        tpnlAdminAdmin.addTab("Inventario", pnlInventario);

        pnlProductos.setMinimumSize(new java.awt.Dimension(700, 500));
        pnlProductos.setPreferredSize(new java.awt.Dimension(795, 595));

        javax.swing.GroupLayout pnlProductosLayout = new javax.swing.GroupLayout(pnlProductos);
        pnlProductos.setLayout(pnlProductosLayout);
        pnlProductosLayout.setHorizontalGroup(
            pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        pnlProductosLayout.setVerticalGroup(
            pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        tpnlAdminAdmin.addTab("Productos", pnlProductos);

        pnlVenta.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        pnlVenta.setMinimumSize(new java.awt.Dimension(795, 600));
        pnlVenta.setPreferredSize(new java.awt.Dimension(795, 600));
        tpnlAdminAdmin.addTab("Ventas", pnlVenta);
        pnlVenta.getAccessibleContext().setAccessibleParent(this);

        pnlInfoVentas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        pnlInfoVentas.setMinimumSize(new java.awt.Dimension(795, 600));
        pnlInfoVentas.setPreferredSize(new java.awt.Dimension(795, 600));
        tpnlAdminAdmin.addTab("InfoVentas", pnlInfoVentas);
        pnlInfoVentas.getAccessibleContext().setAccessibleParent(this);

        getContentPane().add(tpnlAdminAdmin, java.awt.BorderLayout.CENTER);

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
        pnlTitulos.add(lblIcono, java.awt.BorderLayout.WEST);

        lblTitular.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitular.setForeground(new java.awt.Color(255, 255, 255));
        lblTitular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitular.setText("Panel de administrador");
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
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_lblMaximizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
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

    private Point puntoInicial;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblMaximizar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JPanel pnlCabecera;
    private ventanas.PanelClientes pnlClientes;
    private ventanas.PanelInfoVentas pnlInfoVentas;
    private ventanas.PanelInventario pnlInventario;
    private javax.swing.JPanel pnlOpciones;
    private ventanas.PanelProductos pnlProductos;
    private javax.swing.JPanel pnlTitulos;
    private ventanas.panelVenta pnlVenta;
    private javax.swing.JTabbedPane tpnlAdminAdmin;
    // End of variables declaration//GEN-END:variables
}
