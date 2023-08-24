package Avion;

public class Main {

    public static void main (String []args){

        //instanciamiento de un objeto == creando un objeto
        Avion air314 = new Avion();

        //imprimo un atributo
        System.out.println(air314.getColor());
        //edito un atributo
        air314.setColor("rojo");
        //imprimo el atributo editado
        System.out.println(air314.getColor());

        Persona p1 = new Persona();
        System.out.println(p1.getDatosCompletos());
        p1.setNombre("Tomás");
        Persona p2 = new Persona("Tomás","Tourn",43542315,178,78);
        System.out.println(p1.getDatosCompletos());
        //System.out.println(p1.getNombre());
        System.out.println(p2.getDatosCompletos());
    }

}
