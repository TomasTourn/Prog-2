package TP_9.Ejercicio3.Comparadores;

import TP_9.Ejercicio3.Candidato;

public class ComparadorNombre extends ComparadorCandidato{


    public ComparadorNombre() {
    }

    public ComparadorNombre(ComparadorCandidato siguiente) {
        super(siguiente);
    }
    @Override
    public int comparar(Candidato c1, Candidato c2) {
        return c1.getNombre().compareTo(c2.getNombre());
    }
}
