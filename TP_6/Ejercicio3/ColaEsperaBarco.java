package TP_6.Ejercicio3;

public class ColaEsperaBarco extends ColaEspera{

    public boolean comparar(Object b1,Object b2){
        return ((Barco)b1).getCapacidad()>((Barco)b2).getCapacidad();
    }




}
