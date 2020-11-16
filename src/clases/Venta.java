package clases;

import static javax.swing.JOptionPane.*;

public class Venta {

    protected int importe;
    private Producto productos;
    private Garantia garantia;

    public Venta() {
        importe = 0;
    }

    public Venta(int importe) // Builder
    {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Producto: " + productos + ", Garantia: " + garantia + ", Importe: " + importe;
    }

    public void leer() {
        importe = Integer.parseInt(showInputDialog("Ingrese el importe: "));
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public Producto getProductos() {
        return productos;
    }

    public void setProductos(Producto productos) {
        this.productos = productos;
    }

    public Garantia getGarantia() {
        return garantia;
    }

    public void setGarantia(Garantia garantia) {
        this.garantia = garantia;
    }

}
