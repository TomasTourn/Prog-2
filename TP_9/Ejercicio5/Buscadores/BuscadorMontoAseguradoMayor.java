package TP_9.Ejercicio5.Buscadores;

import TP_9.Ejercicio5.Seguro;

public class BuscadorMontoAseguradoMayor implements Buscador{

    private double monto;

    public BuscadorMontoAseguradoMayor(double monto) {
        this.monto = monto;
    }

    @Override
    public boolean cumple(Seguro s) {
        return s.getMontoAsegurado()>monto;
    }
}
