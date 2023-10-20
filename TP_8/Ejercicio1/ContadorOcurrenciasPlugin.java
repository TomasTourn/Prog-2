package TP_8.Ejercicio1;

public class ContadorOcurrenciasPlugin implements Plugin{

    private int cantVeces;
    private String palabra;

    public ContadorOcurrenciasPlugin(String palabra) {
        this.cantVeces = 0;
        this.palabra = palabra;
    }

    @Override
    public void ejecutar(String texto) {
        String []palabras=texto.split(" ");

        for (String p:palabras) {
            if (p.equalsIgnoreCase(palabra)){
                cantVeces++;
            }
        }
    }
    public int getCantVeces() {
        return cantVeces;
    }

    public String getPalabra() {
        return palabra;
    }
}
