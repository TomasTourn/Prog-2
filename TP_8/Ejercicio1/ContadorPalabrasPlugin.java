package TP_8.Ejercicio1;

public class ContadorPalabrasPlugin implements Plugin{

    private int cantPalabras;
    @Override
    public void ejecutar(String texto) {
        String []palabras=texto.split(" ");
        cantPalabras=palabras.length;
    }
    public int getCantPalabras(){
        return cantPalabras;
    }
}
