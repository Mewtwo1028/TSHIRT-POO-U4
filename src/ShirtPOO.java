import static javax.swing.JOptionPane.*;

public class ShirtPOO {
  private String nombre, direccion;

  public ShirtPOO() {
    nombre = "T-Shirt POO";
    direccion = "Enrique Segoviano #21";
  }

  public ShirtPOO(String nombre, String direccion) {
    this.nombre = nombre;
    this.direccion = direccion;
  }

  public String toString() {
    return "Nombre: " + "\n" + nombre + "\n" + "Direccion: " + "\n" + direccion;
  }

  public static void main(String[] args) {
    ShirtPOO empresa = new ShirtPOO();
    showMessageDialog(null, empresa);

  }
}
