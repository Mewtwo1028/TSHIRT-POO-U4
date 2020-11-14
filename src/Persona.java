import static javax.swing.JOptionPane.*;

public abstract class Persona {
  protected String nombre;
  protected int edad;
  protected String correo;
  protected String direccion;
  protected String tipo;

  public Persona() {
    nombre = "Osmar";
    edad = 19;
    correo = "gfg";
    direccion = "";
    tipo = "";
    correo = "******@ittepic.edu.mx";
    direccion = "**** no. 10";
  }

  public Persona(String nombre, int edad, String correo, String direccion) // Builder
  {
    this.nombre = nombre;
    this.edad = edad;
    this.correo = correo;
    this.direccion = direccion;
  }

  public void leer() {
    nombre = showInputDialog("Ingrese el nombre: ");
    edad = Integer.parseInt(showInputDialog("Ingrese la edad: "));
    direccion = showInputDialog("Ingrese la direccion: ");
    correo = showInputDialog("Ingrese el correo: ");
  }

  public String toString() {
    return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + ", direccion=" + direccion
        + ", tipo=" + tipo + '}';
  }

  public abstract void operar();
}
