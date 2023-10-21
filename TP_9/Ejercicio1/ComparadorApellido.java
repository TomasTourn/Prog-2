package TP_9.Ejercicio1;

public class ComparadorApellido extends ComparadorSocio{

    public ComparadorApellido() {
    }

    public ComparadorApellido(ComparadorSocio siguiente) {
        super(siguiente);
    }

    public int comparar(Socio s1,Socio s2){
        return s1.getApellido().compareTo(s2.getApellido());
    }




}
