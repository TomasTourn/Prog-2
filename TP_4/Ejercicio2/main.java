package TP_4.Ejercicio2;

public class main {

    /* alarma sensorial
            en vez de atributos voy a tener objetos que monitorean una zona de la casa en especifico
            hacer un add para los sensores
            comprobar hace sonar el timbre e imprime por pantalla el nombre del sensor o sensores en conflicto

           deberia hacer un arreglo de sensores? asi la comprobacion no se tiene que modificar aunque agregue sensores
    * */


    public static void main(String[] args) {

        Sensor s1=new Sensor("cocina");
        Sensor s2=new Sensor("patio");
        Sensor s3=new Sensor("habitacion 1");
        Sensor s4=new Sensor("living");

        Timbre t1= new Timbre();

        Alarma a1= new Alarma(t1);
        a1.agregarSensor(s1);
        a1.agregarSensor(s2);
        a1.agregarSensor(s3);
        a1.agregarSensor(s4);

        s1.setIntruso(true);
        s3.setIntruso(true);

        a1.comprobar();
    }



}
