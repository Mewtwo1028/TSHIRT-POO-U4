package clases;

public class Tarjeta implements java.io.Serializable{

    private String titular, numero, expiracion;
    private int cvv;

    public Tarjeta() {
    }

    public Tarjeta(String titular, String numero, String expiracion, int cvv) {
        this.titular = titular;
        this.numero = numero;
        this.expiracion = expiracion;
        this.cvv = cvv;
    }

    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(String expiracion) {
        this.expiracion = expiracion;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    

}
