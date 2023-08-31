package TP_4.Ejercicio1;
public class Alarma {



    private boolean puerta;
    private boolean vidrio;
    private boolean ventana;
    protected Timbre timbre;// protected para poder llamarlo en alarmaluminosa


    public boolean intruso(){
        if(puerta || vidrio || ventana) {
            return true;
        }
        return false;
    }
    public void comprobar(){
            if(this.intruso()){
                timbre.hacerSonar();
            }
    }


    public Alarma(Timbre timbre){

        this.timbre=timbre;
    }

    public boolean isPuerta() {
        return puerta;
    }

    public void setPuerta(boolean puerta) {
        this.puerta = puerta;
    }

    public boolean isVidrio() {
        return vidrio;
    }

    public void setVidrio(boolean vidrio) {
        this.vidrio = vidrio;
    }

    public boolean isVentana() {
        return ventana;
    }

    public void setVentana(boolean ventana) {
        this.ventana = ventana;
    }
}
