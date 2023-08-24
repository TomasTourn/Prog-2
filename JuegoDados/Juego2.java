package JuegoDados;

public class Juego2 {

    private Jugador jugador1;
    private Jugador jugador2;

    private int minimoPuntos;
    private int cantidadRondas;

    private Dado d1;
    private Dado d2;



    public Juego2(Jugador jugador1,Jugador jugador2,int cantidadRondas,int minimoPuntos,Dado d1,Dado d2){

        this.jugador1=jugador1;
        this.jugador2=jugador2;
        this.cantidadRondas=cantidadRondas;
        this.minimoPuntos=minimoPuntos;
        this.d1=d1;
        this.d2=d2;


    }


    public Jugador ganador(){
        if(jugador1.getPuntos()>jugador2.getPuntos()){
            return jugador1;
        }
        else if (jugador2.getPuntos()>jugador1.getPuntos()){
            return jugador2;
        }
        else {
            return null;// al no haber ganador no hay nada para devolver, devuelvo null
        }
    }

    //metodo para jugar

    public Jugador jugar() {

        int puntos1 ;
        int puntos2 ;

        for (int i = 0; i < cantidadRondas; i++) {

            puntos1 = jugador1.tirarDados(d1,d2);
            puntos2 = jugador2.tirarDados(d1,d2);

            if (puntos1 > puntos2 && puntos1 >= minimoPuntos) {
                jugador1.sumarPunto();
            } else if (puntos2 > puntos1 && puntos2 >= minimoPuntos) {
                jugador2.sumarPunto();
            }
        }

        return this.ganador();
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public int getPuntosJugador1() {
        return jugador1.getPuntos();
    }

    public int getPuntosJugador2() {
        return jugador2.getPuntos();
    }
}