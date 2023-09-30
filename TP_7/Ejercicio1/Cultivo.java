package TP_7.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cultivo {

    private String nombre;
    private List<Enfermedad>enfermedades;

    public Cultivo(String nombre){
        this.nombre=nombre;
        this.enfermedades=new ArrayList<>();
    }
    public void addEnfermedad(Enfermedad e){
        if(e!=null && !enfermedades.contains(e)){
            enfermedades.add(e);
        }
    }

    public String getNombre() {
        return nombre;
    }
}
