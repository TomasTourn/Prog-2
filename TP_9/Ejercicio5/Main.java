package TP_9.Ejercicio5;

import TP_9.Ejercicio5.Buscadores.BuscadorDescripcionContiene;
import TP_9.Ejercicio5.Calculadores.CalculadorCompuesto;
import TP_9.Ejercicio5.Calculadores.CalculadorCosto;
import TP_9.Ejercicio5.Calculadores.CalculadorMontoFijo;
import TP_9.Ejercicio5.Calculadores.CalculadorPorcentaje;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        /*Aseguradora
        *   ElementoA(clase abstracta)
        *       SeguroIntegrador(claseCompuesta)
        *           Seguro(clase simple)
        *             SeguroTemporal(simple hija de seguro)
        *
        *
        *   abstracta CalculadorCosto
        *       calculadorPorcentaje
        *       calculadorMontoFijo
        *       calculadorCompuesto
        *       etc.
        *
        * */

        SeguroIntegrador segIntegrador =new SeguroIntegrador(43542315);

        CalculadorPorcentaje cPorcentaje= new CalculadorPorcentaje(10);
        CalculadorMontoFijo cMontoFijo=new CalculadorMontoFijo(20000);
        CalculadorCompuesto cCompuesto=new CalculadorCompuesto(cMontoFijo,cPorcentaje);

        Seguro sMedico=new Seguro(43542315,23233,"cubre todo",100000,cPorcentaje);
        Seguro sHogar=new Seguro(43542315,99243421,"electrodomesticos",90000,cMontoFijo);
        Seguro sAuto1=new Seguro(43542315,644462,"todo riesgo",40000,cCompuesto);
        Seguro sAuto2=new Seguro(40559113,110942,"todo riesgo",70000,cCompuesto);
        Seguro sMedico2=new Seguro(40559113,8896758,"operaciones",100000,cPorcentaje);
        SeguroTemporal sTemporal=new SeguroTemporal(40559113,223333,"muebles",300000,cCompuesto, LocalDate.of(2023,9,27),LocalDate.of(2023,10,27));

        segIntegrador.addElemento(sMedico);
        segIntegrador.addElemento(sHogar);
        segIntegrador.addElemento(sAuto1);
        segIntegrador.addElemento(sAuto2);
        segIntegrador.addElemento(sMedico2);
        segIntegrador.addElemento(sTemporal);

        System.out.println("poliza del seguro integrador");
        System.out.println(segIntegrador.getPoliza());
        System.out.println("monto asegurado total");
        System.out.println(segIntegrador.getMontoAsegurado());

        //System.out.println(segIntegrador);

        //System.out.println(sHogar);

        System.out.println("costo de poliza");
        System.out.println(sTemporal.calcularCostoPoliza());

        System.out.println(segIntegrador.buscarSeguros(new BuscadorDescripcionContiene("todo")));
    }
}
