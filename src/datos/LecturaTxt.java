/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

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
        return new java.util.ArrayList<>();
    }

}
