package clases;

import static javax.swing.JOptionPane.*;

public class Producto implements java.io.Serializable {

    private String talla, nombre;
    private int precio;

    public Producto() {
        talla = "";
        nombre = "";
        precio = 0;
    }

    public Producto(String talla, String nombre, int precio){
        this.talla = talla;
        this.nombre = nombre;
        this.precio = precio;

    }

    public void leer() {
        talla = showInputDialog("ingrese el numero de talla: ");
        nombre = showInputDialog("ingrese el nombre deseado: ");
        precio = Integer.parseInt(showInputDialog("precio del producto"));

    }

    @Override
    public String toString() {
        String a = talla + "\n" + nombre + "\n" + precio;

        return a;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
