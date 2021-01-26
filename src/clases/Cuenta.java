package clases;

import static javax.swing.JOptionPane.*;
public class Cuenta implements java.io.Serializable {

    private String nickName, contrasena;
    private Cliente usuario;
    private int tipo;
    private Tarjeta tarjeta;

    public static final int ADMINISTRADOR = 0, CLIENTE = 1;

    public Cuenta() {
        nickName = "";
        contrasena = "";
        usuario = new Cliente();
        this.tipo = CLIENTE;
    }

    public Cuenta(String nickName, String contrasena, Cliente usuario) {
        this.nickName = nickName;
        this.contrasena = contrasena;
        this.usuario = usuario;
    }

    public Cuenta(String nickName, String contrasena, Cliente usuario, int tipo) {
        this.nickName = nickName;
        this.contrasena = contrasena;
        this.usuario = usuario;
        this.tipo = tipo;
    }

    public Cuenta(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void leer() {
        nickName = showInputDialog("Ingresa tu nombre");
        contrasena = showInputDialog("Ingresa tu password");
        usuario.leer();
    }

    @Override
    public String toString() {
        String a = nickName + "\n" + contrasena + "\n" + usuario;

        return a;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

       
}
