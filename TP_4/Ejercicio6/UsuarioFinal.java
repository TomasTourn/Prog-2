package TP_4.Ejercicio6;

import java.time.LocalDate;

public class UsuarioFinal extends Persona{

    private String nombreUsuario;
    private String password;
    public UsuarioFinal(String nombre, String apellido, LocalDate fechaNacimiento, String nombreUsuario,String password){
        super(nombre, apellido, fechaNacimiento);
        this.nombreUsuario=nombreUsuario;
        this.password=password;
    }

    @Override
    public String toString(){
        return super.toString()+ "\nNombre de Usuario: "+ nombreUsuario+"\npassword: "+password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
