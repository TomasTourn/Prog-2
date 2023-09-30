package TP_7.Ejercicio1;

public class BuscarPorCultivoYenfermedad extends Buscar{


    private Cultivo c;
    private Enfermedad e;

    public BuscarPorCultivoYenfermedad(Cultivo c,Enfermedad e){
        this.c=c;
        this.e=e;
    }


    @Override
    public boolean cumple(ProductoQuimico p){
        return (!p.getCultivosDesaconsejados().contains(c) && p.getSintomasQueTrata().containsAll(e.getSintomas()));
    }




}
