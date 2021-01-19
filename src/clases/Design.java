package clases;

import static javax.swing.JOptionPane.*;

public class Design implements java.io.Serializable {

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

    @Override
    public String toString() {
        return "Color: " + "\n" + color + "\n" + "Logo: " + "\n" + m + "\n" + "Tipo: " + "\n" + tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public boolean isLogo() {
        return logo;
    }

    public void setLogo(boolean logo) {
        this.logo = logo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
