package TP_5.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {

    private String nombre;
    private List<Contribuyente>contribuyentes;
    private double gastosMantenimiento;
    public Ciudad(String nombre,double gastosMantenimiento) {
        this.nombre = nombre;
        this.gastosMantenimiento=gastosMantenimiento;
        contribuyentes=new ArrayList<>();
    }

    public void agregarContribuyente(Contribuyente c){
        if(!contribuyentes.contains(c))
            contribuyentes.add(c);
    }

    public boolean tieneDeficit(){

        double totalRecaudado=0;

        for (Contribuyente c:contribuyentes) {
            totalRecaudado+=c.getImpuesto();
        }
        return  totalRecaudado<gastosMantenimiento;
    }



}
