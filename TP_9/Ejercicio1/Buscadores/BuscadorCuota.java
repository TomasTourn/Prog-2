package TP_9.Ejercicio1.Buscadores;

import TP_9.Ejercicio1.Socio;

public class BuscadorCuota implements Buscador{

    private Boolean cuota;

    public BuscadorCuota(Boolean cuota){
        this.cuota=cuota;
    }

    @Override
    public boolean cumple(Socio s) {
        return s.isCuotaPaga()==cuota;
    }
}
