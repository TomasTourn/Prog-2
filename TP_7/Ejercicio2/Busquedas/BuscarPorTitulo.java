package TP_7.Ejercicio2.Busquedas;

import TP_7.Ejercicio2.Buscar;
import TP_7.Ejercicio2.Documento;

public class BuscarPorTitulo extends Buscar {

    private String titulo;

    @Override
    public boolean cumple(Documento d){
        return d.getTitulo().equals(titulo);
    }
}
