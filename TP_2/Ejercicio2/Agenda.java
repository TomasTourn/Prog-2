package TP_2.Ejercicio2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Agenda {

    //private Persona[] personas;
    private Reunion[] reuniones;
    //agenda necesita controlar que las reuniones no se superpongan
    private LocalTime inicioJornada;
    private LocalTime finJornada;
    private LocalDate dia;

    public Agenda(int cantReuniones){
        this.reuniones=new Reunion[cantReuniones];
        this.setInicioJornada(LocalTime.of( 8, 0, 0));
        this.setFinJornada(LocalTime.of( 20, 0, 0));
    }

    public LocalTime getInicioJornada() {
        return inicioJornada;
    }

    public void setInicioJornada(LocalTime inicioJornada) {
        this.inicioJornada = inicioJornada;
    }

    public LocalTime getFinJornada() {
        return finJornada;
    }

    public void setFinJornada(LocalTime finJornada) {
        this.finJornada = finJornada;
    }

    public void agregarReunion(Reunion reunion, int pos){

        //controlar q no colapsen horarios


        if(reunion != null && reuniones[pos]==null && pos>=0 && pos<reuniones.length){
            reuniones[pos]=reunion;
        }

    }
    public void editarReunion(Reunion reunion,int pos){

        if(reunion != null && reuniones[pos]!=null && pos>=0 && pos<reuniones.length){
            reuniones[pos]=reunion;
        }

    }

}
