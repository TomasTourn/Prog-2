package TP_9.Ejercicio3.Comparadores;

import TP_9.Ejercicio3.Candidato;

public class ComparadorAgrupacion extends ComparadorCandidato{

    public ComparadorAgrupacion() {
    }

    public ComparadorAgrupacion(ComparadorCandidato siguiente) {
        super(siguiente);
    }

    @Override
    public int comparar(Candidato c1, Candidato c2) {
        return c1.getAgrupacion().compareTo(c2.getAgrupacion());
    }
}
