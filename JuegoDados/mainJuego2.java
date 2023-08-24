package JuegoDados;

public class mainJuego2 {

    public static void main(String[] args) {

        Jugador j1= new Jugador("Tomás");
        Jugador j2= new Jugador("Martin");
        Dado d1= new Dado(8);
        Dado d2= new Dado();
        Juego2 juego= new Juego2(j1,j2,10,8,d1,d2);

        System.out.println(juego.jugar());

        Jugador ganador= juego.jugar();

        if(ganador!=null){
            System.out.println("el ganador es "+ ganador.getNombre());
        }else{
            System.out.println("empate");
        }

    }

}
