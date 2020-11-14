import static javax.swing.JOptionPane.*;

public class MedioPago {
  private String tipoPago;

  public MedioPago() {
    tipoPago = "";
  }

  public MedioPago(String tipoPago) {
    this.tipoPago = tipoPago;
  }

  public void leer() {
    tipoPago = showInputDialog("De que manera desea pagar");
  }

  public String toString() {
    String t = tipoPago + "\n";

    return t;
  }

}