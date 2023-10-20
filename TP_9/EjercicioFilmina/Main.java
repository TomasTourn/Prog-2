package TP_9.EjercicioFilmina;

public class Main {


    /*

       clase abstracta elementoEmpresa, va a ser el padre abstracto y todos van extender de el(componente)

       clase equipo, basicamente junto las 3 clases en 1(compuesto)

        un compuesto generalmente tiene otros compuestos dentro o elementos simples, todos son de tipo componente

        clase empleado tiene sueldo y especialidad.(simple)
    *
    *
    * */
    public static void main(String[] args) {
        Equipo g1=new Equipo("grupo 1");
        Equipo g2=new Equipo("grupo 2");
        Equipo g3=new Equipo("grupo 3");

        Equipo s1=new Equipo("Sucursal Arg");
        Equipo s2=new Equipo("Sucursal Esp");

        Empleado e1= new Empleado("mikela",3000000,"java");
        Empleado e2= new Empleado("lulo",3000000,"js");
        Empleado e3= new Empleado("lucio",3000000,"css");
        Empleado e4= new Empleado("luciano",3000000,"css");
        Empleado e5= new Empleado("fran",3000000,"java");
        Empleado e6= new Empleado("santi",3000000,"java");
        Empleado e7= new Empleado("marcos",3000000,"java");
        Empleado e8= new Empleado("sdfdsfds",3000000,"java");

        Equipo empresa= new Equipo("Globant");


        g1.addElemento(e1);//java
        g1.addElemento(e2);//js
        g1.addElemento(e6);//java


        g2.addElemento(e8);//java
        g2.addElemento(e4);//css
        g2.addElemento(e3);//css


        g3.addElemento(e5);//java
        g3.addElemento(e7);//java




        s1.addElemento(g1);
        s1.addElemento(g2);

        s2.addElemento(g2);
        s2.addElemento(g3);


        empresa.addElemento(s1);
        empresa.addElemento(s2);

        System.out.println(empresa.cantEmpleadosxEspecialidad("js"));

        System.out.println(s2.getEspecialidad());// cambia dependiendo el orden de agregado, no tiene sentido.

        System.out.println(empresa.empleadosPorEspecialidad("java"));

    }







}
