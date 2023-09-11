package TP_6.Ejercicio2;

public class Proceso extends  Elemento{

    private double memoriaRequerida;

    public Proceso(double memoriaRequerida){
        this.memoriaRequerida=memoriaRequerida;
    }

    @Override
    public boolean esMayor(Elemento e){
        Proceso p= (Proceso) e;
        return this.getMemoriaRequerida()>p.getMemoriaRequerida();
    }

    public double getMemoriaRequerida() {
        return memoriaRequerida;
    }

    public void setMemoriaRequerida(double memoriaRequerida) {
        this.memoriaRequerida = memoriaRequerida;
    }
}
