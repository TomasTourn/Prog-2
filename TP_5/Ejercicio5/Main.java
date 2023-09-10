package TP_5.Ejercicio5;

public class Main {

    public static void main(String[] args) {
        /*Facturacion de Empleados
        *
        * clase empresa con arreglo empleados
        *
        *
        *
        * clase empleado
        * tiene arreglo de ventas
        *
        * clases hijas empleadoConExtra y empleadoConBono
        *
        * clase venta para poder sumar el monto total de las ventas
        * */

        Empleado e1= new Empleado("juan","gomez",2342432,10000);
        EmpleadoConExtra ec1= new EmpleadoConExtra("juan","gomez",2342432,10000,0.05);
        EmpleadoConBono ecb1= new EmpleadoConBono("juan","gomez",2342432,10000,0.05,600,3);

        Venta v1= new Venta(1,5000);
        Venta v2= new Venta(2,3000);
        Venta v3= new Venta(3,50000);


        ec1.agregarVenta(v1);
        ec1.agregarVenta(v2);
        ec1.agregarVenta(v3);

        ecb1.agregarVenta(v1);
        ecb1.agregarVenta(v2);
        ecb1.agregarVenta(v3);


        System.out.println("empleado normal");
        System.out.println(e1.getSueldo());
        System.out.println("--------------------");
        System.out.println("empleado con extra");
        System.out.println(ec1.getSueldo());
        System.out.println("--------------------");
        System.out.println("empleado con extra y bono");
        System.out.println(ecb1.getSueldo());
    }

}
