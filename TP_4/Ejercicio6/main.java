package TP_4.Ejercicio6;

import java.time.LocalDate;

public class main {

    /*
    * clase persona con atributos en comun
    * hijas serian empleado,usuariofinal,jerarquico(tiene una lista de empleados a cargo)
    *
    * una clase de empresa que tenga un array con los empleados para recorrerlos y llamar a el metodo toString de cada uno de ellos
    *
    * */

    public static void main(String[] args) {
        Jerarquico j1= new Jerarquico("alex","gonzales", LocalDate.of(2000,2,22),22,200000);
        Empleado e1= new Empleado("jose","perez", LocalDate.of(1900,6,22),22,200000);
        Empleado e2= new Empleado("fransico","robert", LocalDate.of(2000,7,22),22,200000);
        Empleado e3= new Empleado("luciano","diaz", LocalDate.of(2000,8,22),22,200000);
       // System.out.println(j1);
       // System.out.println("-------------------");
        j1.agregarEmpleado(e1);
        j1.agregarEmpleado(e2);
        j1.agregarEmpleado(e3);
       // System.out.println(j1);

        RegistroEmpresa r= new RegistroEmpresa();
        r.agregarPersonal(j1);
        r.agregarPersonal(e1);
        r.agregarPersonal(e2);
        r.agregarPersonal(e3);
        System.out.println(r);
    }

}
