package TP_9.Ejercicio1;

public class ComparadorNombre extends ComparadorSocio{

    public ComparadorNombre() {
    }

    public ComparadorNombre(ComparadorSocio siguiente) {
        super(siguiente);
    }

    public int comparar(Socio s1,Socio s2){
       return s1.getNombre().compareTo(s2.getNombre());
    }

}
