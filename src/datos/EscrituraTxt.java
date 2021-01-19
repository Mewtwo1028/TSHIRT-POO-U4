/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import clases.Cuenta;
import clases.Producto;
import clases.Venta;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventanas.*;

/**
 *
 * @author ING-JUANMATA
 */
public class EscrituraTxt extends SignUp implements Escritura, Serializable {

    LecturaTxt lt;

    public EscrituraTxt() {
        lt = new LecturaTxt();
    }

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
    public boolean agregarCuenta(Cuenta cuenta) {
        String nArchivo = "cuentas.tsp";
        Cuenta[] cuentas = lt.obtenerCuentas();
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] == null) {
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
            for (Cuenta c : cuentas) {
                if (c != null) {
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

    @Override
    public boolean agregarProducto(Producto producto) {
        String nArchivo = "productos.tsp";
        Producto[] productos = lt.obtenerProductos();
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = producto;
                break;
            }
        }
        java.io.File aux = new java.io.File(nArchivo);
        java.io.FileOutputStream out;
        try {
            out = new java.io.FileOutputStream(aux);
            java.io.ObjectOutputStream write = new java.io.ObjectOutputStream(out);
            write.writeObject(productos);
            write.flush();
            for (Producto c : productos) {
                if (c != null) {
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

    @Override
    public boolean agregarVenta(Venta venta) {
        String nArchivo = "ventas.tsp";
        Venta[] ventas = lt.obtenerVenta();
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] == null) {
                ventas[i] = venta;
                break;
            }
        }
        java.io.File aux = new java.io.File(nArchivo);
        java.io.FileOutputStream out;
        try {
            out = new java.io.FileOutputStream(aux);
            java.io.ObjectOutputStream write = new java.io.ObjectOutputStream(out);
            write.writeObject(ventas);
            write.flush();
            for (Venta c : ventas) {
                if (c != null) {
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

    @Override
    public Cuenta[] modificarCuenta(Cuenta cuenta, int index) {
        String nArchivo = "cuentas.tsp";
        Cuenta[] cuentas = lt.obtenerCuentas();
        cuentas[index] = cuenta;
        java.io.File aux = new java.io.File(nArchivo);
        java.io.FileOutputStream out;
        try {
            out = new java.io.FileOutputStream(aux);
            java.io.ObjectOutputStream write = new java.io.ObjectOutputStream(out);
            write.writeObject(cuentas);
            write.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuentas;
    }

    @Override
    public Producto[] modificarProducto(Producto producto, int index) {
        String nArchivo = "productos.tsp";
        Producto[] productos = lt.obtenerProductos();
        productos[index] = producto;
        java.io.File aux = new java.io.File(nArchivo);
        java.io.FileOutputStream out;
        try {
            out = new java.io.FileOutputStream(aux);
            java.io.ObjectOutputStream write = new java.io.ObjectOutputStream(out);
            write.writeObject(productos);
            write.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productos;
    }

    @Override
    public Venta[] modificarVenta(Venta venta, int index) {
        String nArchivo = "ventas.tsp";
        Venta[] ventas = lt.obtenerVenta();
        ventas[index] = venta;
        java.io.File aux = new java.io.File(nArchivo);
        java.io.FileOutputStream out;
        try {
            out = new java.io.FileOutputStream(aux);
            java.io.ObjectOutputStream write = new java.io.ObjectOutputStream(out);
            write.writeObject(ventas);
            write.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EscrituraTxt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ventas;
    }

    
}
