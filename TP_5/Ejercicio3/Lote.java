package TP_5.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Lote {


    private int numeroLote;
    private int hectareas;
    private List<String> minerales;
    private boolean especial;

    public Lote(int numeroLote, int hectareas) {
        this.numeroLote = numeroLote;
        this.hectareas = hectareas;
        minerales = new ArrayList<String>();
    }

    public void agregarMineral(String mineral) {
        if (!minerales.contains(mineral)) {
            minerales.add(mineral.toLowerCase());
        }
    }

    public boolean aptoSiembra(Cereal c){
        return c.sePuedeSembrarEn(this);
    }
    public boolean equals(Object o){
        Lote lote=(Lote)o;//casteo

        try{
            return lote.numeroLote==this.numeroLote;
        }catch (Exception e){
            return false;
        }
    }
    public List<String> getMinerales() {
        return minerales;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public int getHectareas() {
        return hectareas;
    }

    public void setHectareas(int hectareas) {
        this.hectareas = hectareas;
    }
}
