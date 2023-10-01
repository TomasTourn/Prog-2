package TP_7.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public abstract class CriterioRentabilidad {

    private List<String> generos;

    public CriterioRentabilidad(){
        generos=new ArrayList<>();
    }
    public abstract boolean esRentable(Pelicula p);

    public void addGenero(String g){
        if(g!=null && !generos.contains(g))
                generos.add(g);
    }

    public List<String> getGeneros() {
        List<String>copia=new ArrayList<>();
        copia.addAll(generos);
        return copia;
    }
}
