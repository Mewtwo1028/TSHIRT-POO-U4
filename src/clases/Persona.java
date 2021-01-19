package clases;

import static javax.swing.JOptionPane.*;

public abstract class Persona implements java.io.Serializable{

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

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + ", direccion=" + direccion
                + ", tipo=" + tipo + '}';
    }

    public abstract void operar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
