package TP_9.Ejercicio3;

public class Candidato {

    private String nombre;
    private String partido;
    private String agrupacion;

    public Candidato(String nombre, String partido, String agrupacion) {
        this.nombre = nombre;
        this.partido = partido;
        this.agrupacion = agrupacion;
    }

    public boolean equals(Candidato c){

        try{
            return c.getNombre().equals(nombre)&&c.getPartido().equals(partido)&&c.getAgrupacion().equals(agrupacion);
        }
        catch (Exception e){
            return false;
        }

    }
    public String toString(){
        return "Candidato= "+nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }


}
