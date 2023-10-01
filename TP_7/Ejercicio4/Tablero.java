package TP_7.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

    private int puntajeMinimo;
    private List<Ficha> fichas;
    private int dificultad;

    public Tablero(int puntajeMinimo){
        this.puntajeMinimo=puntajeMinimo;
        fichas=new ArrayList<>();
        dificultad=getDificultad();
    }

    public int getDificultad(){

        int fortalezaTotal=0;
        int poderTotal=0;

        for (Ficha f:fichas) {
           fortalezaTotal+=f.getFortaleza();
           poderTotal+=f.getPoderDestruccion();
        }
        return fortalezaTotal/poderTotal;//calculo la dificultad
    }


}
