package TP_2.Ejercicio1;

public class Episodio {


    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calificacion;


    public Episodio(String titulo,String descripcion,boolean flag,int calificacion){

        this.setTitulo(titulo);
        this.setDescripcion(descripcion);
        this.setFlag(flag);

        if(calificacion >0 && calificacion<6){//si la clasificacion esta entre 1 y 5
            if(flag){//si flag es true
                this.setCalificacion(calificacion);
            }else {
                this.setCalificacion(-1);
            }
        }
        else {
            this.calificacionInvalida();
        }

    }

    public void calificacionInvalida(){// por que no anda si quiero retornar un string?

      System.out.println("la calificion debe ser entre 1 y 5");
      // return "la calificion debe ser entre 1 y 5";
    }

    public String toString(){
        return " titulo: "+titulo + "\n descripcion: "+descripcion+ "\n visto: " +flag+ "\n calificacion: " +calificacion;

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

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if(flag){
            this.calificacion = calificacion;
        }else{
            this.calificacion=-1;
        }

    }
}
