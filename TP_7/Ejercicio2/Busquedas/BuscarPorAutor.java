package TP_7.Ejercicio2.Busquedas;

import TP_7.Ejercicio2.Buscar;
import TP_7.Ejercicio2.Documento;

public class BuscarPorAutor extends Buscar {

    private String autor;
    @Override
    public boolean cumple(Documento d){

        for (String a: d.getAutores()) {
            return a.equalsIgnoreCase(autor);
        }
        return false;
    }


}
