package TP_7.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Enfermedad {

    private String  nombre;
    private List<String>sintomas;

    public Enfermedad(String nombre){
        this.nombre=nombre;
        this.sintomas=new ArrayList<>();
    }
    public void addSintoma(String s){
        if(s!=null && !sintomas.contains(s)){
            sintomas.add(s);
        }
    }
    public List<String> getSintomas() {
        List<String> copiaSintomas=new ArrayList<>();
        copiaSintomas=this.sintomas;
        return copiaSintomas;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString(){
        return nombre;
    }
}
