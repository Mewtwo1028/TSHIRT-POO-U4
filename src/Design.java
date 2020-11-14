import static javax.swing.JOptionPane.*;

public class Design {
  private String color, m;
  private boolean logo;
  private int tipo;

  public Design() {
    color = "";
    logo = true;
    tipo = 0;
  }

  public Design(String color, boolean logo, int tipo) {
    this.color = color;
    this.logo = logo;
    this.tipo = tipo;
  }

  public void leer() {
    color = showInputDialog(null, "Color:");
    int n = showConfirmDialog(null, "Desea Colocar un logo", "", YES_NO_OPTION);
    if (n == 0) {
      logo = true;
      m = "Con Logo";
    } else {
      logo = false;
      m = "Sin Logo";
    }
    tipo = Integer.parseInt(showInputDialog(null, "Tipo"));
  }

  public String toString() {
    return "Color: " + "\n" + color + "\n" + "Logo: " + "\n" + m + "\n" + "Tipo: " + "\n" + tipo;
  }

  public static void main(String[] args) {
    Design diseno = new Design();
    diseno.leer();
    showMessageDialog(null, diseno);

  }
}