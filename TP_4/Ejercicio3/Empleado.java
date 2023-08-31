package TP_4.Ejercicio3;

public class Empleado {

    private String nombre;
    private int legajo;
    private double sueldo;

    public Empleado(String nombre,int legajo,double sueldo){
        this.nombre=nombre;
        this.legajo=legajo;
        this.sueldo=sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldoFijo(double sueldo) {
        this.sueldo = sueldo;
    }
}
