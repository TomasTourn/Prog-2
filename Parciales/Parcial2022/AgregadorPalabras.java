package Parciales.Parcial2022;

import Parciales.Parcial2022.Buscadores.Buscador;

import java.util.ArrayList;
import java.util.List;

public class AgregadorPalabras {

    private Buscador condicion;
    private List<String>palabras;

    public AgregadorPalabras(Buscador condicion) {
        this.condicion = condicion;
        this.palabras = new ArrayList<>();
    }

    public List<String> agregar(Noticia n){
        List<String>palabrasAgregar=new ArrayList<>();
        if (condicion.cumple(n)){
               palabrasAgregar.addAll(palabras);
        }
        return palabrasAgregar;
    }

    public Buscador getCondicion() {
        return condicion;
    }

    public void setCondicion(Buscador condicion) {
        this.condicion = condicion;
    }
}
