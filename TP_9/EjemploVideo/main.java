package TP_9.EjemploVideo;

import java.util.ArrayList;
import java.util.Collections;

public class main {

    public static void main(String[] args) {

        Persona p1= new Persona("trueno","rodriguez",65,99);
        Persona p2= new Persona("duki","alvarez",25,99);

        ComparadorPersona c1=new ComparadorNombre();

        ComparadorPersona c2= new ComparadorEdad(c1);

        ComparadorPersona c3=new ComparadorDni(c2);


        ArrayList<Persona>personas=new ArrayList<>();
        personas.add(p1);
        personas.add(p2);

       // Collections.sort(personas,c1);
       // Collections.sort(personas);// usa el comparable por defecto
        //System.out.println(personas);
        Collections.sort(personas,c3);

        System.out.println(personas);

    }


}
