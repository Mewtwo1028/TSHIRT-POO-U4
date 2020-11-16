package clases;

import static javax.swing.JOptionPane.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Recibo {
  private Calendar fecha;
  private String folio;
  private Cliente cliente;

  public Recibo() {
    fecha = new GregorianCalendar();
    folio = "";
    cliente = new Cliente();
  }

  public Recibo(Calendar fecha, String folio, Cliente cliente) {
    this.fecha = fecha;
    this.folio = folio;
    this.cliente = cliente;
  }

  public void leer() {
    String en, datosF[], datosH[];
    en = showInputDialog(null, "Fecha en formato YYYY/MM/DD");
    datosF = en.split("/");
    en = showInputDialog(null, "Hora en formato hh:mm");
    datosH = en.split(":");
    fecha = new GregorianCalendar(Integer.parseInt(datosF[0]), Integer.parseInt(datosF[1]), Integer.parseInt(datosF[2]),
        Integer.parseInt(datosH[0]), Integer.parseInt(datosH[1]));
    folio = showInputDialog(null, "Folio:");
    cliente.leer();
  }

  public String toString() {
    return "Recibo" + "\n\n" + "Fecha: " + fecha.get(Calendar.YEAR) + "/" + fecha.get(Calendar.MONTH) + "/"
        + fecha.get(Calendar.DAY_OF_MONTH) + " - " + fecha.get(Calendar.HOUR_OF_DAY) + ":" + fecha.get(Calendar.MINUTE)
        + " Folio: " + folio + "\n" + cliente.toString();
  }

  public static void main(String[] args) {
    Recibo nota = new Recibo();
    nota.leer();
    showMessageDialog(null, nota);
  }
}