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

    public clases.Cuenta[] obtenerCuentas();

    public clases.Producto[] obtenerProductos();

    public clases.Venta[] obtenerVenta();
}
