package TP_7.Ejercicio2.Busquedas;

import TP_7.Ejercicio2.Buscar;
import TP_7.Ejercicio2.Documento;

public class BuscarSinPalabraClave extends Buscar {

    @Override
    public boolean cumple(Documento d){
        return d.getPalabrasClave().isEmpty();//si esta vacio retorna true
    }

}
