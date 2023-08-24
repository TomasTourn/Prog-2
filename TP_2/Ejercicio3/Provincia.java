package TP_2.Ejercicio3;

public class Provincia {

    private String nombre;
    private Ciudad[]ciudades;
    private int HabitantesMinimos;

    public Provincia (String nombre, int cantCiudades){

        this.setNombre(nombre);
        this.setHabitantesMinimos(100000);
        this.ciudades=new Ciudad[cantCiudades];

    }

    public void agregarCiudad(Ciudad ciudad, int pos){

        if(ciudad != null && ciudades[pos]== null && pos>=0 && pos<ciudades.length){
            ciudades[pos]=ciudad;
        }
    }

    public void editarCiudad(Ciudad ciudad, int pos){

        if(ciudad != null && ciudades[pos]!= null && pos>=0 && pos<ciudades.length){
            ciudades[pos]=ciudad;
        }
    }
    //calculo si la mitad de la provincia tiene deficit, debo calcular que el control se haga a ciudades con mas de 100k de habitantes

    public boolean mitadEnDeficit(){

        int ciudadesEnDeficit=0;
        int ciudadesTotales=0;

        for (Ciudad ciudad: ciudades) {

            if(ciudad!=null){
                if (ciudad.getHabitantes()>=this.getHabitantesMinimos() && ciudad.tieneDeficit()){

                        ciudadesEnDeficit++;
                }
                ciudadesTotales++;
            }


        }
        return ciudadesEnDeficit>ciudadesTotales/2;//se podria usar length pero uso contador ya que podria haber alguna ciudad vacia

    }

    public int getHabitantesMinimos() {
        return HabitantesMinimos;
    }

    public void setHabitantesMinimos(int habitantesMinimos) {
        HabitantesMinimos = habitantesMinimos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
