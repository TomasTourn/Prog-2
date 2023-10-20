package TP_8.Ejercicio1;

public class EliminarPalabras implements Plugin {

    private String palabraAeliminar;

    public EliminarPalabras(String palabraAeliminar) {
        this.palabraAeliminar = palabraAeliminar;
    }

    @Override
    public void ejecutar(String texto) {
        String[] palabras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();//creo un nuevo String de palabras;

        for (String p : palabras) {
            if (!p.equals(palabraAeliminar)) {// voy agregando las palabras que no coincidan
                resultado.append(p).append(" ");
            }
        }
       texto=resultado.toString();//texto es reemplazado por el string creado anteriormente
        //hay q revisar si esta bien, dudoso
    }


    


}