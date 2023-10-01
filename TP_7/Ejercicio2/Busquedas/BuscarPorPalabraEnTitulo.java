package TP_7.Ejercicio2.Busquedas;

import TP_7.Ejercicio2.Buscar;
import TP_7.Ejercicio2.Documento;

public class BuscarPorPalabraEnTitulo extends Buscar {

    private String PalabraEnTitulo;
    @Override
    public boolean cumple(Documento d){
        return d.getTitulo().contains(PalabraEnTitulo);
    }
}
