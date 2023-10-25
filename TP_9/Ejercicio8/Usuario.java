package TP_9.Ejercicio8;

public class Usuario {

    private String nombreUsuario;
    private int anioRegistro;
    private String mail;

    public Usuario(String nombreUsuario, int anioRegistro, String mail) {
        this.nombreUsuario = nombreUsuario;
        this.anioRegistro = anioRegistro;
        this.mail = mail;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getAnioRegistro() {
        return anioRegistro;
    }

    public void setAnioRegistro(int anioRegistro) {
        this.anioRegistro = anioRegistro;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
