/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import clases.Cuenta;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventanas.*;

/**
 *
 * @author ING-JUANMATA
 */
public class EscrituraTxt extends SignUp implements Escritura, Serializable {

    /**
     * Funcion encargada de agregar clientes al archivo general para los
     * clientes llamado 'clientes.tsp'
     *
     * @param cuenta Este objeto tiene consigo los datos de la cuenta que
     * respecta al cliente, se respeta la regla de 1 cuenta para un cliente
     * @return Verdadero en caso de que el registro se haya llevado
     * correctamente o un Falso en caso contrario
     */
    @Override
    public boolean agregarCliente(Cuenta cuenta) {
        String nArchivo = "clientes.tsp";
        LecturaTxt lt = new LecturaTxt();
        Cuenta[] cuentas = lt.obtenerCuentas();
        for(int i = 0; i < cuentas.length; i++){
            if(cuentas[i] == null){
                cuentas[i] = cuenta;
                break;
            }
        }
        java.io.File aux = new java.io.File(nArchivo);
        java.io.FileOutputStream out;
        try {
            out = new java.io.FileOutputStream(aux);
            java.io.ObjectOutputStream write = new java.io.ObjectOutputStream(out);
            write.writeObject(cuentas);
            write.flush();
            for(Cuenta c: cuentas){
                if(c != null){
                    System.out.println(c);
                }
            }
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
}
