/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import clases.Cliente;
import clases.Cuenta;
import java.io.*;

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
    
        
        /*File  registro = new File ("clientes.tsp");
        if (registro.)
        {
            
        }*/
    
    
    @Override
    public boolean agregarCliente(Cuenta cuenta) {
        return true;
    }

}
