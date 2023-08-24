package JuegoDados;

public class Juego1 {

    private int puntosJugador1;
    private int puntosJugador2;
    private int minimoPuntos;
    private int cantidadCaras;
    private int cantidadRondas;

    public Juego1(){
        this(7);
    }
    public Juego1(int minimoPuntos){
        this(minimoPuntos,6);
    }
    public Juego1(int minimoPuntos, int cantidadCaras){
        this(minimoPuntos,cantidadCaras,10);
    }
    public Juego1(int minimoPuntos, int cantidadCaras, int cantidadRondas){
        this.puntosJugador1=0;
        this.puntosJugador2=0;
        this.minimoPuntos=minimoPuntos;
        this.cantidadCaras=cantidadCaras;
        this.cantidadRondas=cantidadRondas;
    }



    private int tirarDado(){
        //random entre 1 y 6
        return (int)(Math.random()*cantidadCaras)+1;//casteo a entero
    }

    public String ganador(){
        if(this.puntosJugador1>this.puntosJugador2){
            return "el jugador 1 es el ganador "+ puntosJugador1 +" a " + puntosJugador2;
        }
        else if (this.puntosJugador2>this.puntosJugador1){
            return "el jugador 2 es el ganador "+ puntosJugador2 +" a " + puntosJugador1;
        }
        else {
            return "hay empate "+puntosJugador1 + " a "+ puntosJugador2;
        }
    }

    //metodo para jugar

    public String jugar() {

        int puntos1 ;
        int puntos2 ;

        for (int i = 0; i < cantidadRondas; i++) {
            puntos1 = this.tirarDado() + this.tirarDado();
            puntos2 = this.tirarDado() + this.tirarDado();
            if (puntos1 > puntos2 && puntos1 >= minimoPuntos) {
                this.puntosJugador1++;
            } else if (puntos2 > puntos1 && puntos2 >= minimoPuntos) {
                this.puntosJugador2++;
            }
        }

        return this.ganador();
    }

    public int getPuntosJugador1() {
        return puntosJugador1;
    }
    public int getPuntosJugador2() {
        return puntosJugador2;
    }
}
