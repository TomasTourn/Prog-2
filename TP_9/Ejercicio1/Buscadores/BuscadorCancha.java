package TP_9.Ejercicio1.Buscadores;

import TP_9.Ejercicio1.Socio;

public class BuscadorCancha implements Buscador{


    private int idCancha;

    public BuscadorCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    @Override
    public boolean cumple(Socio s) {
       return s.IDCanchaPresente(idCancha);
    }
}
