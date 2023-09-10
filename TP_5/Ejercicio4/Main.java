package TP_5.Ejercicio4;

public class Main {

    /*control de gasto publico
    *
    *
    *
    * */
    public static void main(String[] args) {
        Ciudad c1= new Ciudad("Bahia",20000);
        Contribuyente co1= new Contribuyente("hh",1,500);
        ContribuyenteFacturador cf1= new ContribuyenteFacturador("Programador",2,600,3000,0.2,0.02);
        ContribuyenteFacturador cf2= new ContribuyenteFacturador("Comerciante",2,400,4000,0.5,0.035);

        c1.agregarContribuyente(co1);
        c1.agregarContribuyente(cf1);
        c1.agregarContribuyente(cf2);

        System.out.println(cf1.getImpuesto());
        System.out.println(c1.tieneDeficit());
    }
}
