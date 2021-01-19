package clases;

import static javax.swing.JOptionPane.*;

public class Producto implements java.io.Serializable{

    private String talla, marca, id, tipo;
    private int precio;

    public Producto() {
        talla = "";
        marca = "";
        id = "";
        tipo = "";
        precio = 0;
    }

    public Producto(String talla, String marca, String id, String tipo, int precio) {
        this.talla = talla;
        this.marca = marca;
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;

    }

    public void leer() {
        id = showInputDialog("Ingrese el ID del producto");
        talla = showInputDialog("ingrese el numero de talla: ");
        marca = showInputDialog("ingrese la marca deseada: ");
        tipo = showInputDialog("ingrese el tipo de playera deseada: ");
        precio = Integer.parseInt(showInputDialog("precio del producto"));

    }

    @Override
    public String toString() {
        String a = id + "\n" + talla + "\n" + marca + "\n" + tipo + "\n" + precio;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
