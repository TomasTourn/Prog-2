package TP_4.Ejercicio4;

import java.time.LocalDate;

public class main {


    /*Seleccion de futbol
    *
    * voy a usar Persona como clase padre y de ahi hago herencia en Futbolista,masajista y entrenador
    *
    * en persona controlo el estado actual
    *
    * */


    public static void main(String[] args) {

        Persona f1= new Futbolista("leo","messi",6437473, LocalDate.of(1987,6,24),"en pais de origen","delantero",true,99999);
        Persona m1= new Masajista("jose","rodriguez",55374723, LocalDate.of(1967,6,14),"en concentracion","maestro masajeador",30);
        Persona e1= new Entrenador("Lionel","Scaloni",52274723, LocalDate.of(1997,6,14),"viajando","AFA");

        System.out.println(f1.estaDisponible());
        System.out.println(m1.estaDisponible());
        System.out.println(e1.estaDisponible());
    }
}
