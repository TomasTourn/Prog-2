package JuegoDados;

public class DadoCargado extends Dado{

    private int ladoCargado;
    private double probabilidad;

    public DadoCargado(int cantCaras,int ladoCargado,double probabilidad){
        super(cantCaras);
        this.ladoCargado=ladoCargado;
        this.probabilidad=probabilidad;
    }

    @Override
    public int tirar(){

        if(Math.random()>probabilidad){
            return super.tirar();
        }
        else {
            return ladoCargado;
        }

    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    public int getLadoCargado() {
        return ladoCargado;
    }

    public void setLadoCargado(int ladoCargado) {
        this.ladoCargado = ladoCargado;
    }
}
