package TP_2.Ejercicio5;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Peluquero {

    private String nombre;
    private boolean disponible;
    private LocalTime inicioTrabajo;
    private LocalTime finTrabajo;
    private boolean[] disponibilidad;// arreglo booleano, cada posicion representa una hora y tiene un booleano dentro, por lo que si el valor es true el peluquero esta disponible en esa hora en especifico


    public Peluquero(String nombre,LocalTime inicioTrabajo,LocalTime finTrabajo){

        this.setNombre(nombre);
        this.setInicioTrabajo(inicioTrabajo);
        this.setFinTrabajo(finTrabajo);
        this.disponibilidad= new boolean[24];
        this.setHorasTrabajo();
    }


    public void setHorasTrabajo(){

        //lleno el arreglo con true en las horas de trabajo y con false en las horas que no trabaja
        for (int i = inicioTrabajo.getHour(); i <= finTrabajo.getHour(); i++) {
            disponibilidad[i] = true;
        }
        for (int i = 0; i < 24; i++) {
            if (i < inicioTrabajo.getHour() || i > finTrabajo.getHour()) {
                disponibilidad[i] = false;
            }
        }

    }



    public void setOcupado(int pos) {
        this.disponibilidad[pos]=false;
    }

    public boolean isDisponible(LocalDateTime fecha){
        if(disponibilidad[fecha.getHour()] && disponibilidad[fecha.getHour()+1]){
            return true;
        }else {
            return false;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getInicioTrabajo() {
        return inicioTrabajo;
    }

    public void setInicioTrabajo(LocalTime inicioTrabajo) {
        this.inicioTrabajo = inicioTrabajo;
    }

    public LocalTime getFinTrabajo() {
        return finTrabajo;
    }

    public void setFinTrabajo(LocalTime finTrabajo) {
        this.finTrabajo = finTrabajo;
    }
}
