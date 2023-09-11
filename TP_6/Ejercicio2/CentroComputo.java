package TP_6.Ejercicio2;

public class CentroComputo {

    private ColaEspera colaComputadoras;
    private ColaEspera colaProcesos;

    public CentroComputo(){//instancio las colas
        colaComputadoras=new ColaEspera();
        colaProcesos=new ColaEspera();
    }


    public void agregarComputadora(Computadora c){
        if(!colaComputadoras.getElementos().contains(c) && c!=null)
        colaComputadoras.agregarElemento(c);
    }
    public void agregarProceso(Proceso p){

        if(colaComputadoras.tieneElementos() && p!=null){
            Computadora libre=(Computadora) colaComputadoras.getSiguiente();
            libre.ejecutarProceso(p);
        }
        else {
            colaProcesos.agregarElemento(p);
        }
    }

    public Computadora getSiguientoComputadora(){
        return (Computadora) colaComputadoras.getSiguiente();
    }

    public Proceso getSiguientoProceso(){
        return (Proceso) colaProcesos.getSiguiente();
    }
}
