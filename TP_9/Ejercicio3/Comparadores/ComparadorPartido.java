package TP_9.Ejercicio3.Comparadores;

import TP_9.Ejercicio3.Candidato;

public class ComparadorPartido extends ComparadorCandidato{

    public ComparadorPartido() {
    }

    public ComparadorPartido(ComparadorCandidato siguiente) {
        super(siguiente);
    }

    @Override
    public int comparar(Candidato c1, Candidato c2) {
        return c1.getPartido().compareTo(c2.getPartido());
    }
}
