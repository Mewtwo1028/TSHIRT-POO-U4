package clases;

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

    @Override
    public String toString() {
        return "Nombre: " + "\n" + nombre + "\n" + "Direccion: " + "\n" + direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
