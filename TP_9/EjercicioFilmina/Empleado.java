package TP_9.EjercicioFilmina;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends ElementoEmpresa{

    private String nombre;
    private double sueldo;
    private String especialidad;

    public Empleado(String nombre,double sueldo, String especialidad) {
        this.nombre=nombre;
        this.sueldo = sueldo;
        this.especialidad = especialidad;
    }


    @Override
    public int cantEmpleadosxEspecialidad(String especialidad){
        if(especialidad.equalsIgnoreCase(getEspecialidad()))
        return 1;
        else return 0;
    }
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Empleado> empleadosPorEspecialidad(String especialidad){

        List<Empleado>empleado=new ArrayList<>();
        if (especialidad.equalsIgnoreCase(this.getEspecialidad())){
            empleado.add(this);
        }
        return empleado;

    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String toString(){
        return nombre+ " "+ especialidad;
    }
}
