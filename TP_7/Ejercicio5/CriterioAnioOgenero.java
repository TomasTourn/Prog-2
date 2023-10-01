package TP_7.Ejercicio5;

public class CriterioAnioOgenero extends CriterioRentabilidad{

    private int anioEstreno;
    public CriterioAnioOgenero(int anioEstreno) {
        super();
        this.anioEstreno=anioEstreno;
    }

    @Override
    public boolean esRentable(Pelicula p) {

        if (p.getAnioEstreno() > anioEstreno) {//si salio despues del año de estreno minimo es rentable
            return true;
        } else if (p.getGeneros().containsAll(getGeneros())) {// sino chequeo q tenga los generos requeridos
            return true;
        } else
            return false;
    }
}
