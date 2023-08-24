package TP_2.Ejercicio4;

import java.time.LocalDateTime;

public class main {

    /*
    * Establecimiento deportivo
    *
    * cancha de futbol y de paddle
    * usuarios que pueden ser socios
    * registro de socios
    *
    * clase cancha,establecimiento,usuario,turno
    *
    *
    *
    * */

    public static void main(String[] args) {

        Cancha c1= new Cancha("futbol 5");
        Cancha c2= new Cancha("futbol 5");
        Cancha c3= new Cancha("paddle");
        Cancha c4= new Cancha("paddle");

        Usuario u1= new Usuario("juan");
        Usuario u2= new Usuario("luciano");
        Usuario u3= new Usuario("francisco");

        Turno t1= new Turno(1,u1,c1, LocalDateTime.of(2023,8,21,18,0,0));
        Turno t2= new Turno(1,u1,c2, LocalDateTime.of(2023,8,22,18,0,0));
        System.out.println(t2.getCancha().getPrecio());


        Turno t3= new Turno(1,u1,c4, LocalDateTime.of(2023,8,23,18,0,0));
        Turno t4= new Turno(1,u1,c1, LocalDateTime.of(2023,8,24,18,0,0));
        Turno t5= new Turno(1,u1,c4, LocalDateTime.of(2023,8,25,18,0,0));

        System.out.println(t5.getCancha().getPrecio());


    }
}
