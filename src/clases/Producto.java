package clases;

import static javax.swing.JOptionPane.*;

public class Producto implements java.io.Serializable {

    private String talla, marca, id;
    private int precio, cantidad;

    public Producto() {
        talla = "";
        marca = "";
        id = "";
        precio = 0;
    }

    public Producto(String talla, String marca, String id, int precio, int cantidad) {
        this.talla = talla;
        this.marca = marca;
        this.id = id;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public void leer() {
        id = showInputDialog("Ingrese el ID del producto");
        talla = showInputDialog("ingrese el numero de talla: ");
        marca = showInputDialog("ingrese la marca deseada: ");
        precio = Integer.parseInt(showInputDialog("precio del producto"));

    }

    @Override
    public String toString() {
        String a = id + "\n" + talla + "\n" + marca + "\n" + precio;

        return a;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
