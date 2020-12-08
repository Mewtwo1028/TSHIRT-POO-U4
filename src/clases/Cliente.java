package clases;

import static javax.swing.JOptionPane.*;

public class Cliente extends Persona {

    private boolean mayorista;
    private String codigo;

    public Cliente() {
        super();
        this.mayorista = false;
    }

    public Cliente(String codigo, String nombre, int edad, String correo, String direccion, boolean mayorista) {
        super(nombre, edad, correo, direccion);
        this.mayorista = mayorista;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString() + "Es mayorista: " + this.mayorista;
    }

    @Override
    public void leer() {
        super.leer();
        mayorista = showConfirmDialog(null, "Elige si es mayorista o no", "Mayorista", YES_NO_OPTION) == YES_OPTION;
    }

    @Override
    public void operar() {
        showMessageDialog(null, "operando");
    }

    public boolean isMayorista() {
        return mayorista;
    }

    public void setMayorista(boolean mayorista) {
        this.mayorista = mayorista;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    

}
