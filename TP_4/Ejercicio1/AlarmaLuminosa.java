package TP_4.Ejercicio1;

public class AlarmaLuminosa extends Alarma{


    private Luz luz;
    public AlarmaLuminosa(Timbre timbre,Luz luz){
        super(timbre);
        this.luz=luz;
    }

    @Override
    public void comprobar(){
        if(intruso()){
            timbre.hacerSonar();
            luz.encender();
        }
    }



}
