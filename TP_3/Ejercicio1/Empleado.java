package TP_3.Ejercicio1;

public class Empleado {

    private int idEmpleado;
    private String nombre;
    private int encuestasRealizadas;

    public Empleado(int idEmpleado,String  nombre){
        this.idEmpleado=idEmpleado;
        this.nombre=nombre;
        this.encuestasRealizadas=0;

    }
    public Empleado(int idEmpleado,String  nombre,int encuestasRealizadas){
        this.idEmpleado=idEmpleado;
        this.nombre=nombre;
        this.encuestasRealizadas=encuestasRealizadas;

    }
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void sumarEncuesta(){
        this.encuestasRealizadas++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEncuestasRealizadas() {
        return encuestasRealizadas;
    }


}
