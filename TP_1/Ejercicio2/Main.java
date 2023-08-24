package TP_1.Ejercicio2;

import TP_1.Ejercicio3.Rectangulo;

public class  Main {
    public static  void main (String[]Args){


    Electrodomestico e1 = new Electrodomestico("lavarropa");
        /*System.out.println(e1.getData());
        e1.setPeso(30);
        System.out.println(e1.balance());
        System.out.println(e1.esAltaGama());*/

        Electrodomestico e5 = new Electrodomestico("dslhflsdh",55,"rojo");
        System.out.println(e5.getData());
        e5.setPrecio(77);
        System.out.println(e5.getData());

    }
}
