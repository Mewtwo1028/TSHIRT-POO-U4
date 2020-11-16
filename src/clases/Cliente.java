package clases;

import static javax.swing.JOptionPane.*;

public class Cliente extends Persona {

  private boolean mayorista;

  public Cliente() {
    super();
    this.mayorista = false;
  }

  public Cliente(String nombre, int edad, String correo, String direccion, boolean mayorista) {
    super(nombre, edad, correo, direccion);
    this.mayorista = mayorista;
  }

  @Override
  public String toString() {
    return super.toString() + "Es mayorista: " + this.mayorista;
  }

  public void leer() {
    super.leer();
    mayorista = showConfirmDialog(null, "Elige si es mayorista o no", "Mayorista", YES_NO_OPTION) == YES_OPTION;
  }

  public void operar() {
    showMessageDialog(null, "operando");
  }
}