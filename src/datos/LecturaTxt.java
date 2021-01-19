/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import clases.Cuenta;
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
    public Cuenta[] obtenerCuentas() {
        java.io.FileInputStream in = null;
        Cuenta[] clientes = new Cuenta[100];
        java.io.File archivo = new java.io.File("clientes.tsp");
        if(!archivo.exists()){
            return clientes;
        }
        try {
            in = new java.io.FileInputStream(archivo);
            java.io.ObjectInputStream reader = new java.io.ObjectInputStream(in);
            clientes = (Cuenta[]) reader.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return clientes;

    }
}
