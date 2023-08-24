package TP_2.Ejercicio4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Usuario {

    private String nombre;
    private boolean esSocio;
    private int reservasUltimosDosMeses;

    public Usuario(String nombre){
        this.setNombre(nombre);
        this.setReservasUltimosDosMeses(0);
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esSocio() {
        return reservasUltimosDosMeses>4;
    }

    public void ActualizarReservas(LocalDateTime fechaReserva){

        LocalDateTime fechaActual= LocalDateTime.now();

        Period period = Period.between(fechaActual.toLocalDate(),fechaReserva.toLocalDate());//paso las fechas a localdate para calcular la diferencia

        int meses= period.getMonths();// obtengo los meses
        if(meses<=2){
            reservasUltimosDosMeses++;
        }else {
            reservasUltimosDosMeses=0;
        }

    }


    public int getReservasUltimosDosMeses() {
        return reservasUltimosDosMeses;
    }

    public void setReservasUltimosDosMeses(int reservasUltimosDosMeses) {
        this.reservasUltimosDosMeses = reservasUltimosDosMeses;
    }



}
