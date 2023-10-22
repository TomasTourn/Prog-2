package TP_9.Ejercicio3;

import java.time.LocalTime;

public class Voto {//estaria bien q herede de elemento abstracto para delegarle los metodos?

    private Persona persona;
    private Candidato candidato;
    private LocalTime hora;

    public Voto(Persona persona) {
        this.persona = persona;
        this.hora = LocalTime.now();
        this.candidato=null;
    }

    public Voto(Persona persona, Candidato candidato) {
        this.persona = persona;
        this.candidato = candidato;
        this.hora = LocalTime.now();
    }

    public String toString(){
        return "\n"+persona+" "+candidato+ " Hora= "+hora;
    }
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
