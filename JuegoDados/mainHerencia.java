package JuegoDados;

public class mainHerencia {

    public static void main(String[] args) {
        Dado d1= new Dado(6);
        Dado d2= new DadoCargado(6,4,0.8);


        for (int i=0;i<20;i++){

            System.out.println("d2: "+d2.tirar());

        }

    }




}
