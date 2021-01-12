/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ING-JUANMATA
 */
public class LecturaTxt implements Lectura {

    @Override
    public boolean inicioSesion(String nick, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public java.util.ArrayList<clases.Cliente> obtenerClientes() {
        java.io.File archivo = new java.io.File("clientes.tsp");
        java.util.ArrayList<clases.Cliente> clientes = new java.util.ArrayList<>();
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            java.io.FileInputStream fis = null;
            try {
                fis = new java.io.FileInputStream(archivo);
                java.io.DataInputStream in = new java.io.DataInputStream(fis);
                while(in.available() > 0){
                    clientes.add(new clases.Cliente(in.readUTF(), in.readUTF(), in.readInt(), in.readUTF(), in.readUTF(), in.readBoolean()));
                    in.readUTF();//Nick cuenta
                    in.readUTF();//Pass cuenta
                    in.readInt();//Tipo cuenta
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return clientes;
    }

}
