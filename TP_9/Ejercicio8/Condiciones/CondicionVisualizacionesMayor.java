package TP_9.Ejercicio8.Condiciones;

import TP_9.Ejercicio8.Video;

public class CondicionVisualizacionesMayor implements Condicion{

    private int visualizaciones;

    public CondicionVisualizacionesMayor(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    @Override
    public boolean cumple(Video v) {
        return visualizaciones>v.getVisualizaciones();
    }
}
