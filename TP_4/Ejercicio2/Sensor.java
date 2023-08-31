package TP_4.Ejercicio2;

public class Sensor {

    private String zonaControl;
    private boolean intruso;


    public Sensor(String zonaControl){
        this.zonaControl=zonaControl;
    }

    public boolean isIntruso() {
        return intruso;
    }

    public void setIntruso(boolean intruso) {
        this.intruso = intruso;
    }

    public String getZonaControl() {
        return zonaControl;
    }

    public void setZonaControl(String zonaControl) {
        this.zonaControl = zonaControl;
    }
}
