package TP_2.Ejercicio3;

public class main {

    //sitema de control de gastos publicos
    /* clases: Provincia, Ciudad, Impuesto
     *
    * cada ciudad va a tener nombre,habitantes, mantenimiento y un arreglo con los impuestos
    * impuestos va a tener nombre descripcion y monto recaudado;
    * provincia tiene nombre y arreglo de ciudades
    *mantenimiento lo uso como atributo para no repetir codigo, aunque se podria hacer una clase
    *
    * */

    public static void main(String[] args) {

        //recaudan 18k en impuestos
        Impuesto imp1 = new Impuesto("luz","---",5000);
        Impuesto imp2 = new Impuesto("agua","---",3000);
        Impuesto imp3 = new Impuesto("gas","---",1000);
        Impuesto imp4 = new Impuesto("internet","---",4000);
        Impuesto imp5 = new Impuesto("municipal","---",1000);

        Ciudad c1= new Ciudad("Tandil",180000,5,600000);
        Ciudad c2= new Ciudad("Jacinto Arauz",200000,5,20000);
        Ciudad c3= new Ciudad("Tres Arroyos",400000,5,50000);
        Ciudad c4= new Ciudad("Benito Juarez",300000,5,700);

        Provincia p1 = new Provincia("La Pampa",6);

        Pais pais1 = new Pais("Argentina",1);


        c1.agregarImpuesto(imp1,0);
        c1.agregarImpuesto(imp2,1);
        c1.agregarImpuesto(imp3,2);
        c1.agregarImpuesto(imp4,3);
        c1.agregarImpuesto(imp5,4);

        c2.agregarImpuesto(imp1,0);
        c2.agregarImpuesto(imp2,1);
        c2.agregarImpuesto(imp3,2);
        c2.agregarImpuesto(imp4,3);
        c2.agregarImpuesto(imp5,4);

        c3.agregarImpuesto(imp1,0);
        c3.agregarImpuesto(imp2,1);
        c3.agregarImpuesto(imp3,2);
        c3.agregarImpuesto(imp4,3);
        c3.agregarImpuesto(imp5,4);

        c4.agregarImpuesto(imp1,0);
        c4.agregarImpuesto(imp2,1);
        c4.agregarImpuesto(imp3,2);
        c4.agregarImpuesto(imp4,3);
        c4.agregarImpuesto(imp5,4);

        p1.agregarCiudad(c1,0);
        p1.agregarCiudad(c2,1);
        p1.agregarCiudad(c3,2);
        p1.agregarCiudad(c4,3);

        pais1.agregarProvincia(p1,0);

        //System.out.println(c4.tieneDeficit());
        System.out.println(p1.mitadEnDeficit());
        System.out.println(pais1.ProvinciasEnDeficit());





    }



}
