package TP_6.Ejercicio3;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        /*clase
        puerto
        colaEspera
        camion,barco
        */

        ColaEsperaCamion colaCamion1= new ColaEsperaCamion();
        ColaEsperaBarco colaBarco1= new ColaEsperaBarco();

        Camion c1= new Camion(LocalDate.of(2002,6,7));
        Camion c2= new Camion(LocalDate.of(2002,8,7));
        Camion c3= new Camion(LocalDate.of(2002,10,7));

        Barco b1= new Barco(200);
        Barco b2= new Barco(300);
        Barco b3= new Barco(500);
        Barco b4= new Barco(600);

        colaCamion1.addElemento(c1);
        colaCamion1.addElemento(c2);
        colaCamion1.addElemento(c3);

        colaBarco1.addElemento(b1);
        colaBarco1.addElemento(b2);
        colaBarco1.addElemento(b3);
        colaBarco1.addElemento(b4);

        Puerto p= new Puerto(colaBarco1,colaCamion1);

        p.IntercambioCereal();


    }
}
