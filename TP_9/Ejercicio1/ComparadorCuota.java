package TP_9.Ejercicio1;

public class ComparadorCuota extends ComparadorSocio{
    public ComparadorCuota() {
    }

    public ComparadorCuota(ComparadorSocio siguiente) {
        super(siguiente);
    }

    @Override
    public int comparar(Socio s1, Socio s2) {
     return -Boolean.compare(s1.isCuotaPaga(),s2.isCuotaPaga());//forma mas optimizada, hay q negar el resultado porque sino interpreta q el falso es menor al true y nosotros queremos ordenar primero los true

     /* if(s1.isCuotaPaga() && !s2.isCuotaPaga()){//si el primero pago retorno negativo para ordenarlo antes
            return -1;
        }else if(!s1.isCuotaPaga() && s2.isCuotaPaga()){
            return 1;
        }
        else return 0;
    }*/


    }
}








