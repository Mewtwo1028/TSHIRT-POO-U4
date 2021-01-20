/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author codeboy1028
 */
public class ExNoEsNumero extends Exception {
    public ExNoEsNumero(String mensaje){
        super(mensaje);
    }
    
    private static boolean isNumeric(String cadena){
        try {
                Integer.parseInt(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }
    }
        
}
