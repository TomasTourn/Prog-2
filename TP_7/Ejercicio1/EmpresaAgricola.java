package TP_7.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class EmpresaAgricola {

    private List<ProductoQuimico> productosQuimicos;
    private List<Cultivo> cultivos;

    public EmpresaAgricola(){
        this.productosQuimicos=new ArrayList<>();
        this.cultivos=new ArrayList<>();
    }

    public List<ProductoQuimico> buscar(Buscar b){

        List<ProductoQuimico> productosRecomendados=new ArrayList<>();

        for (ProductoQuimico p:productosQuimicos) {
            if(b.cumple(p)){
                productosRecomendados.add(p);
            }
        }
        return productosRecomendados;
    }
    public void addCultivo(Cultivo c){
        if(c!=null && !cultivos.contains(c)){
            cultivos.add(c);
        }
    }

    public void addProducto(ProductoQuimico p){
        if(p!=null && !productosQuimicos.contains(p)){
            productosQuimicos.add(p);
        }
    }



}
