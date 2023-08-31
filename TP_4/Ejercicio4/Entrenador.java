package TP_4.Ejercicio4;

import java.time.LocalDate;

public class Entrenador extends Persona {

    private String federacion;

    public Entrenador(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento, String estado,String federacion){
        super(nombre,apellido,nroPasaporte,fechaNacimiento,estado);
        this.federacion=federacion;
    }


    public String getFederacion() {
        return federacion;
    }

    public void setFederacion(String federacion) {
        this.federacion = federacion;
    }
}
