package TP_9.Ejercicio1;

public class ComparadorEdad extends ComparadorSocio{

    @Override
    public int comparar(Socio s1, Socio s2) {
        return s1.getEdad()-s2.getEdad();
    }
}
