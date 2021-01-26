package clases;

import java.util.Calendar;
import static javax.swing.JOptionPane.*;

public class Venta implements java.io.Serializable {

    protected int total;
    private Producto producto;
    private Calendar fecha;
    private Cliente cliente;

    public Venta() {
        total = 0;
        fecha = new java.util.GregorianCalendar();
    }

    public Venta(int total, Cliente cliente, Producto producto) // Builder
    {
        this.total = total;
        this.fecha = new java.util.GregorianCalendar();
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Producto: " + producto + ", Total: " + total;
    }

    public void leer() {
        total = Integer.parseInt(showInputDialog("Ingrese el total: "));
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
