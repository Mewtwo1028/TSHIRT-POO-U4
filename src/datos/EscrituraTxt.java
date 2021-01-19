/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import clases.Cliente;
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
     * @param cliente Este objeto debe tener todos los datos necesarios para
     * registrar al cliente en cuestion
     * @param cuenta Este objeto tiene consigo los datos de la cuenta que
     * respecta al cliente, se respeta la regla de 1 cuenta para un cliente
     * @return Verdadero en caso de que el registro se haya llevado
     * correctamente o un Falso en caso contrario
     */
    
       
            String nArchivo = "clientes.tsp";
            
            
            
                Cuenta c = new Cuenta();
                try
                {
                FileOutputStream os = null;
        try {
            os = new FileOutputStream(nArchivo);
                    try (ObjectOutputStream oos = new ObjectOutputStream(os)) {
                        oos.writeObject(c);
                        os.close();
                    }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
        }       catch (IOException ex) {
                    System.out.print ("a");
                    Logger.getLogger(EscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
            try {
                os.close();
            } catch (IOException ex) {
                System.out.print ("a");
                Logger.getLogger(EscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                } catch(FileNotFoundException e)
                {
                    System.out.print ("a");
                } catch (IOException e)
                {
                 System.out.print ("a");
                }
            }
            
            
    
    
    @Override
    public boolean agregarCliente(Cuenta cuenta) {
        return true;
    }

}
