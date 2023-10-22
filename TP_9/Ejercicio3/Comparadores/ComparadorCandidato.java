package TP_9.Ejercicio3.Comparadores;

import TP_9.Ejercicio3.Candidato;

import java.util.Comparator;

public abstract class ComparadorCandidato implements Comparator<Candidato> {

    private ComparadorCandidato siguiente;

    public ComparadorCandidato(){
    }
    public ComparadorCandidato(ComparadorCandidato siguiente) {
        this.siguiente = siguiente;
    }

    public abstract int comparar(Candidato c1,Candidato c2);

    public int compare(Candidato c1,Candidato c2){
            int res=comparar(c1,c2);
        if(res==0&&siguiente!=null){
            return siguiente.comparar(c1,c2);
        }else return res;
    }

    public ComparadorCandidato getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ComparadorCandidato siguiente) {
        this.siguiente = siguiente;
    }
}
