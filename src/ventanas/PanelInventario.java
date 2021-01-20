/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import excepciones.ExVacio;
import java.awt.HeadlessException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hydra
 */
public class PanelInventario extends javax.swing.JPanel {
    
    /**
     * Creates new form PanelInventario
     */
    public PanelInventario() {
        
        initComponents();
        m=(DefaultTableModel) tblInventario.getModel();
        m.addColumn("ID");
        m.addColumn("Nombre");
        m.addColumn("Descripcion");
        m.addColumn("Cantidad");
        m.addColumn("Fecha");
        
        
       
        
       
  
        
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

        jSeparator1 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        cmbOrdenar = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnLeer = new javax.swing.JButton();

        setBackground(new java.awt.Color(122, 108, 105));
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());

        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 10, 0, 22);
        add(btnAgregar, gridBagConstraints);

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        add(btnBorrar, gridBagConstraints);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        add(btnLimpiar, gridBagConstraints);

        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblInventario);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 264;
        gridBagConstraints.ipady = 237;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(16, 10, 20, 0);
        add(jScrollPane1, gridBagConstraints);

        cmbOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar", "A-Z", "Z-A", "Fecha" }));
        cmbOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrdenarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        add(cmbOrdenar, gridBagConstraints);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 22);
        add(btnGuardar, gridBagConstraints);

        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        add(btnLeer, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            contenido();
        } catch (Exception ex) {
            Logger.getLogger(PanelInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void contenido() throws IOException, Exception{
        
        Calendar fecha = new GregorianCalendar();
        int dia = fecha.get(Calendar.DATE); 
        int mes = fecha.get(Calendar.MONTH);
        int ano = fecha.get(Calendar.YEAR);
        
        info[0]=showInputDialog(this, "ID");
        info[1]=showInputDialog(this, "Producto");
        info[2]=showInputDialog(this, "Descripcion");
        info[3]=showInputDialog(this, "Cantidad");
        info[4]=dia+"/"+mes+"/"+ano;
        
        if(info.equals("")){
            throw new IllegalArgumentException("entrada nula"); 
        }
        for(int i=0; i<4; i++){
            if(info[i].equals("")){
                showMessageDialog(this,"Entrada vacia, vuelve a rellenar los datos");
                m.removeRow(1);
            }
        }   
        
        
        
        m.addRow(info); 
 
        
        
    }
    
    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        
        int fila=tblInventario.getSelectedRow();
        if(fila>=0){
            m.removeRow(fila);
        }else{
            showMessageDialog(this,"La tabla esta vacia o no se encuentran datos seleccionados");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
       int fila= tblInventario.getRowCount();
       
       for(int i=fila-1; i>=0; i--){
           m.removeRow(i);
       }
       if(fila==0){
           showMessageDialog(this,"La tabla esta vacia o no se encuentran datos seleccionados");
       }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cmbOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrdenarActionPerformed
        String ob=cmbOrdenar.getSelectedItem().toString();
        if(ob.equals("A-Z")){
            
        }
        if(ob.equals("Z-A")){
            
        }
        if(ob.equals("Fecha")){
            
        }
    }//GEN-LAST:event_cmbOrdenarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
          java.io.FileOutputStream fbs;
        try {
            fbs = new java.io.FileOutputStream("inventario.txt");
             java.io.DataOutputStream fds=new java.io.DataOutputStream(fbs);
             
             for (int i = 0 ; i < tblInventario.getRowCount(); i++) //realiza un barrido por filas.
            {
                for(int j = 0 ; j < tblInventario.getColumnCount();j++) //realiza un barrido por columnas.
                {
                fds.writeBytes((String) tblInventario.getValueAt(i, j));   
                    if (j < tblInventario.getColumnCount() -1) { //agrega separador "," si no es el ultimo elemento de la fila.
                        fds.writeBytes("\n");
                    }
                   
               }
                 fds.writeBytes("\n");
              }
             
             
             
             
             fds.close();
             showMessageDialog(this,"Archivo Guardado");
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PanelInventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PanelInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        
        try {
            java.io.FileInputStream fbe=new java.io.FileInputStream("inventario.txt");
            java.io.DataInputStream fde=new java.io.DataInputStream(fbe);
            
            int i=0;
            //do{
            while((A=fde.readLine())!=null){
                
            in[i]=A;
            
            i++;
                if(i==5){
                    m.addRow(in);
                   i=0;
                }
                
            }
            
            
            
            //i=0;
            //}while(x==0);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PanelInventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PanelInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_btnLeerActionPerformed
    
   int x=1;
   String A=""; 
   String in[] = new String [100000];
   String info[] = new String [5];
    private DefaultTableModel m;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbOrdenar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblInventario;
    // End of variables declaration//GEN-END:variables
}
