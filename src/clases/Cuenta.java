package clases;

import static javax.swing.JOptionPane.*;

public class Cuenta {

    private String nickName, contrasena;
    private Cliente usuario;

    public Cuenta() {
        nickName = "";
        contrasena = "";
        usuario = new Cliente();
    }

    public Cuenta(String nickName, String contrasena, Cliente usuario) {
        this.nickName = nickName;
        this.contrasena = contrasena;
        this.usuario = usuario;
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

}
