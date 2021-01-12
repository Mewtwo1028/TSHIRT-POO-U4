/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import clases.Cliente;
import clases.Cuenta;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ING-JUANMATA
 */
public class EscrituraTxt implements Escritura {

    /**
     * Funcion encargada de agregar clientes al archivo general para los
     * clientes llamado 'clientes.tsp'
     *
     * @param cliente Este objeto debe tener todos los datos necesarios para
     * registrar al cliente en cuestion
     * @param cuenta Este objeto tiene consigo los datos de la cuenta que
     * respecta al cliente, se respeta la regla de 1 cuenta para un cliente
     * @return Verdadero en caso de que el registro se haya llevado
     * correctamente o un Falso en caso contrario
     */
    @Override
    public boolean agregarCliente(Cliente cliente, Cuenta cuenta) {
        java.io.File archivo = new java.io.File("clientes.tsp");
        if (!archivo.exists()) {
            java.io.FileOutputStream fos = null;
            try {
                fos = new java.io.FileOutputStream(archivo);
                java.io.DataOutputStream out = new java.io.DataOutputStream(fos);
                out.writeUTF(cliente.getCodigo());
                out.writeUTF(cliente.getNombre());
                out.writeInt(cliente.getEdad());
                out.writeUTF(cliente.getCorreo());
                out.writeUTF(cliente.getDireccion());
                out.writeBoolean(cliente.isMayorista());
                out.writeUTF(cuenta.getNickName());
                out.writeUTF(cuenta.getContrasena());
                out.writeInt(cuenta.getTipo());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            } catch (IOException ex) {
                Logger.getLogger(EscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            } finally {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(EscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return true;
    }

}
