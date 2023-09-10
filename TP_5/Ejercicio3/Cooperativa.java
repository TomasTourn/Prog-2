package TP_5.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Cooperativa {

    private String nombre;
    private List<Lote>lotes;
    private List<Cereal>cereales;
    private List<String>mineralesPrimarios;

    public Cooperativa(String nombre){
        this.nombre=nombre;
        lotes=new ArrayList<>();
        cereales=new ArrayList<>();
        mineralesPrimarios=new ArrayList<>();
    }

    public boolean esEspecial(Lote l){
        for (String m:mineralesPrimarios) {
            if(l.getMinerales().contains(m)){//con que tenga uno ya devuelve true
                return true;
            }
        }
        return false;
    }

    public void agregarMineralPrimario(String m){
        if(!mineralesPrimarios.contains(m)){
            mineralesPrimarios.add(m);
        }
    }

    public void agregarLote(Lote l){
        if(!lotes.contains(l))
            lotes.add(l);
    }
    public void agregarCereal(Cereal c){
        if(!cereales.contains(c))
            cereales.add(c);
    }


    public List LotesParaCereal(Cereal c){
        List<Lote>lotesUtilizables=new ArrayList<>();

        for (Lote l:lotes) {
            if(c.sePuedeSembrarEn(l)){
                lotesUtilizables.add(l);
            }
        }
        return lotesUtilizables;
    }

}
