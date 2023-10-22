package TP_9.Ejercicio3.Comparadores;

import TP_9.Ejercicio3.Candidato;

public class ComparadorNegador extends ComparadorCandidato{

    private ComparadorCandidato comparador;

    public ComparadorNegador(ComparadorCandidato comparador) {
        this.comparador = comparador;
    }

    public ComparadorNegador(ComparadorCandidato siguiente, ComparadorCandidato comparador) {
        super(siguiente);
        this.comparador = comparador;
    }

    @Override
    public int comparar(Candidato c1, Candidato c2) {
        return -1*comparador.comparar(c1,c2);
    }
}
