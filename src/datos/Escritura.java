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
public interface Escritura {

    public boolean agregarCliente(clases.Cuenta cuenta);

    public boolean agregarProducto(clases.Producto producto);

    public boolean agregarVenta(clases.Venta venta);
}
