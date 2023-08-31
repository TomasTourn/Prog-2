package TP_4.Ejercicio4;

import java.time.LocalDate;

public class Futbolista extends Persona{

    private String posicion;
    private boolean esZurdo;
    private int golesConvertidos;


    public Futbolista(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento,String estado,String posicion,boolean esZurdo,int golesConvertidos){
        super(nombre, apellido, nroPasaporte, fechaNacimiento, estado);
        this.posicion=posicion;
        this.esZurdo=esZurdo;
        this.golesConvertidos=golesConvertidos;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isEsZurdo() {
        return esZurdo;
    }

    public void setEsZurdo(boolean esZurdo) {
        this.esZurdo = esZurdo;
    }

    public int getGolesConvertidos() {
        return golesConvertidos;
    }

    public void setGolesConvertidos(int golesConvertidos) {
        this.golesConvertidos = golesConvertidos;
    }
}
