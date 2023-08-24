 package JuegoDados;

    public class Juego3 {

        private Jugador jugador1;
        private Jugador jugador2;

        private int minimoPuntos;
        private int cantidadRondas;

        private Cubilete cub;





        public Juego3(Jugador jugador1,Jugador jugador2,int cantidadRondas,int minimoPuntos,int cantDados,int cantCaras){

            this.jugador1=jugador1;
            this.jugador2=jugador2;
            this.cantidadRondas=cantidadRondas;
            this.minimoPuntos=minimoPuntos;
            this.cub=new Cubilete(cantDados,cantCaras);

        }


        public Juego3(Jugador jugador1,Jugador jugador2,int cantidadRondas,int minimoPuntos,Cubilete cub){

            this.jugador1=jugador1;
            this.jugador2=jugador2;
            this.cantidadRondas=cantidadRondas;
            this.minimoPuntos=minimoPuntos;
            this.cub=cub;

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

                puntos1 = jugador1.tirarDados(cub);
                puntos2 = jugador2.tirarDados(cub);

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



