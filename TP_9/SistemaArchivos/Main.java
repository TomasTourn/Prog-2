package TP_9.SistemaArchivos;

import TP_9.SistemaArchivos.Buscadores.*;
import TP_9.SistemaArchivos.Comparadores.ComparadorElemento;
import TP_9.SistemaArchivos.Comparadores.ComparadorNegado;
import TP_9.SistemaArchivos.Comparadores.ComparadorNombre;
import TP_9.SistemaArchivos.Comparadores.ComparadorTamanio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Carpeta raiz =new Carpeta("raiz");

        Carpeta sistemas = new Carpeta("Sistemas");

        Carpeta anio1 = new Carpeta("1er anio");
        Carpeta anio2 = new Carpeta("2do anio");
        Carpeta anio3 = new Carpeta("3er anio");
        Carpeta poo = new Carpeta("POO");

        Carpeta fotos= new Carpeta("Fotos");
        Carpeta mascotas= new Carpeta("Mascotas");
        Carpeta paisajes= new Carpeta("Paisajes");

        raiz.addElemento(sistemas);
        raiz.addElemento(fotos);

        sistemas.addElemento(anio1);
        sistemas.addElemento(anio2);
        sistemas.addElemento(anio3);
        sistemas.addElemento(poo);

        fotos.addElemento(mascotas);
        fotos.addElemento(paisajes);


        Archivo parcialPOO = new Archivo("parcial","doc",50);
        Archivo recuPOO = new Archivo("recu","pdf",50);
        Archivo prefinalPOO = new Archivo("prefinal","doc",50);

        poo.addElemento(parcialPOO);
        poo.addElemento(recuPOO);
        poo.addElemento(prefinalPOO);

        Archivo correlativas= new Archivo("correlativas","xls",120);
        sistemas.addElemento(correlativas);

        Archivo gatito= new Archivo("gatito","png",2000);
        Archivo perrito= new Archivo("perrito","png",2000);
        Archivo caballito= new Archivo("caballito","png",2000);

        mascotas.addElemento(gatito);
        mascotas.addElemento(perrito);
        mascotas.addElemento(caballito);

        Archivo montanias= new Archivo("montanias","png",2200);
        Archivo lago= new Archivo("lago","png",2200);
        Archivo rio= new Archivo("rio","png",3000);
        Archivo bosque= new Archivo("bosque","png",1500);

        paisajes.addElemento(montanias);
        paisajes.addElemento(lago);
        paisajes.addElemento(rio);
        paisajes.addElemento(bosque);

        AccesoDirecto accesoPrefinalPOO= new AccesoDirecto(prefinalPOO);
        raiz.addElemento(accesoPrefinalPOO);

       // System.out.println(raiz);
        //System.out.println(paisajes.getPath());

        //buscadores

        Buscador nombre= new BuscadorNombreContiene("p");
        Buscador fecha= new BuscadorFechaAnterior(LocalDate.of(2020,3,15));
        Buscador fechaYnombre=new BuscadorCompuesto(fecha,nombre);


        //comparadores

        ComparadorElemento compNombre=new ComparadorNombre();
        ComparadorElemento compNegador=new ComparadorNegado(compNombre);
        ComparadorElemento compTamanio= new ComparadorTamanio();

        //pruebas

        //System.out.println(raiz.buscarElementos(fechaYnombre,compNegador));
        System.out.println(raiz.buscarElementos(fechaYnombre,compTamanio));




    }


}
