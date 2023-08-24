package TP_1.Ejercicio3;

public class Main {
    public static void main(String []Args){

        PuntoGeometrico p1= new PuntoGeometrico(0,5);
        PuntoGeometrico p2= new PuntoGeometrico(5,5);
        PuntoGeometrico p3= new PuntoGeometrico(5,0);
        PuntoGeometrico p4= new PuntoGeometrico(0,0);
        Rectangulo r1= new Rectangulo(p1,p2,p3,p4);

        PuntoGeometrico p5= new PuntoGeometrico(0,3);
        PuntoGeometrico p6= new PuntoGeometrico(3,3);
        PuntoGeometrico p7= new PuntoGeometrico(3,0);
        PuntoGeometrico p8= new PuntoGeometrico(0,0);
        Rectangulo r2= new Rectangulo(p5,p6,p7,p8);


       // System.out.println(p4);
        System.out.println("Rectangulo");
        System.out.println(r1.area());
        System.out.println(r1.compararRectangulo(r2));
        System.out.println(r1.esCuadrado());
        System.out.println(r1.largoSuperior());
        System.out.println(r1.paradoOacostado());

        System.out.println("-------------");
        System.out.println("Rectangulo clase 2");

        Rectangulo2 rr= new Rectangulo2(p1,6,5);
        System.out.println(rr.esCuadrado());


    }


}
