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

    public boolean agregarCuenta(clases.Cuenta cuenta);

    public boolean agregarProducto(clases.Producto producto);

    public boolean agregarVenta(clases.Venta venta, clases.Producto producto);

    public clases.Cuenta[] modificarCuenta(clases.Cuenta cuenta, int index);

    public clases.Producto[] modificarProducto(clases.Producto producto, String id);

    public clases.Venta[] modificarVenta(clases.Venta venta, int folio);

}
