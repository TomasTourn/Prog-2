package TP_9.Ejercicio5;

import TP_9.Ejercicio5.Buscadores.Buscador;
import TP_9.Ejercicio5.Calculadores.CalculadorCosto;

import java.util.ArrayList;
import java.util.List;

public class SeguroIntegrador extends ElementoA{

    private List<ElementoA>elementos;

    public SeguroIntegrador(int dni) {
        super(dni);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ElementoA e){
        if(e!=null && !elementos.contains(e)){
            elementos.add(e);
        }
    }

    @Override
    public double getMontoAsegurado() {
        double monto=0;
        for (ElementoA e:elementos) {
                monto+=e.getMontoAsegurado();
        }
        return monto;
    }
    public int getPoliza(){
        int polizaMayor=0;
        for (ElementoA e:elementos) {
                if (e.getPoliza()>polizaMayor)
                    polizaMayor=e.getPoliza();
        }
        return polizaMayor;
    }

    @Override
    public double calcularCostoPoliza() {
        double costoTotal=0;
        for (ElementoA e:elementos) {
                costoTotal+=e.calcularCostoPoliza();
        }
        return costoTotal;
    }

    @Override
    public List<ElementoA> buscarSeguros(Buscador b) {
        List<ElementoA>seguros=new ArrayList<>();
        for (ElementoA e:elementos) {
                seguros.addAll(e.buscarSeguros(b));
        }
        return seguros;
    }
    public String toString(){
        return super.toString()+ " Seguros: "+elementos+"»";
    }

}
