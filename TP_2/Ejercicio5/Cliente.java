package TP_2.Ejercicio5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Cliente {

    private String nombre;
    private boolean esFrecuente;
    //private LocalDateTime ultimoTurno;

    public void actualizarTurno(LocalDateTime fechaTurno){

        LocalDateTime fechaActual= LocalDateTime.now();

        Period period = Period.between(fechaActual.toLocalDate(),fechaTurno.toLocalDate());//paso las fechas a localdate para calcular la diferencia

        int meses= period.getMonths();// obtengo los meses

        if(meses==1){
            this.esFrecuente=true;
        }else {
            this.esFrecuente=false;
        }

    }

    public boolean esFrecuente() {
        return esFrecuente;
    }

    public Cliente(String nombre){
        this.setNombre(nombre);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
