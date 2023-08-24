package TP_2.Ejercicio1;

public class Temporada {

    private int numeroTemporada;
    private Episodio[] episodios;

    public Temporada(int numeroTemporada,int cantidadEpisodios) {
        this.numeroTemporada = numeroTemporada;
        episodios = new Episodio[cantidadEpisodios];//creo el arreglo con la cantidad de episodios como tamaño
    }

    public Temporada(int numeroTemporada,int cantidadEpisodios,boolean generar){
        this.numeroTemporada=numeroTemporada;
        episodios= new Episodio[cantidadEpisodios];//creo el arreglo con la cantidad de episodios como tamaño


        if(generar){ //agrego episodios genericos
            for (int i=0;i>episodios.length;i++){
                episodios[i]= new Episodio("episodio generico","sjhfsdsf",true,4);
        }

        }
    }

    //metodo para agregar episodios manualmente,pido episodio y posicion

    public void agregarEpisodio(Episodio episodio,int pos){

        if(pos>=0 && pos<episodios.length && episodio != null && episodios[pos]==null){//si cumple las condiciones lo agrego
            episodios[pos]= episodio;
        }

    }
    public void editarEpisodio(Episodio episodio,int pos){

        if(pos>=0 && pos<episodios.length && episodio != null && episodios[pos]!=null){
                episodios[pos]= episodio;
        }

    }

    //Obtener el total episodios vistos de una temporada particular.


    public String mostrarVistos(){
        return "la cantidad de episodios vistos de la temporada "+ this.numeroTemporada+" es: " +this.episodiosVistos();
    }

    public int episodiosVistos(){


        int vistos=0;
        for (int i=0;i<episodios.length;i++){
            if(episodios[i]!=null &&episodios[i].isFlag()){// solo chequeo la calificacion en los episodios que ya fueron agregados
                vistos++;
            }
        }
        return vistos;
    }
    //Obtener el promedio de las calificaciones dadas para una temporada particular.


    public double clasificacionesTemporada(){

        double sumaCalificaciones=0;
        double episodiosCalificados=0;
        for(int i=0;i<episodios.length;i++){
            if(episodios[i]!=null){
                sumaCalificaciones+=episodios[i].getCalificacion();
                episodiosCalificados++;
            }
        }
        return sumaCalificaciones/episodiosCalificados;//promedio
    }

    public int getTotalEpidodios(){
        return episodios.length;
    }

    public String toString(){
        return " Temporada: "+ numeroTemporada + " Episodios: "+ episodios.length;

    }
    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }
}
