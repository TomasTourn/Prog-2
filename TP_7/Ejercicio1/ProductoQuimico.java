package TP_7.Ejercicio1;

import TP_6.Ejercicio3.Puerto;

import java.util.ArrayList;
import java.util.List;

public class ProductoQuimico {

    private String nombre;
    private List<Cultivo> cultivosDesaconsejados;
    private List<String > sintomasQueTrata;

    public ProductoQuimico(String nombre){
        this.nombre=nombre;
        this.cultivosDesaconsejados=new ArrayList<>();
        this.sintomasQueTrata=new ArrayList<>();
    }

    public void addCultivoDesaconsejado(Cultivo c){
        if(c!=null && !cultivosDesaconsejados.contains(c)){
            cultivosDesaconsejados.add(c);
        }
    }
    public void addSintomasQueTrata(String s){
        if(s!=null && !sintomasQueTrata.contains(s)){
            sintomasQueTrata.add(s);
        }
    }

    public List<String> getSintomasQueTrata() {
        List<String> copiaSintomas=new ArrayList<>();
        copiaSintomas=this.sintomasQueTrata;
        return copiaSintomas;
    }

    public List<Cultivo> getCultivosDesaconsejados() {
        List<Cultivo> cultivos=new ArrayList<>();
        cultivos=this.cultivosDesaconsejados;
        return cultivos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString(){
        return "nombre: "+nombre;
    }

}
