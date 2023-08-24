package TP_2.Ejercicio1;

import javax.crypto.spec.PSource;

public class main {

    public static void main(String[] args) {
        //concepto
    /*
    Serie tiene temporadas dentro y los atributos de serie son titulo,descripcion,creador,genero

    cada Temporada tiene una cantidad de episodios

    cada Episodio tiene un titulo,descripcion,flag (boolean), y calificacion de uno a cinco

    si un episodio no fue visto la calificacion es negativa

   */

        Episodio ep1= new Episodio("amanecer","el comienzo de la historia",true,5);
        Episodio ep2= new Episodio("atardecer","nudo",true,5);
        Episodio ep3= new Episodio("anochecer","descenlase",true,3);
        Episodio ep4= new Episodio("anochecer","descenlase",true,3);
        Temporada t1 = new Temporada(1,4);

        Temporada t2 = new Temporada(2,2);

        Episodio ep1t2= new Episodio("jfkldsj","fdfdfdsfsd",true,5);
        Episodio ep2t2= new Episodio("jfk3434343dsj","kykykykyk",true,5);

        Serie s1 = new Serie("el dia completo","que pasa en un dia?","scorsese","aventura",2);





            //agrego episodios a la temporada, paso objero episodio y posicion
            t1.agregarEpisodio(ep1,0);
            t1.agregarEpisodio(ep2,1);
            t1.agregarEpisodio(ep3,2);
            t1.agregarEpisodio(ep4,3);

             t2.agregarEpisodio(ep1t2,0);
             t2.agregarEpisodio(ep2t2,1);

            //agrego temporada a la serie
            s1.agregarTemporada(t1,0);
            s1.agregarTemporada(t2,1);



        //System.out.println(t1.episodiosVistos());
        System.out.println(s1.TotalEpVistos());
        System.out.println(t2.mostrarVistos());
        System.out.println(t1.clasificacionesTemporada());
        System.out.println(s1.ClasificacionSerie());
        System.out.println(s1.todoVisto());// anda pero tiene en cuenta los episodios vacios


    }





}
