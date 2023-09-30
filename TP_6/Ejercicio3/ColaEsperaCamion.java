package TP_6.Ejercicio3;

public class ColaEsperaCamion extends ColaEspera{

   @Override
   public boolean comparar(Object c1,Object c2){
       return ((Camion)c1).getFechaCarga().isBefore(((Camion)c2).getFechaCarga());
   }



}
