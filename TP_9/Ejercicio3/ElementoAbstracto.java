package TP_9.Ejercicio3;

import java.time.LocalTime;
import java.util.List;

public abstract class ElementoAbstracto {


    public abstract int cantVotosA(Candidato c);

    public abstract int cantEnBlanco();
    public double porcentajeEnBlanco(){//consultar si esta bien o habria q usar recursividad xq no se me ocurre como.
        return ((double) cantEnBlanco()/cantVotos())*100;
    }

    public abstract List<Candidato>getCandidatos();

    public abstract int votosEntre(LocalTime t1,LocalTime t2);
    public double porcentajeEntre(LocalTime t1,LocalTime t2){//lo mismo
        return ((double) votosEntre(t1,t2)/cantVotos())*100;
    }
    public abstract int cantVotos();



}
