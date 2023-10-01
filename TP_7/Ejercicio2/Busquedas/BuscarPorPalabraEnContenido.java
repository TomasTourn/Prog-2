package TP_7.Ejercicio2.Busquedas;

import TP_7.Ejercicio2.Buscar;
import TP_7.Ejercicio2.Documento;

public class BuscarPorPalabraEnContenido extends Buscar {

    private String palabra;

    @Override
    public boolean cumple(Documento d){
        return d.getContenido().toLowerCase().contains(palabra.toLowerCase());
    }


}
