package clases;

import static javax.swing.JOptionPane.*;

public class Designer extends Persona implements java.io.Serializable {

    protected int salario;

    public Designer() {
        super();
        salario = 0;
    }

    public Designer(String nombre, int edad, String correo, String direccion, int salario) // Builder
    {
        super(nombre, edad, correo, direccion);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + " Salario: " + salario;
    }

    @Override
    public void leer() {
        super.leer();
        salario = Integer.parseInt(showInputDialog("Ingrese el salario: "));
    }

    @Override
    public void operar() {
        System.out.print("Estoy operando xdxd");
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
