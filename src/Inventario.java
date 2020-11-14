import static javax.swing.JOptionPane.*;

public class Inventario {

  private String idCajon, producto;
  private int cantidad;

  public Inventario() {
    this.idCajon = "";
    this.producto = "";
    this.cantidad = 0;
  }

  public Inventario(String idCajon, String producto, int cantidad) {
    this.idCajon = idCajon;
    this.producto = producto;
    this.cantidad = cantidad;
  }

  public void leer() {
    idCajon = showInputDialog("Dame el id del cajon");
    producto = showInputDialog("Dame el nombre del producto");
    cantidad = Integer.parseInt(showInputDialog("Cantidad del producto"));
  }

  @Override
  public String toString() {
    return idCajon + " - " + producto + " - " + cantidad;
  }
}