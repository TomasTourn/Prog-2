package TP_5.Ejercicio5;

import java.util.List;

public class Empresa {

    private String nombre;
    private List<Empleado>empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEmpleado(Empleado e){
        if(!empleados.contains(e))
            empleados.add(e);
    }
    public double gastoTotal(){
        double total=0;
        for (Empleado e:empleados) {
            total+=e.getSueldo();
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
