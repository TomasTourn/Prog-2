package TP_1.Ejercicio1;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String []Args){

        Persona p1 = new Persona(43542315);
        p1.setFechaNacimiento(LocalDate.parse("2006-08-05"));
        p1.setEdad(17);
        System.out.println(p1.getData());
        System.out.println(p1.cumpleAnios());
        System.out.println(p1.esMayor());
        System.out.println(p1.puedeVotar());
        System.out.println(p1.edadCoherente());

        p1.setPeso(78);
        p1.setAltura(1.78);
        System.out.println(p1.imc());
        System.out.println(p1.enForma());

    }


}


/*
import java.time.LocalDate;
import java.time.Period;
ejemplos de localdate

public class Main {



* public static void main(String[]Args){
    LocalDate fechaActual;
    fechaActual=LocalDate.now();
    System.out.println(fechaActual);

    LocalDate fechaRandom;
    fechaRandom=LocalDate.parse("2023-03-22");
    System.out.println(fechaRandom);

    Period diferencia = Period.between(fechaActual,fechaRandom);
    System.out.println(diferencia);
    int diferenciaAnios;
    diferenciaAnios=diferencia.getYears();
    System.out.println(diferenciaAnios);
}

}*/