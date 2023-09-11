package TP_6.Ejercicio1;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pelicula p= new Pelicula("interestelar","viajecitos en el espacio",4000,"blablabla",2);
        Auto a= new Auto("camaro","el de transformers",50000,"chevrolet",0,"hdhd 222");
        Cliente c= new Cliente("luchito",3500000);
        SistemaAlquiler s=new SistemaAlquiler();
        Alquiler al=new Alquiler(p, LocalDate.of(2023,9,7),LocalDate.of(2023,9,10),c);

        s.agregarAlquiler(al);
        System.out.println(s.alquilerVencido(al));
        System.out.println("lista alquileres vencidos");
        System.out.println(s.ListarVencidos());
        System.out.println("--------------------");
        System.out.println(al);


    }

}
