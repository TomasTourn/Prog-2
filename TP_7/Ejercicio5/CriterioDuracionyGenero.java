package TP_7.Ejercicio5;

public class CriterioDuracionyGenero extends CriterioRentabilidad{

    private int duracion;

    public CriterioDuracionyGenero(int duracion){
        super();
        this.duracion=duracion;
    }

    @Override
    public boolean esRentable(Pelicula p) {

        boolean generoNoDeseado=false;
        for (String g:getGeneros()) {
            if(p.getGeneros().contains(g))
                generoNoDeseado=true;
        }

        if(duracion < 120 && !generoNoDeseado) {
            return true;
        }else return false;
    }
}
