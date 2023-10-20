package TP_8.Ejercicio1;

public class ProcesadorTexto {

    private String texto;

    public ProcesadorTexto(String texto){
        this.texto=texto;
    }
    public void EjecutarPlugin(Plugin p){
        p.ejecutar(texto);
    }


}
