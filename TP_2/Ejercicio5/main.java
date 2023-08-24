package TP_2.Ejercicio5;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class main {

    public static void main(String[] args) {
        /* planteo peluqueria
        *
        * clases: peluqueria,peluquero,turno,cliente
        *
        * turno tiene que tener atributo peluquero
        *cliente debe saber si es frecuente o no
        *
        *  */

        Cliente c1= new Cliente("lucio");
        Cliente c2= new Cliente("marcos");
        Peluquero p1= new Peluquero("Micaela", LocalTime.of(8,0,0),LocalTime.of(16,0,0));

        Turno t4= new Turno(LocalDateTime.of(2023,12,25,8,0,0),p1,c2,500);
        Turno t1= new Turno(LocalDateTime.of(2023,9,14,9,0,0),p1,c1,500);
        Turno t2= new Turno(LocalDateTime.of(2023,9,25,11,0,0),p1,c1,500);
        Turno t3= new Turno(LocalDateTime.of(2023,12,25,12,0,0),p1,c1,500);



        System.out.println(t1.getPrecio());
        System.out.println(t2.getPrecio());
        System.out.println(t3.getPrecio());
        System.out.println(t4.getPrecio());




    }


}
