package TP_8.Ejercicio1;

public class ReemplazoTextoPlugin implements Plugin{

    private String palabraAReemplazar;
    private String palabraNueva;

    public ReemplazoTextoPlugin(String palabraAReemplazar,String palabraNueva) {
        this.palabraAReemplazar = palabraAReemplazar;
        this.palabraNueva=palabraNueva;
    }

    @Override
    public void ejecutar(String texto) {
        String []palabras=texto.split(" ");

       // texto.replace(palabraAReemplazar,palabraNueva); se supone q hace lo mismo q el while


        int i=0;
        int reemplazados=0;
        while (i<palabras.length && reemplazados<1){

                if(palabras[i].equalsIgnoreCase(palabraAReemplazar)){
                    palabras[i]=palabraNueva;
                    reemplazados++;
          }
            i++;
        }

    }
}
