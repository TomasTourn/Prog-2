package JuegoDados;

public class Dado {

    private int cantidadCaras;
    private int ultimoValor;

    public Dado(){
        this(6);
    }
    public Dado(int cantidadCaras){
        this.cantidadCaras=cantidadCaras;
        ultimoValor=this.tirar();
    }

    public int UltimoValor(){
        return ultimoValor;
    }

    public int getCantidadCaras() {
        return cantidadCaras;
    }

    public void setCantidadCaras(int cantidadCaras) {
        this.cantidadCaras = cantidadCaras;
    }

    public  int tirar(){
        ultimoValor=(int)(Math.random()*cantidadCaras)+1;
        return ultimoValor;
    }
}
