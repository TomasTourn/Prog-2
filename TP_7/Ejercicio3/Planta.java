package TP_7.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Planta {

    private String nombreCientifico;
    private List<String> nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private String interiorOexterior;
    private int riego;
    private int sol;
    private static final int maxRiego=10;
    private static final int maxSol=10;

    public Planta(String nombreCientifico, String clasificacionSuperior, String familia, String clase, String interiorOexterior, int riego, int sol) {

        if(riego<=maxRiego && sol<=maxSol){
            this.nombreCientifico = nombreCientifico;
            this.clasificacionSuperior = clasificacionSuperior;
            this.familia = familia;
            this.clase = clase;
            this.interiorOexterior = interiorOexterior;
            this.riego = riego;
            this.sol = sol;
        }

    }

   public void addNombreVulgar(String n){
        if (n!=null && !nombresVulgares.contains(n))
            nombresVulgares.add(n);
   }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public List<String> getNombresVulgares() {
        List<String>copiaNombres=new ArrayList<>();
        copiaNombres.addAll(nombresVulgares);
        return copiaNombres;
    }

    public void setNombresVulgares(List<String> nombresVulgares) {
        this.nombresVulgares = nombresVulgares;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getInteriorOexterior() {
        return interiorOexterior;
    }

    public void setInteriorOexterior(String interiorOexterior) {
        this.interiorOexterior = interiorOexterior;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public String toString(){
        return nombreCientifico+ "\n"+nombresVulgares+"\n"+
                clasificacionSuperior+"\n"+clase+"\n"+interiorOexterior+"\n"+riego+"\n"+sol+"\n";
   }

}


