package TP_7.Ejercicio2.Busquedas;

import TP_7.Ejercicio2.Buscar;
import TP_7.Ejercicio2.Documento;

import java.util.List;

public class BuscarPorPalabrasEnContenido extends Buscar {

    private int cantPalabras;

    @Override
    public boolean cumple(Documento d){
        String[]palabras =d.getContenido().split(" ");
        return palabras.length>=cantPalabras;
    }


}
