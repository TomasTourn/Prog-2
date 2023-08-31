package TP_4.Ejercicio6;

import java.time.LocalDate;

public class Persona {


    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int edad;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaNacimiento=fechaNacimiento;
    }


    public String toString(){
        return "Nombre: "+nombre+"\napellido: "+apellido+"\nedad: "+getEdad();
    }
    public int getEdad(){
        return LocalDate.now().getYear()-fechaNacimiento.getYear();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
