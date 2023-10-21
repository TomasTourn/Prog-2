package TP_9.Ejercicio1;

import TP_9.Ejercicio1.Buscadores.Buscador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sistema {

    private String nombre;
    private List<Socio>socios;

    public Sistema(String nombre) {
        this.nombre = nombre;
        this.socios = new ArrayList<>();
    }

    public List<Socio>BuscarSocios(Buscador b,ComparadorSocio c){

        List<Socio>sociosBuscados=new ArrayList<>();

        for (Socio s:socios) {
            if (b.cumple(s)){
                sociosBuscados.add(s);
            }
        }
        Collections.sort(sociosBuscados,c);
        return sociosBuscados;
    }

    public void addSocio(Socio s){
        if(!socios.contains(s))
            socios.add(s);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
