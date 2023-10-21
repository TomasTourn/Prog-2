package TP_9.Ejercicio1.Buscadores;

import TP_9.Ejercicio1.Socio;

public class BuscadorEdad implements Buscador{


    private int edad;

    public BuscadorEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean cumple(Socio s) {
        return s.getEdad()==edad;
    }
}
