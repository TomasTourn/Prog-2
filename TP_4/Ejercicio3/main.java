package TP_4.Ejercicio3;

public class main {

    /*Sueldos
    *
    * tengo 3 tipos de empleados
    *
    * contratados:salario fijo
    * por horas extras:salario fijo+ horas extra
    * comision:salario fijo+porcentaje por la cantidad de ventas realizadas
    *
    * */


    public static void main(String[] args) {

        Empleado e1= new Empleado("mica",27834384,1000000);
        Empleado e2= new EmpleadoConComision("Dario",2224,70000,500,55);
        Empleado e3= new EmpleadoHorasExtra("Rodri",224959669,200000,14,5000);

        System.out.println(e1.getSueldo());
        System.out.println(e2.getSueldo());
        System.out.println(e3.getSueldo());


    }

}
