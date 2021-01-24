/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import clases.Cuenta;
import clases.Producto;
import clases.Venta;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ING-JUANMATA
 */
public class LecturaTxt implements Lectura {

    @Override
    public Cuenta[] obtenerCuentas() {
        java.io.FileInputStream in = null;
        Cuenta[] clientes = new Cuenta[100];
        java.io.File archivo = new java.io.File("cuentas.tsp");
        if (!archivo.exists()) {
            return clientes;
        }
        try {
            in = new java.io.FileInputStream(archivo);
            java.io.ObjectInputStream reader = new java.io.ObjectInputStream(in);
            clientes = (Cuenta[]) reader.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return clientes;

    }

    @Override
    public Producto[] obtenerProductos() {
        java.io.FileInputStream in = null;
        Producto[] productos = new Producto[100];
        java.io.File archivo = new java.io.File("productos.tsp");
        if (!archivo.exists()) {
            return productos;
        }
        try {
            in = new java.io.FileInputStream(archivo);
            java.io.ObjectInputStream reader = new java.io.ObjectInputStream(in);
            productos = (Producto[]) reader.readObject();
            in.close();
            if (Producto.ultId.equals("")) {
                int ult = 0;
                for (Producto p : productos) {
                    try {
                        if (Integer.parseInt(p.getId()) > ult) {
                            ult = Integer.parseInt(p.getId());
                        }
                    } catch (NullPointerException e) {
                        break;
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return productos;
    }

    @Override
    public Venta[] obtenerVenta() {
        java.io.FileInputStream in = null;
        Venta[] ventas = new Venta[100];
        java.io.File archivo = new java.io.File("ventas.tsp");
        if (!archivo.exists()) {
            return ventas;
        }
        try {
            in = new java.io.FileInputStream(archivo);
            java.io.ObjectInputStream reader = new java.io.ObjectInputStream(in);
            ventas = (Venta[]) reader.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(LecturaTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ventas;
    }
}
