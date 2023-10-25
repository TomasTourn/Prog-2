package TP_9.Ejercicio6;

import TP_9.Ejercicio6.Buscadores.Buscador;
import TP_9.Ejercicio6.Calculadores.CobradorAlquiler;
import TP_9.Ejercicio6.Calculadores.CalculadorValor;

import java.util.ArrayList;
import java.util.List;

public class ElementoDeprecated extends Elemento{

    private int mesObsoleto;
    private CalculadorValor calculador;
    private double divisorDeprecado;

    public ElementoDeprecated(int codigo, int mesesAntiguedad, double valor, String descripcion, CobradorAlquiler cobradorAlquiler, int mesObsoleto, CalculadorValor calculador, double divisorDeprecado) {
        super(codigo, mesesAntiguedad, valor, descripcion, cobradorAlquiler);
        this.mesObsoleto = mesObsoleto;
        this.calculador = calculador;
        this.divisorDeprecado = divisorDeprecado;
    }

    public double getDivisorDeprecado() {
        return divisorDeprecado;
    }

    public void setDivisorDeprecado(double divisorDeprecado) {
        this.divisorDeprecado = divisorDeprecado;
    }

    @Override
    public double cobrarAlquiler() {
        if (deprecado())
            return cobrarAlquiler()/divisorDeprecado;
        else
            return super.cobrarAlquiler();
    }

    public boolean deprecado(){//chequeo si esta dreprecado o no
        return mesObsoleto >= super.getAntiguedad();
    }
    @Override
    public List<Elemento> buscarElementos(Buscador b) {
        List<Elemento>elemento=new ArrayList<>();
        if(!deprecado()){//si no esta deprecado lo busco
            if (b.cumple(this))
                elemento.add(this);
        }
         return elemento;
    }

    public double getValor(){
        if (deprecado())//si esta deprecado la forma de calcula cambia
            return calculador.calcular(super.getValor());
        else
            return super.getValor();
    }
    public int getMesObsoleto() {
        return mesObsoleto;
    }

    public void setMesObsoleto(int mesObsoleto) {
        this.mesObsoleto = mesObsoleto;
    }

    public CalculadorValor getCalculador() {
        return calculador;
    }

    public void setCalculador(CalculadorValor calculador) {
        this.calculador = calculador;
    }
}
