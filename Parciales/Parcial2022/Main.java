package Parciales.Parcial2022;

import Parciales.Parcial2022.Buscadores.*;
import TP_9.SistemaArchivos.Buscadores.BuscadorCompuesto;

public class Main { 
    public static void main(String[] args) {

        /*Sistema De Noticias

              patron composite
                 ElementoPE(clase componente)
                    Coleccion(clase compuesta),engloba Grupo,Subgrupo,Seccion,Subseccion
                            Noticia(clase simple)
                                Atributos en comun:palabrasClave,categoria*/


            Coleccion seccion =new Coleccion(4);
            Coleccion subSeccion =new Coleccion(4);
            Coleccion grupo = new Coleccion(5);
            Coleccion subGrupo = new Coleccion(5);

            Noticia n1= new Noticia("deportes","otra vez rompiendo records con la seleccion","messi es el mas grande","jose");
            Noticia n2= new Noticia("politica","nadie lo esperaba, massa arriba","milei y massa al balotage","maria");
            Noticia n3= new Noticia("tecnologia","vale la pena?","nuevo iphone 15","alberto");
            Noticia n4= new Noticia("tecnologia","la mejora respecto a la gen anterior es...","intel la rompe con el i9 14900k","jose");
            Noticia n5= new Noticia("deportes","por penales pero se gana","boquita gana la septima","maria");
            Noticia n6= new Noticia("economia","economistas aseguran que se acerca la hiper","se viene la hiper","maria");
            Noticia n7= new Noticia("youtube","el youtuber mrBeast","mrBeast estrello un avion","alberto");
            Noticia n8= new Noticia("juegos","el nuevo souls","lotf es un gran soulslike","jose");
            Noticia n9= new Noticia("juegos","parche de cyberpunk","phantom liberty es el mejor dlc de la historia","maria");
            Noticia n10= new Noticia("series","la serie aclamada por la critica vuelve en 2024","the boys season 4 fecha de estreno","alberto");


            //palabras claves a las noticias
            n1.addPalabraClave("futbol");
            n1.addPalabraClave("10");
            n2.addPalabraClave("leon");
            n2.addPalabraClave("libertad");
            n3.addPalabraClave("apple");
            n3.addPalabraClave("camara");
            n4.addPalabraClave("procesador");
            n4.addPalabraClave("pc");
            n5.addPalabraClave("bombonera");
            n6.addPalabraClave("dolar");
            n7.addPalabraClave("internet");
            n8.addPalabraClave("steam");
            n9.addPalabraClave("xbox");
            n10.addPalabraClave("prime");



            //agregacion de colecciones y noticias
            grupo.addElemento(n1);
            grupo.addElemento(subGrupo);
            subGrupo.addElemento(n2);
            subGrupo.addElemento(n3);
            subGrupo.addElemento(n4);



            seccion.addElemento(n5);
            seccion.addElemento(subSeccion);
            subSeccion.addElemento(n6);
            subSeccion.addElemento(n7);
            subSeccion.addElemento(n8);
            subSeccion.addElemento(n9);//juegos
            subSeccion.addElemento(n10);//series


            //buscadores
            Buscador buscTitulo=new BuscadorTituloContiene("messi");
            Buscador buscTexto=new BuscadorTextoContiene("cyberpunk");
            Buscador buscCategoria=new BuscadorCategoria("deportes");
            Buscador buscAutor=new BuscadorAutor("jose");
            Buscador buscAnd=new BuscadorAnd(buscAutor,buscTitulo);


            //agregador de palabras,agrega una lista de palabras a la noticia/s q cumpla con la condicion

            AgregadorPalabras ag= new AgregadorPalabras(buscTexto);
            ag.addPalabra("johnny silverhand");
            ag.addPalabra("judy alvarez");
            seccion.agregarPalabra(ag);

            System.out.println("traigo las palabras clave de cyberpunk (al q le agregue)");
            System.out.println(n9.getPalabrasClave());

            System.out.println("noticias por titulo");
            System.out.println(grupo.buscarNoticias(buscTitulo));

            System.out.println("categoria de subseccion");
            System.out.println(subSeccion.getCategoria());
            System.out.println("palabras clave de subseccion");
            System.out.println(subSeccion.getPalabrasClave());
            System.out.println("categoria de seccion");
            System.out.println(seccion.getCategoria());


    }
}
