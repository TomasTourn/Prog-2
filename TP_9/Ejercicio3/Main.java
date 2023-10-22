package TP_9.Ejercicio3;

import TP_9.Ejercicio3.Comparadores.ComparadorAgrupacion;
import TP_9.Ejercicio3.Comparadores.ComparadorCandidato;
import TP_9.Ejercicio3.Comparadores.ComparadorNombre;
import TP_9.Ejercicio3.Comparadores.ComparadorPartido;

import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
           Sistema Electoral
            patron composite
            clase elementoAbstracto

                hijas= mesa va a ser la clase simple, ubicacion sera la compuesta.
                clase mesa tiene lista de personas y votos

                    un voto va a tener una persona y una referencia a un candidato o no(blanco) y la hora del voto
                    clase candidato(nombre,partido,agrupacion)
                    clase persona tiene dni*/

        //lugares
        Ubicacion tandil =new Ubicacion("Tandil");
        Ubicacion juarez =new Ubicacion("Juarez");

        Ubicacion unicen =new Ubicacion("Unicen");
        Ubicacion barrio =new Ubicacion("las tunitas");


        //mesas
        Mesa m1=new Mesa();
        Mesa m2=new Mesa();

        //agrego barrio e institucion a tandil y mesa a la institucion
        tandil.addElemento(barrio);
        barrio.addElemento(unicen);
        unicen.addElemento(m1);

        //mesa "especial" agregada directamente a juarez (es una mesa comun pero se puede agregar gracias al composite)
        juarez.addElemento(m2);



        //candidatos
        Candidato milei=new Candidato("Milei","La Libertad Avanza","VLLC");
        Candidato massa=new Candidato("Massa","Frende de todos","Casta");
        Candidato bullrich=new Candidato("Bullrich","Juntos x el Cambio","vino");


        //personas
        Persona p1=new Persona(7773737);
        Persona p2=new Persona(123232);
        Persona p3=new Persona(768658);
        Persona p4=new Persona(80585);
        Persona p5=new Persona(5657232);
        Persona p6=new Persona(56742574);
        Persona p7=new Persona(113256);

        //votos
        Voto vp1=new Voto(p1,milei);
        Voto vp2=new Voto(p2,massa);
        Voto vp3=new Voto(p3,bullrich);
        Voto vp4=new Voto(p4);
        Voto vp5=new Voto(p5,milei);
        Voto vp6=new Voto(p6,massa);
        Voto vp7=new Voto(p7,milei);

        //agrego personas y votos a las mesas
        m1.addPersona(p1);
        m1.addPersona(p2);
        m1.addPersona(p3);

        m1.addVoto(vp1);
        m1.addVoto(vp2);
        m1.addVoto(vp3);


        m2.addPersona(p4);
        m2.addPersona(p5);
        m2.addPersona(p6);
        m2.addPersona(p7);

        m2.addVoto(vp4);
        m2.addVoto(vp5);
        m2.addVoto(vp5);
        m2.addVoto(vp7);


        //comparadores
        ComparadorNombre compNombre=new ComparadorNombre();
        ComparadorAgrupacion compAgrupacion=new ComparadorAgrupacion(compNombre);
        ComparadorPartido compPartido=new ComparadorPartido(compAgrupacion);

        //testing

        System.out.println("votos totales de tandil");
        System.out.println(tandil.cantVotos());

        System.out.println("\nvotos en blanco de juarez");
        System.out.println(juarez.cantEnBlanco());


        System.out.println("\nporcentaje en blanco de juarez");
        System.out.println(juarez.porcentajeEnBlanco());

        System.out.println("\ntotal votos entre estas horas");
        System.out.println(juarez.votosEntre(LocalTime.of(19,0,0),LocalTime.of(20,0,0)));

        System.out.println("\nporcentaje votos entre estas horas");
        System.out.println(juarez.porcentajeEntre(LocalTime.of(19,0,0),LocalTime.of(20,0,0)));

        //me traigo el listado y lo ordeno
        List<Candidato>candidatos=tandil.getCandidatos();
        Collections.sort(candidatos,compPartido);


        System.out.println("\ncandidatos votados en tandil ordenados");
        System.out.println(candidatos);


    }

}
