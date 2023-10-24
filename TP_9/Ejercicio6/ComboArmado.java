package TP_9.Ejercicio6;

import TP_9.Ejercicio6.Buscadores.Buscador;

import java.util.ArrayList;
import java.util.List;

public class ComboArmado extends ElementoAlquiler{

    private List<ElementoAlquiler>elementos;

    public ComboArmado(int codigo) {
        super(codigo);
        this.elementos = new ArrayList<>();
    }
    public void addElemento(ElementoAlquiler e){
        if(e!=null && !elementos.contains(e))
            elementos.add(e);
    }

    @Override
    public double getValor() {
        int valor=0;
        for (ElementoAlquiler e:elementos) {
            valor+=e.getValor();
        }
        return valor;
    }
    @Override
    public int getAntiguedad(){
        int antiguedad=0;
        for (ElementoAlquiler e:elementos) {
                if (e.getAntiguedad()>antiguedad)
                    antiguedad=e.getAntiguedad();
        }
        return antiguedad;
    }

    @Override
    public double cobrarAlquiler() {
        double costo=0;
        for (ElementoAlquiler e:elementos) {
                costo+=e.cobrarAlquiler();
        }
        return costo;
    }

    @Override
    public List<Elemento> buscarElementos(Buscador b) {
        List<Elemento>elementosBuscados=new ArrayList<>();
        for (ElementoAlquiler e:elementos) {
            elementosBuscados.addAll(e.buscarElementos(b));
        }
        return elementosBuscados;
    }
}
