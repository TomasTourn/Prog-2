package TP_9.Ejercicio1;

public class ComparadorNegado extends ComparadorSocio{

    private ComparadorSocio comparador;
    @Override
    public int comparar(Socio s1, Socio s2) {
        return -1*comparador.compare(s1,s2);
    }
}
