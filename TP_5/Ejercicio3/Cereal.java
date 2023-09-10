package TP_5.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Cereal {

    private String nombre;
    private List<String>minerales;

    public Cereal(String nombre){
        this.nombre=nombre;
        minerales=new ArrayList<String>();
    }
    public void agregarMineral(String mineral){
       if(!minerales.contains(mineral)){
           minerales.add(mineral.toLowerCase());
       }
    }

    public boolean sePuedeSembrarEn(Lote l){
        return l.getMinerales().containsAll(this.getMinerales());
    }

    public boolean equals(Object o){
        Cereal cereal=(Cereal) o;
        try{
            return cereal.getNombre().equals(this.getNombre());
        }catch (Exception e){
            return false;
        }
    }
    public String getNombre() {
        return nombre;
    }

    public List<String> getMinerales() {
        return minerales;
    }
}
