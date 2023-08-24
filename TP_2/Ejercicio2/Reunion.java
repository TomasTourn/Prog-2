package TP_2.Ejercicio2;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Reunion {

    private String lugar;
    private String tema;
    private LocalDateTime horaInicio;
    private LocalTime duracion;
    private Persona[] personas;


    public Reunion(String lugar,String tema,LocalDateTime horaInicio,LocalTime duracion,int cantPersonas){

        this.setLugar(lugar);
        this.setTema(tema);
        this.setHoraInicio(horaInicio);
        this.setDuracion(duracion);
        this.personas= new Persona[cantPersonas];

    }

    public void AgregarPersona(Persona persona,int pos){

        if(persona != null && pos>=0 && pos<personas.length && personas[pos]==null){
            personas[pos]=persona;
        }

    }

    public void editarPersona(Persona persona,int pos){

        if(persona != null && pos>=0 && pos<personas.length && personas[pos]!=null){
            personas[pos]=persona;
        }
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }
}
