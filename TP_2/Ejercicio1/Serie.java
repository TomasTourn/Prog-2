package TP_2.Ejercicio1;

public class Serie {

    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private Temporada[]temporadas;
    private int cantTemporadas;




    public Serie(String titulo,String descripcion,String creador,String genero,int cantTemporadas){

        this.setTitulo(titulo);
        this.setDescripcion(descripcion);
        this.setCreador(creador);
        this.setGenero(genero);
        this.setCantTemporadas(cantTemporadas);
        this.temporadas  = new Temporada[cantTemporadas];


    }

    public Serie(String titulo,String descripcion,String creador,String genero,int cantTemporadas,boolean agregar){

        this.setTitulo(titulo);
        this.setDescripcion(descripcion);
        this.setCreador(creador);
        this.setGenero(genero);
        this.setCantTemporadas(cantTemporadas);
        this.temporadas  = new Temporada[cantTemporadas];

        if(agregar){
            for (int i=0;i<temporadas.length;i++){
                this.temporadas[i]=new Temporada(i,8);//creo temporadas genericas
            }
        }

    }

    public void agregarTemporada(Temporada temporada,int pos){
        if(pos>=0 && pos<this.cantTemporadas && temporada != null && temporadas[pos]== null){
            temporadas[pos]=temporada;
        }
    }

    //Obtener el total de episodios vistos de una serie.

    public String TotalEpVistos(){
        int totalVistos=0;
        for (int i=0;i<temporadas.length;i++){
            if(temporadas[i]!=null) {
                totalVistos += temporadas[i].episodiosVistos();
            }
        }
        return "la cantidad de episodios vistos en la serie " +this.titulo+" es: " + totalVistos;
    }

    //Obtener el promedio de las calificaciones dadas para una serie.

    public double ClasificacionSerie(){
        int sumaClasificacion=0;
        int temporadasCalificadas=0;

        for(int i=0;i<temporadas.length;i++){
                sumaClasificacion+=temporadas[i].clasificacionesTemporada();
                temporadasCalificadas++;
        }
        return sumaClasificacion/temporadasCalificadas;
    }
    //Determinar si se vio todos los episodios de la serie.

    public boolean todoVisto(){

        int cantTotal=0;
        int cantVisto=0;

        for (int i=0;i<temporadas.length;i++){
            cantTotal+=temporadas[i].getTotalEpidodios();
            cantVisto+=temporadas[i].episodiosVistos();
        }
        return cantTotal == cantVisto;

    }

    public String toString(){
        return " titulo: "+titulo + "\n descripcion: "+descripcion+ "\n genero: " +genero+ "\n calificacion: " +" temporadas: "+temporadas.length;

    }

    public int getCantTemporadas() {
        return cantTemporadas;
    }

    public void setCantTemporadas(int cantTemporadas) {
        this.cantTemporadas = cantTemporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        genero = genero;
    }

}
