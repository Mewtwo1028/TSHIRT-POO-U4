package clases;

import java.util.Calendar;
import java.util.GregorianCalendar;
import static javax.swing.JOptionPane.*;

public class Garantia {

    private String poliza, cobertura;
    private Calendar fechaExpidicion, fechaExpiracion;
    private float valor;
    private boolean extendido;

    public Garantia() {
        this.poliza = "";
        this.cobertura = "";
        this.fechaExpidicion = new GregorianCalendar();
        this.fechaExpiracion = new GregorianCalendar(fechaExpidicion.get(Calendar.DAY_OF_MONTH),
                fechaExpidicion.get(Calendar.MONTH), fechaExpidicion.get(Calendar.YEAR) + 1);
        this.extendido = false;
        this.valor = 0;
    }

    public Garantia(String poliza, String cobertura, GregorianCalendar fechaExpidicion, GregorianCalendar fechaExpiracion,
            boolean extendido, float valor) {
        this.poliza = poliza;
        this.cobertura = cobertura;
        this.fechaExpidicion = fechaExpidicion;
        this.fechaExpiracion = fechaExpiracion;
        this.extendido = extendido;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return poliza + " " + cobertura + "\n" + fechaExpidicion.get(Calendar.DAY_OF_MONTH) + "/"
                + fechaExpidicion.get(Calendar.MONTH) + "/" + fechaExpidicion.get(Calendar.YEAR) + " - "
                + fechaExpiracion.get(Calendar.DAY_OF_MONTH) + "/" + fechaExpiracion.get(Calendar.MONTH) + "/"
                + fechaExpiracion.get(Calendar.YEAR) + "\n" + "Extendido: " + extendido;
    }

    public void leer() {
        String fecha, datos[];
        this.poliza = showInputDialog(null, "Ingrese la poliza");
        this.cobertura = showInputDialog(null, "Ingrese la cobertura");
        this.valor = Float.valueOf(showInputDialog(null, "Ingrese el valor de la cobertura"));
        this.extendido = showConfirmDialog(null, "Su seguro sera extendido?", "Extendido", YES_NO_OPTION) == YES_OPTION;
        fecha = showInputDialog(null, "Ingrese la fecha de expedicion de la manera YYYY/MM/DD");
        datos = fecha.split("/");
        this.fechaExpidicion = new GregorianCalendar(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]),
                Integer.parseInt(datos[2]));
        fecha = showInputDialog(null, "Ingrese la fecha de expiracion de la manera YYYY/MM/DD");
        datos = fecha.split("/");
        this.fechaExpiracion = new GregorianCalendar(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]),
                Integer.parseInt(datos[2]));
    }

    public boolean cobrada(float costo) {
        return costo > this.valor;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public Calendar getFechaExpidicion() {
        return fechaExpidicion;
    }

    public void setFechaExpidicion(GregorianCalendar fechaExpidicion) {
        this.fechaExpidicion = fechaExpidicion;
    }

    public Calendar getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(GregorianCalendar fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isExtendido() {
        return extendido;
    }

    public void setExtendido(boolean extendido) {
        this.extendido = extendido;
    }
}
