package TP_4.Ejercicio4;

import java.time.LocalDate;

public class Masajista extends Persona {

    private String titulo;
    private int aniosExperiencia;

    public Masajista(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento, String estado,String titulo,int aniosExperiencia){
        super(nombre,apellido,nroPasaporte,fechaNacimiento,estado);
        this.titulo=titulo;
        this.aniosExperiencia=aniosExperiencia;
    }

}
