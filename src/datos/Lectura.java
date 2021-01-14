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
public interface Lectura {
    public boolean inicioSesion(String nick, String pass);
    
    public java.util.ArrayList<clases.Cliente> obtenerClientes();
}
