package TP_9.Ejercicio3;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Mesa extends ElementoAbstracto{

    private List<Persona>padron;
    private List<Voto>votos;

    public Mesa() {
        padron=new ArrayList<>();
        votos=new ArrayList<>();
    }

    public void addVoto(Voto v){
        if (padron.contains(v.getPersona()))//si la persona esta en el padron agrego el voto
            votos.add(v);
    }

    public void addPersona(Persona p){
        if(!padron.contains(p))
            padron.add(p);
    }
    @Override
    public int cantVotos() {
     return votos.size();
    }

    @Override
    public int cantVotosA(Candidato c) {
        int cant=0;
        for (Voto v:votos) {
            if (v.getCandidato().equals(c))
                cant++;
        }
        return cant;
    }

    @Override
    public int cantEnBlanco() {
        int cant=0;
        for (Voto v:votos) {
            if (v.getCandidato()==null)
                cant++;
        }
        return cant;
    }

    @Override
    public int votosEntre(LocalTime t1, LocalTime t2) {
        int cant=0;
        for (Voto v:votos) {
            if (v.getHora().isAfter(t1)&&v.getHora().isBefore(t2))
                cant++;
        }
        return cant;
    }

    @Override
    public List<Candidato> getCandidatos() {
        List<Candidato>candidatos=new ArrayList<>();
        for (Voto v:votos) {
            if (!candidatos.contains(v.getCandidato()))
                candidatos.add(v.getCandidato());
        }
        return candidatos;
    }

    public String toString(){
        return "\nPadron= "+padron +"\n Votos= "+votos;
    }

}
