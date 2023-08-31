package TP_4.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Alarma {


    private List<Sensor>sensores;
    protected Timbre timbre;// protected para poder llamarlo en alarmaluminosa


    public Alarma(Timbre timbre){
        this.timbre=timbre;
        this.sensores=new ArrayList<Sensor>();
    }

    public void agregarSensor(Sensor s){
        if(s!=null)
            sensores.add(s);
    }



    public void comprobar(){// tengo que recorrer el arreglo,ver si hay areas en peligro y devolver los nombres;

        boolean peligro=false;

        for (Sensor s:sensores) {

            if(s.isIntruso()){
                peligro=true;
                System.out.println("zona en peligro: "+s.getZonaControl());
            }

        }
        if(peligro){
            timbre.hacerSonar();
        }
    }


}
