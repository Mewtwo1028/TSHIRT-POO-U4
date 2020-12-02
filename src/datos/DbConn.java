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
public interface DbConn {
    
    public void getConn();
    
    public boolean openConn();
    
    public void closeConn();
}
