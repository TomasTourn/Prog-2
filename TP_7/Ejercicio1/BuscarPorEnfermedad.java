package TP_7.Ejercicio1;

public class BuscarPorEnfermedad extends Buscar {

    private Enfermedad enfermedad;

    public BuscarPorEnfermedad(Enfermedad enfermedad){
        this.enfermedad=enfermedad;
    }
    @Override
    public boolean cumple(ProductoQuimico p){
        if (p.getSintomasQueTrata().containsAll(enfermedad.getSintomas())){
            return true;
        }
        else return false;
    }


}
