package TP_9.Ejercicio1;

import TP_9.Ejercicio1.Buscadores.BuscadorCancha;
import TP_9.Ejercicio1.Buscadores.BuscadorCuota;
import TP_9.Ejercicio1.Buscadores.BuscadorEdad;
import TP_9.Ejercicio1.Buscadores.BuscadorPrecio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        /*

        Clase Socio;
        (nombre,apellido,edad,boolean(cuotaPaga),lista de alquileres de canchas;

        Clase alquiler,registra la fecha,el id de la cancha y el pago;
        * */

        Sistema s= new Sistema("sistema de socios");

        Socio s1=new Socio("jose","perez",22,true);
        Socio s2=new Socio("martin","suarez",26,true);
        Socio s3=new Socio("acho","martinez",28,true);
        Socio s4=new Socio("gustavo","desch",22,false);
        Socio s5=new Socio("gustavo","artus",22,false);

        Alquiler a1= new Alquiler(LocalDate.of(2023,12,6),13,700);
        Alquiler a2= new Alquiler(LocalDate.of(2023,12,6),122,300);
        Alquiler a3= new Alquiler(LocalDate.of(2023,12,6),1,1000);
        Alquiler a4= new Alquiler(LocalDate.of(2023,12,6),13,990);
        Alquiler a5= new Alquiler(LocalDate.of(2023,12,6),13,2000);

        //agrego alquileres a socios
        s1.addAlquiler(a1);



        s2.addAlquiler(a2);

        s3.addAlquiler(a3);

        s4.addAlquiler(a4);


        s5.addAlquiler(a5);


        //agrego socios a la empresa
        s.addSocio(s1);
        s.addSocio(s2);
        s.addSocio(s3);
        s.addSocio(s4);
        s.addSocio(s5);

        //comparadores

        ComparadorSocio c1=new ComparadorApellido();

        //comparador punto d
        ComparadorSocio c3= new ComparadorNombre(c1);
        ComparadorSocio c4= new ComparadorCuota(c3);




        //listas buscadas

        List<Socio>SocioEdad=s.BuscarSocios(new BuscadorEdad(22),c1);
        List<Socio>SocioPago=s.BuscarSocios(new BuscadorPrecio(500),c4);



        //System.out.println(SocioPago);

      //  System.out.println(s.BuscarSocios(new BuscadorCancha(13)));

        //System.out.println(s.BuscarSocios(new BuscadorCuota(false)));

      //  Collections.sort(SocioEdad,c1);




        System.out.println(SocioPago);

       // System.out.println(SocioEdad);




    }

}
