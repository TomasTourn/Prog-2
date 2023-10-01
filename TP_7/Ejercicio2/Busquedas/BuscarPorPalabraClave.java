package TP_7.Ejercicio2.Busquedas;

import TP_7.Ejercicio2.Buscar;
import TP_7.Ejercicio2.Documento;

public class BuscarPorPalabraClave extends Buscar {

    private String palabraClave;

    @Override
    public boolean cumple(Documento d){
        for (String  p: d.getPalabrasClave()) {
            return p.equals(palabraClave);//retorna al encontrar la palabra clave
        }
        return false;
    }


}
