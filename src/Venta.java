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

  public String toString() {
    return "Producto: " + productos + ", Garantia: " + garantia + ", Importe: " + importe;
  }

  public void leer() {
    importe = Integer.parseInt(showInputDialog("Ingrese el importe: "));
  }
}
