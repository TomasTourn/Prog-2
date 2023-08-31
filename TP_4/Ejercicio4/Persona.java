package TP_4.Ejercicio4;

import java.time.LocalDate;

public class Persona {

    private String nombre;
    private String apellido;
    private int nroPasaporte;
    private LocalDate fechaNacimiento;
    private String estado;

    public Persona(String nombre,String apellido,int nroPasaporte,LocalDate fechaNacimiento,String estado){

        if(estado.equalsIgnoreCase("viajando") || estado.equalsIgnoreCase("en pais de origen") || estado.equalsIgnoreCase("en concentracion")){
            this.nombre=nombre;
            this.apellido=apellido;
            this.nroPasaporte=nroPasaporte;
            this.fechaNacimiento=fechaNacimiento;
            this.estado=estado;
        }

    }


    public boolean estaDisponible(){
        // solo chequeo que este en su pais de origen, porque el estado es excluyente en este diseño
        return estado.equalsIgnoreCase("en pais de origen");
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

    public int getNroPasaporte() {
        return nroPasaporte;
    }

    public void setNroPasaporte(int nroPasaporte) {
        this.nroPasaporte = nroPasaporte;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
