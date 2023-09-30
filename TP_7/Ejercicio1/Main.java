package TP_7.Ejercicio1;

public class Main {

    public static void main(String[] args) {

        ProductoQuimico p1= new ProductoQuimico("antiDesidratacion");
        ProductoQuimico p2= new ProductoQuimico("antiDepresivo");
        ProductoQuimico p3= new ProductoQuimico("antiBicho");

        Enfermedad e1= new Enfermedad("hojasTristes");
        Enfermedad e2= new Enfermedad("infeccionBacteriana");

        Cultivo c1= new Cultivo("cereal");
        Cultivo c2= new Cultivo("soja");



        p1.addSintomasQueTrata("a");
        p1.addSintomasQueTrata("b");
        p1.addSintomasQueTrata("c");


        p1.addCultivoDesaconsejado(c1);

        p2.addSintomasQueTrata("s");
        p2.addSintomasQueTrata("b");
        p2.addSintomasQueTrata("z");

        p3.addSintomasQueTrata("a");
        p3.addSintomasQueTrata("b");
        p3.addSintomasQueTrata("c");


        e1.addSintoma("z");
        e1.addSintoma("b");
        e1.addSintoma("a");

        e2.addSintoma("a");
        e2.addSintoma("b");
        e2.addSintoma("c");


        c1.addEnfermedad(e2);
        c1.addEnfermedad(e2);

        EmpresaAgricola emp= new EmpresaAgricola();

        emp.addProducto(p1);
        emp.addProducto(p2);
        emp.addProducto(p3);

        emp.addCultivo(c1);
        emp.addCultivo(c2);



        System.out.println(emp.buscar(new BuscarPorEnfermedad(e2)));

        System.out.println(emp.buscar(new BuscarPorCultivoYenfermedad(c1,e2)));

    }

}
