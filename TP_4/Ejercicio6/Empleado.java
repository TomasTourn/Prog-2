package TP_4.Ejercicio6;

import java.time.LocalDate;

public class Empleado extends Persona {


    private int nroLegajo;
    private double sueldo;

    public Empleado(String nombre, String apellido, LocalDate fechaNacimiento, int nroLegajo, double sueldo) {
        super(nombre, apellido, fechaNacimiento);
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
    }


    @Override
    public String toString(){
        return super.toString()+ "\nNumero de Legajo: "+ nroLegajo+"\nsueldo: "+sueldo;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
