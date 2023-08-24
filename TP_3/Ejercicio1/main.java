package TP_3.Ejercicio1;

public class main {

    public static void main(String[] args) {

        //sistema de encuestas

        /*
        clases: compañia-->encuesta-->(pregunta,empleado, persona)

        encuesta:conjunto de preguntas,persona encuestada,empleado
        compañia:guarda las encuestas(array)
        empleado:nombre, encuestasRealizadas
        persona:nombre, documento



        * */

        //ANDA PERO PROBABLEMENTE ESTE MUY MAL IMPLEMENTADO

        Persona p1= new Persona("fran",237232);
        Persona p2= new Persona("lucio",22232354);
        Empleado e1= new Empleado(1,"lulo");
        Formulario f1= new Formulario(1);
        f1.agregarPregunta("que gusto tiene la sal");
        FormularioRespondido fr1 =new FormularioRespondido(p1,1);
        FormularioRespondido fr2 =new FormularioRespondido(p2,1);
        Encuesta ee1= new Encuesta(e1,p1,f1,fr1);
        Encuesta ee2= new Encuesta(e1,p2,f1,fr2);
        Encuesta ee3= new Encuesta(e1,p1,f1,fr1);


        Compania c1= new Compania("fox");
        c1.agregarEmpleado(e1);
        c1.agregarEncuesta(ee1);
        c1.agregarEncuesta(ee2);
        c1.agregarEncuesta(ee3);
        System.out.println(e1.getEncuestasRealizadas());
        System.out.println(c1.cantidadEncuestasEmpleado(e1));





    }

}
