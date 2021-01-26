package clases;

import static javax.swing.JOptionPane.*;

public class Inventario implements java.io.Serializable {

    private String idCajon;
    private int cantidad,fecha;

    public Inventario() {
        this.idCajon = "";
        this.fecha = 0;
        this.cantidad = 0;
    }

    public Inventario(String idCajon, int fecha, int cantidad) {
        this.idCajon = idCajon;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public void leer() {
        idCajon = showInputDialog("Dame el id del cajon");
        cantidad = Integer.parseInt(showInputDialog("Cantidad del producto"));
    }

    @Override
    public String toString() {
        return idCajon + " - " + cantidad + " - " + fecha;
    }

    public String getIdCajon() {
        return idCajon;
    }

    public void setIdCajon(String idCajon) {
        this.idCajon = idCajon;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
     public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

}
