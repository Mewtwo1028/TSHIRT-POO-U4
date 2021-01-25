package clases;

import java.util.Calendar;
import static javax.swing.JOptionPane.*;

public class Venta implements java.io.Serializable {

    protected int importe;
    private Producto producto;
    private Calendar fecha;
    private int folio;
    public static int ultFolio = 0;
    private Cliente cliente;

    public Venta() {
        importe = 0;
        fecha = new java.util.GregorianCalendar();
    }

    public Venta(int importe, Cliente cliente, Producto producto) // Builder
    {
        this.importe = importe;
        this.fecha = new java.util.GregorianCalendar();
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Producto: " + producto + ", Importe: " + importe;
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getFecha() {
        return fecha.get(Calendar.DATE) + "/" + (1 + fecha.get(Calendar.MONTH)) + "/" + fecha.get(Calendar.YEAR);
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
