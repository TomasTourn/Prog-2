package TP_6.Ejercicio1;

public class Pelicula extends Item{

    private String informacionFilmografica;
    private int cantCopias;
    public Pelicula(String nombre, String descripcion, double precio,String informacionFilmografica,int cantCopias){
        super(nombre, descripcion, precio);
        this.informacionFilmografica=informacionFilmografica;
        this.cantCopias=cantCopias;
    }
    @Override
    public boolean alquilar(){
        if(estaDisponible()){
            restarCantCopias();
            return true;
        }

        return false;
    }
    @Override
    public void devolver(Item p){
        Pelicula pe = (Pelicula) p;
        if (pe.equals(this))
        sumarCantCopias();
    }
    @Override
    public boolean estaDisponible(){
       return  cantCopias>0;
    }

    public void restarCantCopias(){
        cantCopias--;
    }
    public void sumarCantCopias(){
        cantCopias++;
    }
    @Override
    public boolean equals(Object o){
        Pelicula p=(Pelicula) o;
        try {
            return super.equals(o) && p.getInformacionFilmografica().equalsIgnoreCase(this.getInformacionFilmografica());

        }catch (Exception e){
            return false;
        }
    }

    public String getInformacionFilmografica() {
        return informacionFilmografica;
    }

    public void setInformacionFilmografica(String informacionFilmografica) {
        this.informacionFilmografica = informacionFilmografica;
    }

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }
}
